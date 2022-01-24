package by.yahimovich.task4ooprepository.view.dao.txt;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtDAO<T> extends AbstractTxt<T> {

    public TxtDAO(Class<T> type) {
        super(type);
    }

    @Override
    public Pyramid read(String fileName) throws FileNotFoundException, PyramidException {
        List<T> points = new ArrayList<>();
        List<T> pyramids = new ArrayList<>();
        String str;
        Scanner scanner = new Scanner(new File(fileName));
        if (scanner.next().equals("Pyramid")) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    points.add((T) new Point3DClass(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
                } else if (!scanner.hasNextDouble()) {
                    str = scanner.nextLine();
                }
            }
        }
        return new Pyramid(new PyramidID(1), (List<Point3DClass>) points);

    }

    @Override
    public void write(List<T> list, String fileName) {
        try {
            Pyramid pyramid = new CreatePyramid().create();
            ObjectOutputStream stream = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)
                    )
            );
            stream.writeObject(pyramid);
            stream.close();
        } catch (IOException | PyramidException e) {
            e.printStackTrace();
        }
    }
}
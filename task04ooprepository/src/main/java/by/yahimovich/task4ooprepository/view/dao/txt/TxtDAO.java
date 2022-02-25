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

/**
 * Txt DAO.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */


public class TxtDAO<T> extends AbstractTxt<T> {

    /**
     * Constructor - create new object.
     *
     * @param type Class type.
     */

    public TxtDAO(Class<T> type) {
        super(type);
    }

    /**
     * Method read.
     *
     * @return list of objects from file.
     */

    @Override
    public Pyramid read(String fileName) throws FileNotFoundException {
        List<Point3DClass> points = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));
        if (scanner.next().equals("Pyramid")) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    points.add((
                            new Point3DClass(
                                    scanner.nextDouble(),
                                    scanner.nextDouble(),
                                    scanner.nextDouble()))
                    );
                }
            }
        }
        return new Pyramid(new PyramidID(1), points);
    }

    /**
     * Method write.
     * Writes list of objects to file.
     */

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

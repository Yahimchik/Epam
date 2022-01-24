import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;
import by.yahimovich.task4ooprepository.service.PyramidService;
import by.yahimovich.task4ooprepository.view.dao.txt.TxtDAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PyramidException, RepositoryException, IOException, ClassNotFoundException {
        System.out.println(new Point3DClass(2, 3, 3));
        System.out.println(new Point3DClass(12, 3, 3).hashCode());

        ArrayPyramidRepository repository = new ArrayPyramidRepository();

        Pyramid pyramid = new CreatePyramid().create();
        repository.save(pyramid);


        List<Point3DClass> points = new ArrayList<>();
        points.add(new Point3DClass(0, 0, 0));
        points.add(new Point3DClass(3, 0, 0));
        points.add(new Point3DClass(0, 4, 0));
        points.add(new Point3DClass(2, 3, 3));
        System.out.println(points);
        List<Pyramid> pyramids = new ArrayList<>();
        pyramids.add(new Pyramid(new PyramidID(2), points));
        System.out.println(pyramids);
        System.out.println(repository.findByID(new PyramidID(1)));
        repository.delete(new PyramidID(1));
//        System.out.println(repository.getPyramidList());
        System.out.println(new PyramidService().pyramidVolume(pyramid));
        repository.update(pyramid);
        TxtDAO<Pyramid> txtDAO = new TxtDAO<>(Pyramid.class);
        Pyramid point3DClasses = txtDAO.read("example.txt");
        System.out.println(point3DClasses);
        repository.save(point3DClasses);
        System.out.println(new PyramidService().isPyramid(point3DClasses));
        System.out.println(new PyramidService().triangulationPyramid(pyramid));
    }
}

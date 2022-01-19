import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;
import by.yahimovich.task4ooprepository.service.PyramidService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws PyramidException, RepositoryException, IOException {
        System.out.println(new Point3DClass(2, 3, 3));
        System.out.println(new Point3DClass(12, 3, 3).hashCode());

        ArrayPyramidRepository repository = new ArrayPyramidRepository();

        Pyramid pyramid = new CreatePyramid().create();
        repository.save(pyramid);


        System.out.println(repository.findByID(new PyramidID(1)));
        repository.delete(new PyramidID(1));
//        System.out.println(repository.getPyramidList());
        System.out.println(new PyramidService().pyramidVolume(pyramid));

    }
}

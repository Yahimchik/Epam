package by.yahimovich.task4ooprepository.entity.pyramidfactory;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.util.List;

public class CreatePyramid implements CreatePyramidInterface {

    List<Point3DClass> point3DS;

    @Override
    public Pyramid create() throws PyramidException {
        return new Pyramid(
                new PyramidID(1),
                point3DS = List.of(
                        new Point3DClass(0, 0, 0),
                        new Point3DClass(0, 3, 0),
                        new Point3DClass(4, 0, 0),
                        new Point3DClass(4, 3, 0),
                        new Point3DClass(3, 6, 0),
                        new Point3DClass(1, 6, 0),
                        new Point3DClass(4, 10, 2)
                )
        );
    }
}

package by.yahimovich.task4ooprepository.entity.pyramidfactory;

import by.yahimovich.task4ooprepository.entity.Point;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.util.List;

public class CreatePyramid implements CreatePyramidInterface {

    List<Point> points;

    @Override
    public Pyramid create() throws PyramidException {
        return new Pyramid(
                points = List.of(
                        new Point(0, 0, 0),
                        new Point(3, 3, -2),
                        new Point(6, 3, -2),
                        new Point(4, 10, 0)
                )
        );
    }
}

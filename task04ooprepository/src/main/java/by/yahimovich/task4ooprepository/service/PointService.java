package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Point3DClass;

/**
 * Point service class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Point3DClass
 */

public class PointService {

    /**
     * Method sideLength.
     *
     * @return length of the figure side.
     */

    public double sideLength(Point3DClass point1, Point3DClass point2) {
        return Math.sqrt(
                Math.pow(Math.abs(point1.getX() - point2.getX()), 2)
                        + Math.pow(Math.abs(point1.getY() - point2.getY()), 2)
                        + Math.pow(Math.abs(point1.getZ() - point2.getZ()), 2)
        );
    }
}

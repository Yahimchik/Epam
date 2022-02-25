package by.yahimovich.task4ooprepository.controller.impl;

import by.yahimovich.task4ooprepository.controller.CommandInterface;
import by.yahimovich.task4ooprepository.entity.Point2DClass;
import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.service.PointService;

/**
 * Side length command
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see CommandInterface
 * @see PointService
 * @see Point3DClass
 * @see Point2DClass
 */

public class SideLengthCommand implements CommandInterface {

    private final PointService service;
    private final Point3DClass point1;
    private final Point3DClass point2;

    /**
     * Constructor - create new object this parameter.
     *
     * @param service Take object of PointService class.
     * @param point1  Take first point
     * @param point2  Take second point
     */


    public SideLengthCommand(PointService service, Point3DClass point1, Point3DClass point2) {
        this.service = service;
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Override method execute.
     * Output side length of figure.
     */

    @Override
    public void execute() {
        System.out.println(service.sideLength(point1, point2));
    }
}

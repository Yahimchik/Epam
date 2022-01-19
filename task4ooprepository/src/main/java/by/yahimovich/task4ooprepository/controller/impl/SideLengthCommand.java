package by.yahimovich.task4ooprepository.controller.impl;

import by.yahimovich.task4ooprepository.controller.CommandInterface;
import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.service.PointService;

/**
 *
 */
public class SideLengthCommand implements CommandInterface {

    private final PointService service;
    private final Point3DClass point1;
    private final Point3DClass point2;

    public SideLengthCommand(PointService service, Point3DClass point1, Point3DClass point2) {
        this.service = service;
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void execute() {
        System.out.println(service.sideLength(point1, point2));
    }
}

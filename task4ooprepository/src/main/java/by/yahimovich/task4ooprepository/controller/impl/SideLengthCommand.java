package by.yahimovich.task4ooprepository.controller.impl;

import by.yahimovich.task4ooprepository.controller.CommandInterface;
import by.yahimovich.task4ooprepository.entity.Point;
import by.yahimovich.task4ooprepository.service.PointService;

/**
 *
 */
public class SideLengthCommand implements CommandInterface {

    private final PointService service;
    private final Point point;

    public SideLengthCommand(PointService service, Point point) {
        this.service = service;
        this.point = point;
    }

    @Override
    public void execute() {
        System.out.println(service.sideLength(point));
    }
}

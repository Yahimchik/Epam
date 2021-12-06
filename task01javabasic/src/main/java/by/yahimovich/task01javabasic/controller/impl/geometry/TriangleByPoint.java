package by.yahimovich.task01javabasic.controller.impl.geometry;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Point;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class TriangleByPoint implements Command {

    private final GeometryService service;
    private final List<Point> points;

    public TriangleByPoint(GeometryService service, List<Point> points) {
        this.service = service;
        this.points = points;
    }

    @Override
    public void execute() {

        double sideLength1;
        double sideLength2;
        double sideLength3;

        sideLength1 = service.sideLength(points.get(0).getX(), points.get(0).getY(),
                points.get(1).getX(), points.get(1).getY());
        sideLength2 = service.sideLength(points.get(0).getX(), points.get(0).getY(),
                points.get(2).getX(), points.get(2).getY());
        sideLength3 = service.sideLength(points.get(1).getX(), points.get(1).getY(),
                points.get(2).getX(), points.get(2).getY());

        double perimeter = service.perimeter(sideLength1, sideLength2, sideLength3);
        double height = service.height(sideLength1, sideLength2, sideLength3);
        double square = service.square(sideLength1, height);

        System.out.println("Perimeter: " + perimeter + "\nSquare: " + square);
    }

}

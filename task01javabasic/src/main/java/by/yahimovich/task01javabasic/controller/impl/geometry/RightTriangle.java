package by.yahimovich.task01javabasic.controller.impl.geometry;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class RightTriangle implements Command {

    private final GeometryService service;
    private final List<Double> list;

    public RightTriangle(GeometryService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        double hypotenuse = service.hypotenuse(list.get(0), list.get(1));
        double perimeter = service.perimeter(list.get(0), list.get(1), hypotenuse);
        double square = service.square(list.get(0), list.get(1));

        System.out.println("Perimeter: " + perimeter + "\nSquare: " + square);
    }

}

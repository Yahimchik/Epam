package by.yahimovich.task01javabasic.controller.impl.geometry;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class MaxTriangle implements Command {

    private final ArithmeticService service;
    private final GeometryService geometryService;
    private final List<Double> list;

    public MaxTriangle(ArithmeticService service, GeometryService geometryService, List<Double> list) {
        this.service = service;
        this.geometryService = geometryService;
        this.list = list;
    }

    @Override
    public void execute() {
        double height1 = geometryService.height(list.get(0), list.get(1), list.get(2));
        double height2 = geometryService.height(list.get(3), list.get(4), list.get(5));

        double squareFirst = geometryService.square(height1, list.get(0));
        double squareSecond = geometryService.square(height2, list.get(3));

        System.out.println("Max square from " + squareFirst + " & " + squareSecond + "is: "
                + service.max(squareFirst, squareSecond));
    }
}

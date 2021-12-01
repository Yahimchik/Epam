package by.yahimovich.task01javabasic.controller.impl.geometry;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.List;

public class MaxTriangle implements Command {
    @Override
    public double exec(Data newData) {
        ArithmeticService service = new ArithmeticService();
        GeometryService geometryService = new GeometryService();

        double height1 = geometryService.height(newData.getData(0), newData.getData(1), newData.getData(2));
        double height2 = geometryService.height(newData.getData(3), newData.getData(4), newData.getData(5));

        double squareFirst = geometryService.square(height1, newData.getData(0));
        double squareSecond = geometryService.square(height2, newData.getData(3));

        return service.max(squareFirst, squareSecond);
    }

    @Override
    public List<Double> execution(Data newData) {
        return null;
    }

    @Override
    public String execute(Data newData) {
        return null;
    }
}

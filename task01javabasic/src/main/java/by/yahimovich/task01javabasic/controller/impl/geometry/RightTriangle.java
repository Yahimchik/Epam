package by.yahimovich.task01javabasic.controller.impl.geometry;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.ArrayList;
import java.util.List;

public class RightTriangle implements Command {
    @Override
    public double exec(Data newData) {
        return 0;
    }

    @Override
    public List<Double> execution(Data newData) {
        GeometryService service = new GeometryService();

        double hypotenuse = service.hypotenuse(newData.getData(0), newData.getData(1));
        double perimeter = service.perimeter(newData.getData(0), newData.getData(1), hypotenuse);
        double square = service.square(newData.getData(0), newData.getData(1));

        List<Double> list = new ArrayList<>();
        list.add(perimeter);
        list.add(square);

        return list;
    }

    @Override
    public String execute(Data newData) {
        return null;
    }
}

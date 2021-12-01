package by.yahimovich.task01javabasic.controller.impl.geometry;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.ArrayList;
import java.util.List;

public class TriangleByPoint implements Command {
    @Override
    public double exec(Data newData) {
        return 0;
    }

    @Override
    public List<Double> execution(Data newData) {
        GeometryService service = new GeometryService();
        List<Double> list = new ArrayList<>();

        double sideLength1;
        double sideLength2;
        double sideLength3;

        sideLength1 = service.sideLength(newData.getData(0), newData.getData(1),
                newData.getData(2), newData.getData(3));

        sideLength2 = service.sideLength(newData.getData(0), newData.getData(1),
                newData.getData(4), newData.getData(5));

        sideLength3 = service.sideLength(newData.getData(4), newData.getData(5),
                newData.getData(2), newData.getData(3));

        double perimeter = service.perimeter(sideLength1, sideLength2, sideLength3);
        double height = service.height(sideLength1, sideLength2, sideLength3);
        double square = service.square(sideLength1, height);

        list.add(perimeter);
        list.add(square);

        return list;
    }

    @Override
    public String execute(Data newData) {
        return null;
    }
}

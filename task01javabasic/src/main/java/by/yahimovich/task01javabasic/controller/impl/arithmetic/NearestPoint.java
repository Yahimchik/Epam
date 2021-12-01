package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.List;

public class NearestPoint implements Command {
    @Override
    public double exec(Data newData) {
        return 0;
    }

    @Override
    public List<Double> execution(Data newData) {
        return null;
    }

    @Override
    public String execute(Data newData) {
        GeometryService service = new GeometryService();
        ArithmeticService arithmeticService = new ArithmeticService();

        String str;

        double section1 = service.sideLength(newData.getData(0), newData.getData(1), 0, 0);
        double section2 = service.sideLength(newData.getData(2), newData.getData(3), 0, 0);
        double res = arithmeticService.min(section1, section2);

        if (res == section1 && res == section2) {
            str = "Points are at the same distance.\n";
        } else if (res == section1) {
            str = "First point is closer (" + newData.getData(0) + ", " + newData.getData(1) + ")\n";
        } else {
            str = "Second point is closer (" + newData.getData(2) + ", " + newData.getData(3) + ")\n";
        }

        return str;
    }
}

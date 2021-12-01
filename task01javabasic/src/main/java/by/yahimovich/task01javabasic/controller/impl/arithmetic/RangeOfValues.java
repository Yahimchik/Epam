package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

public class RangeOfValues implements Command {
    @Override
    public double exec(Data newData) {
        ArithmeticService service = new ArithmeticService();
        double result;
        if (newData.getData(0) >= 8) {
            result = (-1) * (service.degree(newData.getData(0), 2)) + newData.getData(0) - 9;
        } else {
            result = service.division(1, service.degree(newData.getData(0), 4) - 6);
        }
        return result;
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

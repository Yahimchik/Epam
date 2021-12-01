package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

public class DifferenceOfCubes implements Command {
    @Override
    public double exec(Data newData) {
        ArithmeticService service = new ArithmeticService();
        double result = 0;
        for (int i = 200; i >= 0; i--) {
            result -= service.degree(i, 3);
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

package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

public class EquationValue implements Command {
    @Override
    public double exec(Data newData) {
        double x = newData.getData(0);
        return x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;
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

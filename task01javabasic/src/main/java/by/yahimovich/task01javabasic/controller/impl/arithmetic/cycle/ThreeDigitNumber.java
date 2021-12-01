package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;

import java.util.List;

public class ThreeDigitNumber implements Command {
    @Override
    public double exec(Data newData) {
        double x = newData.getData(0) % 10;
        double y = (newData.getData(0) / 10) % 10;

        return (10 * y + x) * 7;
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

package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;

import java.util.List;

public class ValueTable implements Command {
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
        double y;
        for (double i = -5; i <= 5; i += 0.5) {
            y = 5 - (i * i) / 2.0;
            System.out.printf("Then х = %s, y = %s\n", i, y);

        }
        return "";
    }
}

package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;

import java.util.ArrayList;
import java.util.List;

public class Divider implements Command {
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
        double m = newData.getData(0);
        double n = newData.getData(1);

        for (double i = m; i < n; i++) {
            System.out.print("Number " + i + ": ");
            for (double j = 2; j < i - 1; j++) {
                if (i % j == 0) {

                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        return "";
    }
}

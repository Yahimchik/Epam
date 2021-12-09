package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class ValueTable implements Command {

    private final ArithmeticService service;
    private final List<Double> list;

    public ValueTable(ArithmeticService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        double y;
        for (double i = list.get(0); i <= list.get(1); i += 0.5) {
            y = 5 - (i * i) / 2.0;
            System.out.printf("Then х = %s, y = %s\n", i, y);
        }
    }
}

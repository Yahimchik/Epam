package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class DifferenceOfCubes implements Command {
    private final ArithmeticService service;
    private final double value;

    public DifferenceOfCubes(ArithmeticService service, double value) {
        this.service = service;
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println(service.differenceOfCubes(value));
    }
}

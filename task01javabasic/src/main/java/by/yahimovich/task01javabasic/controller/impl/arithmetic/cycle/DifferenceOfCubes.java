package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class DifferenceOfCubes implements Command {
    ArithmeticService service;

    public DifferenceOfCubes(ArithmeticService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        double result = 0;
        for (int i = 200; i >= 0; i--) {
            result -= service.power(i, 3);
        }
        System.out.println("Result: " + result);
    }
}

package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class RangeOfValues implements Command {

    private final ArithmeticService service;
    private final double value;

    public RangeOfValues(ArithmeticService service, double value) {
        this.service = service;
        this.value = value;
    }

    @Override
    public void execute() {
        if (value >= 8) {
            System.out.println("Result: " + ((-1) * (service.power(value, 2)) + value - 9));
        } else {
            System.out.println("Result: " + (service.division(1, (service.power(value, 4) - 6))));
        }
    }
}

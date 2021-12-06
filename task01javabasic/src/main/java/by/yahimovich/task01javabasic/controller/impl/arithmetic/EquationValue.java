package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class EquationValue implements Command {

    private final double value;

    public EquationValue(double value) {
        this.value = value;
    }

    @Override
    public void execute() {
        double x = value;
        System.out.println("Calculating result: " + (x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6));
    }
}

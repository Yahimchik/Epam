package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class ThreeDigitNumber implements Command {

    private final double value;

    public ThreeDigitNumber(double value) {
        this.value = value;
    }

    @Override
    public void execute() {
        double x = value % 10;
        double y = (value / 10) % 10;
        System.out.println("Your number: " + ((10 * y + x) * 7));
    }
}

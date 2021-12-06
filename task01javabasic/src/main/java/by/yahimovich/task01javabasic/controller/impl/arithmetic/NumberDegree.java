package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class NumberDegree implements Command {

    private final double value;

    public NumberDegree(double value) {
        this.value = value;
    }

    @Override
    public void execute() {

        double a2 = value * value;
        double a4 = a2 * a2;

        double a8 = a4 * a4;
        double a10 = a8 * a2;

        System.out.println("8th power: " + a8 + "\n10th power: " + a10);
    }

}

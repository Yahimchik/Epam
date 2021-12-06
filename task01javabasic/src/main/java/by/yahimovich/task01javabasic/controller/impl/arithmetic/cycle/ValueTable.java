package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class ValueTable implements Command {
    @Override
    public void execute() {
        double y;
        for (double i = -5; i <= 5; i += 0.5) {
            y = 5 - (i * i) / 2.0;
            System.out.printf("Then х = %s, y = %s\n", i, y);

        }
    }
}

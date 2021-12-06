package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;

import java.util.List;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class Divider implements Command {

    private List<Double> list;

    public Divider(List<Double> list) {
        this.list = list;
    }

    @Override
    public void execute() {
        for (double i = list.get(0); i < list.get(1); i++) {
            System.out.print("Number " + i + ": ");
            for (double j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

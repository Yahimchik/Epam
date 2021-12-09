package by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

/**
 * @author Egor yahimovich
 * @version 1.0
 * @see Command
 */

public class Divider implements Command {

    private ArithmeticService service;
    private List<Double> list;

    public Divider(ArithmeticService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        service.divider(list.get(0), list.get(1));
    }
}

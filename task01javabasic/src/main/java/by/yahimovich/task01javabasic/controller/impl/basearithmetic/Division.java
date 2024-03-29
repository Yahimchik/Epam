package by.yahimovich.task01javabasic.controller.impl.basearithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

/**
 * @author Egor YAhimovich
 * @version 1.0
 * @see Command
 */

public class Division implements Command {

    private final ArithmeticService service;
    private final List<Double> list;

    public Division(ArithmeticService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        System.out.println(service.division(list.get(0), list.get(1)));
    }

}

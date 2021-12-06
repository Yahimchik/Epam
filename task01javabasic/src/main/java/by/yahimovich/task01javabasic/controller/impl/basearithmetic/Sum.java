package by.yahimovich.task01javabasic.controller.impl.basearithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class Sum implements Command {

    private ArithmeticService service;
    private List<Double> list;

    public Sum(ArithmeticService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    public void execute() {
        System.out.println(service.sum(list.get(0), list.get(1)));
    }
}

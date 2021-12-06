package by.yahimovich.task01javabasic.controller.impl.basearithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class Sub implements Command {

    private final ArithmeticService service;
    private final List<Double> list;

    public Sub(ArithmeticService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    public void execute() {
        System.out.println(service.sub(list.get(0), list.get(1)));
    }

}

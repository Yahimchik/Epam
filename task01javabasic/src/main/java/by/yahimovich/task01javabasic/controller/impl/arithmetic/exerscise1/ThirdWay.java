package by.yahimovich.task01javabasic.controller.impl.arithmetic.exerscise1;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

public class ThirdWay implements Command {

    private final ArithmeticService service;
    private final List<Double> list;

    public ThirdWay(ArithmeticService service, List<Double> list) {
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        System.out.println("After changes: " + (service.changeNumbersThird(list.get(0), list.get(1))));
    }

}

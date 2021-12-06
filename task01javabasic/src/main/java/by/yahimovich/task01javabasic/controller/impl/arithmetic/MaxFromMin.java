package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class MaxFromMin implements Command {

    private List<Double> list;

    public MaxFromMin(List<Double> list) {
        this.list = list;
    }

    @Override
    public void execute() {
        ArithmeticService service = new ArithmeticService();
        System.out.println("Max value from min: " + (service.max(service.min(list.get(0), list.get(1)),
                service.min(list.get(2), list.get(2)))));
    }
}

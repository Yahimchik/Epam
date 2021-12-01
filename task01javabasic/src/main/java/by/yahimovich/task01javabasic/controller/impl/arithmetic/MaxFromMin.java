package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.List;

public class MaxFromMin implements Command {
    @Override
    public double exec(Data newData) {
        ArithmeticService service = new ArithmeticService();
        return service.max(service.min(newData.getData(0), newData.getData(1)),
                service.min(newData.getData(2), newData.getData(3)));
    }

    @Override
    public List<Double> execution(Data newData) {
        return null;
    }

    @Override
    public String execute(Data newData) {
        return null;
    }
}

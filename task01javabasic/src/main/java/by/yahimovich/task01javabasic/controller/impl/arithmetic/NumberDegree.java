package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.ArithmeticService;

import java.util.ArrayList;
import java.util.List;

public class NumberDegree implements Command {
    @Override
    public double exec(Data newData) {
        return 0;
    }

    @Override
    public List<Double> execution(Data newData) {
        double a2 = newData.getData(0) * newData.getData(0);
        double a4 = a2 * a2;

        double a8 = a4 * a4;
        double a10 = a8 * a2;

        List<Double> list = new ArrayList<>();

        list.add(a8);
        list.add(a10);

        return list;
    }

    @Override
    public String execute(Data newData) {
        return null;
    }

}

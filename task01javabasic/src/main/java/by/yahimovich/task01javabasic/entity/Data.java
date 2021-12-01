package by.yahimovich.task01javabasic.entity;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private final List<Double> list = new ArrayList<>();

    public Double getData(int i) {
        return list.get(i);
    }

    public void push(double value) {
        list.add(value);
    }

    public void removeAll() {
        if (list.size() > 0) {
            list.subList(0, list.size()).clear();
        }
    }
}

package by.yahimovich.task01javabasic.controller;

import by.yahimovich.task01javabasic.entity.Data;

import java.util.List;

public interface Command {
    double exec(Data newData);
    List<Double> execution(Data newData);
    String execute(Data newData);
}

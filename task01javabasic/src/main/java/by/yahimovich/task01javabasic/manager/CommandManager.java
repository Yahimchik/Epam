package by.yahimovich.task01javabasic.manager;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.*;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle.*;
import by.yahimovich.task01javabasic.controller.impl.geometry.MaxTriangle;
import by.yahimovich.task01javabasic.controller.impl.geometry.RightTriangle;
import by.yahimovich.task01javabasic.controller.impl.geometry.TriangleByPoint;
import by.yahimovich.task01javabasic.controller.impl.sensor.FireSensor;

public class CommandManager {
    private Command command;

    public Command getCommand(int choice) {
        switch (choice) {
            case 1 -> command = new RightTriangle();
            case 2 -> command = new TriangleByPoint();
            case 3 -> command = new Root();
            case 4 -> command = new NumberDegree();
            case 5 -> command = new EquationValue();
            case 6 -> command = new MaxTriangle();
            case 7 -> command = new NearestPoint();
            case 8 -> command = new FireSensor();
            case 9 -> command = new MaxFromMin();
            case 10 -> command = new RangeOfValues();
            case 11 -> command = new DifferenceOfCubes();
            case 12 -> command = new ValueTable();
            case 13 -> command = new Factorial();
            case 14 -> command = new Divider();
            case 15 -> command = new ThreeDigitNumber();
        }
        return command;
    }
}

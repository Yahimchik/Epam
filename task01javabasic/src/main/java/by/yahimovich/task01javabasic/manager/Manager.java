package by.yahimovich.task01javabasic.manager;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.entity.Point;
import by.yahimovich.task01javabasic.view.IoData;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    Data data = new Data();
    IoData ioData = new IoData();

    public void test() {

        CommandManager commandManager = new CommandManager();

        ioData.output("""
                ------------------------------------------------------------------------------------------
                1. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
                2. Заданы координаты трех вершин треугольника (х1 у1),(х2, у2),(х3, у3). Найти его периметр и площадь.
                3. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с.
                4. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три.
                   операции и а10 за четыре операции.
                5. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
                   сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
                6. Составить программу, которая определит площадь какого треугольника больше.
                7. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к\s
                   началу координат.
                8. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение\s
                   «Пожароопасная ситуация », если температура в комнате превысила 60° С.
                9. Найти max{min(a, b), min(c, d)}.
                10. Вычислить значение функции.
                ------------------------------------------------------------------------------------------
                """);

        while (true) {

            ioData.output("\nEnter number of menu: ");
            int choice = ioData.intInput();

            if (choice == 0) {
                ioData.output("Exit...");
                break;
            }

            Command command;
            switch (choice) {
                case 1 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter a & b: ");
                    pushData(2);
                    ioData.output("Perimeter -> Square: ", (command.execution(data)));
                    data.removeAll();
                }
                case 2 -> {
                    command = commandManager.getCommand(choice);
                    addPointToData(createPoint(3));
                    ioData.output("Perimeter -> Square: ", command.execution(data));
                    data.removeAll();
                }
                case 3 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter values a -> b -> c: ");
                    pushData(3);
                    ioData.output("Roots = ", command.execution(data));
                    data.removeAll();
                }
                case 4 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter value of a: ");
                    pushData(1);
                    ioData.output("Result = ", command.execution(data));
                    data.removeAll();
                }
                case 5 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter value x: ");
                    pushData(1);
                    ioData.output("Result = ", command.exec(data));
                    data.removeAll();
                }
                case 6 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter value of sides: ");
                    pushData(6);
                    ioData.output("Max square: ", command.exec(data));
                    data.removeAll();
                }
                case 7 -> {
                    command = commandManager.getCommand(choice);
                    addPointToData(createPoint(2));
                    ioData.output(command.execute(data));
                    data.removeAll();
                }
                case 8 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter temperature in °С: ");
                    pushData(1);
                    ioData.output("Fire sensor work result: " + command.execute(data));
                    data.removeAll();
                }
                case 9 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter a -> b -> c -> d: ");
                    pushData(4);
                    ioData.output("Max from min: ", command.exec(data));
                    data.removeAll();
                }
                case 10 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter x: ");
                    pushData(1);
                    ioData.output("Function value: ", command.exec(data));
                    data.removeAll();
                }
                case 11 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Difference of cubes of the first 200 numbers: ", command.exec(data));
                }
                case 12 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output(command.execute(data));
                }
                case 13 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter number: ");
                    data.push(ioData.input());
                    ioData.output("Factorial: ", command.exec(data));
                    data.removeAll();
                }
                case 14 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter a gap: ");
                    pushData(2);
                    ioData.output(command.execute(data));
                    data.removeAll();
                }
                case 15 -> {
                    command = commandManager.getCommand(choice);
                    ioData.output("Enter number: ");
                    pushData(1);
                    ioData.output("Result: ", command.exec(data));
                    data.removeAll();
                }
                default -> ioData.output("Try again: ");
            }
        }
    }

    public void addPointToData(List<Point> list) {
        for (Point value : list) {
            data.push(value.getX());
            data.push(value.getY());
        }
    }

    public void pushData(int index) {
        for (int i = 0; i < index; i++) {
            data.push(ioData.input());
        }
    }

    public List<Point> createPoint(int index) {
        Point point;
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            ioData.output("Enter " + (i + 1) + " point: ");
            point = new Point(ioData.input(), ioData.input());
            list.add(point);
        }
        return list;
    }
}

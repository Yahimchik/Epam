package by.yahimovich.task01javabasic.manager;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.controller.Runner;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.*;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.cycle.*;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.exerscise1.FirstWay;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.exerscise1.SecondWay;
import by.yahimovich.task01javabasic.controller.impl.arithmetic.exerscise1.ThirdWay;
import by.yahimovich.task01javabasic.controller.impl.geometry.MaxTriangle;
import by.yahimovich.task01javabasic.controller.impl.geometry.RightTriangle;
import by.yahimovich.task01javabasic.controller.impl.geometry.TriangleByPoint;
import by.yahimovich.task01javabasic.controller.impl.sensor.FireSensor;
import by.yahimovich.task01javabasic.entity.Point;
import by.yahimovich.task01javabasic.service.ArithmeticService;
import by.yahimovich.task01javabasic.service.GeometryService;
import by.yahimovich.task01javabasic.service.SensorService;
import by.yahimovich.task01javabasic.view.IoData;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Manager {

    public static final Logger LOGGER = LogManager.getLogger(Runner.class);
    IoData ioData = new IoData();

    /**
     * This method gives opportunity for user to chose function that hi want to calculate
     *
     * @see Command
     * @see CommandManager
     * @see IoData
     */

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
                11. Составить программу нахождения разности кубов первых двухсот чисел.
                12. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
                13. Требуется определить факториал числа, которое ввел пользователь.
                14. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
                    самого числа. m и n вводятся с клавиатуры.
                15. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
                    получили исходное число. Найти это число.
                16. Change numbers this using supplemented variable.
                17. Change numbers this using arithmetic methods.
                18. Change numbers this using logical methods.
                ------------------------------------------------------------------------------------------
                """);


        while (true) {

            ioData.output("\nEnter number of menu: ");
            int choice = ioData.intInput();

            if (choice == 0) {
                break;
            }

            LOGGER.log(Level.TRACE, "Your choice: " + choice);

            switch (choice) {
                case 1 -> {
                    ioData.output("Perimeter and Square of right triangle:\n");
                    List<Double> list = inputValues(2);
                    commandManager.executeOperation(new RightTriangle(new GeometryService(), list));
                }
                case 2 -> {
                    ioData.output("Perimeter and Square of triangle by points:\n");
                    commandManager.executeOperation(new TriangleByPoint(new GeometryService(),
                            createPoint(3)));
                }
                case 3 -> {
                    ioData.output("Roots of quadratic equation:\n");
                    List<Double> list = inputValues(3);
                    commandManager.executeOperation(new Root(new ArithmeticService(), list));
                }
                case 4 -> {
                    ioData.output("Enter value to raise it to the power 8th & 10th: ");
                    double value = ioData.input();
                    commandManager.executeOperation(new NumberDegree(value));
                }
                case 5 -> {
                    ioData.output("Enter value x to calculate result of equation: ");
                    double value = ioData.input();
                    commandManager.executeOperation(new EquationValue(value));
                }
                case 6 -> {
                    ioData.output("Which area of the triangle is greater:\n");
                    List<Double> list = inputValues(6);
                    commandManager.executeOperation(new MaxTriangle(new ArithmeticService(),
                            new GeometryService(), list));
                }
                case 7 -> {
                    ioData.output("Which point is closer to (0,0):\n");
                    commandManager.executeOperation(new NearestPoint(new GeometryService(),
                            new ArithmeticService(), createPoint(2)));
                }
                case 8 -> {
                    ioData.output("Emulator if fire-sensor. Enter temperature in °С: ");
                    double temperature = ioData.input();
                    commandManager.executeOperation(new FireSensor(new SensorService(), temperature));
                }
                case 9 -> {
                    ioData.output("Max from min:\n");
                    List<Double> list = inputValues(4);
                    commandManager.executeOperation(new MaxFromMin(list));
                }
                case 10 -> {
                    ioData.output("Calculate result of the function when x >= 8 & x < 8: ");
                    double value = ioData.input();
                    commandManager.executeOperation(new RangeOfValues(new ArithmeticService(), value));
                }
                case 11 -> {
                    ioData.output("Differences of cubes of the first 200 numbers:\n");
                    commandManager.executeOperation(new DifferenceOfCubes(new ArithmeticService()));
                }
                case 12 -> {
                    ioData.output("Table of values of function:\n");
                    commandManager.executeOperation(new ValueTable());
                }
                case 13 -> {
                    ioData.output("Enter the factorial number you want to calculate: ");
                    double value = ioData.input();
                    commandManager.executeOperation(new Factorial(new ArithmeticService(), value));
                }
                case 14 -> {
                    ioData.output("Dividers from gap:\n");
                    List<Double> list = inputValues(2);
                    commandManager.executeOperation(new Divider(list));
                }
                case 15 -> {
                    ioData.output("Enter three-digit number: ");
                    double value = ioData.input();
                    commandManager.executeOperation(new ThreeDigitNumber(value));
                }
                case 16 -> {
                    ioData.output("Change numbers this using supplemented variable:\n");
                    List<Double> list = inputValues(2);
                    commandManager.executeOperation(new FirstWay(new ArithmeticService(), list));
                }
                case 17 -> {
                    ioData.output("Change numbers this using arithmetic methods:\n");
                    List<Double> list = inputValues(2);
                    commandManager.executeOperation(new SecondWay(new ArithmeticService(), list));
                }
                case 18 -> {
                    ioData.output("Change numbers this using logical methods:\n");
                    List<Double> list = inputValues(2);
                    commandManager.executeOperation(new ThirdWay(new ArithmeticService(), list));
                }
                default -> ioData.output("Try again: ");
            }
        }
    }

    /**
     * This method create points in quantity of count
     *
     * @param count - Add points in quantity of count
     * @return List<Point>. Returns list of points
     */

    public List<Point> createPoint(int count) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ioData.output("Enter" + " point " + (i + 1) + ": ");
            list.add(new Point(ioData.input(), ioData.input()));
        }
        return list;
    }

    public List<Double> inputValues(int count) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ioData.output("Enter value " + (i + 1) + ": ");
            list.add(ioData.input());
        }
        return list;
    }
}
package by.yahimovich.task01javabasic.service;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticService {
    public double sum(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        double result;
        if (y > 0) {
            result = x / y;
        } else {
            result = 0;
        }
        return result;
    }

    public double degree(double value, double degree) {
        return Math.pow(value, degree);
    }

    public double sqrt(double value) {
        return Math.sqrt(value);
    }

    public double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public List<Double> root(double a, double b, double c) {
        ArithmeticService service = new ArithmeticService();
        List<Double> list = new ArrayList<>();

        double D = service.discriminant(a, b, c);
        if (D > 0) {
            double x1, x2;

            x1 = (-b - service.sqrt(D)) / (2 * a);
            x2 = (-b + service.sqrt(D)) / (2 * a);

            list.add(x1);
            list.add(x2);

            return list;

        } else if (D == 0) {
            double x;

            x = -b / (2 * a);

            list.add(x);
            return list;
        }

        return null;
    }

    public double max(double a, double b) {
        double result;
        if (a > b) {
            result = a;
            return result;
        } else {
            result = b;
        }
        return result;
    }

    public double min(double a, double b) {
        double result;
        if (a < b) {
            result = a;
            return result;
        } else {
            result = b;
        }
        return result;
    }

    public double factorial(double value) {
        double res = value;
        for (int i = 1; i < res; i++) {
            value *= i;
        }
        return value;
    }
}

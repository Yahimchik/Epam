package by.yahimovich.task01javabasic.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class ArithmeticService {

    /**
     * @param x - First value
     * @param y - Second value
     * @return sum of first and second values
     */

    public double sum(double x, double y) {
        return x + y;
    }

    /**
     * @param x - First value
     * @param y - Second value
     * @return sub of first and second values
     */

    public double sub(double x, double y) {
        return x - y;
    }

    /**
     * @param x - First value
     * @param y - Second value
     * @return product of first and second values
     */

    public double multiplication(double x, double y) {
        return x * y;
    }

    /**
     * @param x - First value
     * @param y - Second value
     * @return quotient of first and second values
     */

    public double division(double x, double y) {
        double result;
        if (y != 0) {
            result = x / y;
        } else {
            //TODO throw exception, div on zero
            result = 0;
        }
        return result;
    }

    /**
     * @param value  - Value which well be raised to the power
     * @param degree - The degree to which the value will be raised
     * @return result of calculating
     * @see Math
     */

    public double power(double value, double degree) {
        return Math.pow(value, degree);
    }

    /**
     * @param value - The value from which the square root will be calculated
     * @return result of calculating
     * @see Math
     */

    public double sqrt(double value) {
        return Math.sqrt(value);
    }

    /**
     * @param a - first coefficient
     * @param b - second coefficient
     * @param c - third coefficient
     * @return result of calculating
     */

    private double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    /**
     * This method calculate roots of the equation using discriminant
     *
     * @param a - first coefficient
     * @param b - second coefficient
     * @param c - third coefficient
     * @return list this roots values
     */

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

        } else if (D == 0) {
            double x;

            x = -b / (2 * a);

            list.add(x);
        }

        return list;
    }

    /**
     * @param a - First value
     * @param b - Second value
     * @return max from a & b
     */

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    /**
     * @param a - First value
     * @param b - Second value
     * @return min from a & b
     */

    public double min(double a, double b) {
        return a < b ? a : b;
    }

    /**
     * @param value - number
     * @return factorial of input value
     */

    public double factorial(double value) {
        double res = value;
        for (int i = 2; i < res; ++i) {
            value *= i;
        }
        return value;
    }

    /**
     * @param a - first number
     * @param b - second number
     * @return List<Double> with changed positions using supplemented variable
     */

    public List<Double> changeNumbersFirst(double a, double b) {
        double tmp;
        List<Double> list = new ArrayList<>();

        tmp = a;
        a = b;
        b = tmp;

        list.add(a);
        list.add(b);

        return list;
    }

    /**
     * @param a - first number
     * @param b - second number
     * @return List<Double> with changed positions using arithmetic methods
     */

    public List<Double> changeNumbersSecond(double a, double b) {
        List<Double> list = new ArrayList<>();

        a = a + b;
        b = a - b;
        a = a - b;

        list.add(a);
        list.add(b);

        return list;
    }

    /**
     * @param a - first number
     * @param b - second number
     * @return List<Double> with changed positions using logical methods
     */

    public List<Double> changeNumbersThird(double a, double b) {
        List<Double> list = new ArrayList<>();

        a = (int) a ^ (int) b;
        b = (int) b ^ (int) a;
        a = (int) a ^ (int) b;

        list.add(a);
        list.add(b);

        return list;
    }

    public double differenceOfCubes(double value) {
        double result = 0;
        for (double i = value; i >= 0; i--) {
            result -= Math.pow(i, 3);
        }
        return result;
    }

    public void divider(double m, double n) {
        for (double i = m; i < n; i++) {
            System.out.print("Number " + i + ": ");
            for (double j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public double threeDigitNumber(double value) {
        double x = value % 10;
        double y = (value / 10) % 10;

        return (10 * y + x) * 7;
    }
}

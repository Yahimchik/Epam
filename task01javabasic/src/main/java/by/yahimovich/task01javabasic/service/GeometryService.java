package by.yahimovich.task01javabasic.service;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see ArithmeticService
 */

public class GeometryService {

    ArithmeticService service = new ArithmeticService();

    /**
     * Method which calculate hypotenuse of right triangle
     *
     * @param a - first side
     * @param b - second side
     * @return calculating result
     * @see ArithmeticService
     */

    public double hypotenuse(double a, double b) {
        return service.sqrt(service.power(a, 2) + service.power(b, 2));
    }

    /**
     * Method which calculated square of triangle
     *
     * @param a - side to which the height is drawn
     * @param b - height of triangle
     * @return calculating result
     */

    public double square(double a, double b) {
        return (a * b) / 2;
    }

    /**
     * Method which calculate perimeter of the triangle
     *
     * @param a - first side
     * @param b - second side
     * @param c - third side
     * @return calculating result
     */

    public double perimeter(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        } else {
            System.out.print("Triangle does not exist\n");
        }
        return 0;
    }

    /**
     * This method calculate side length with using point coordinates d = √((x2-x1)²+(y2-y1)²)
     *
     * @param x1 - x-coordinate of first point
     * @param x2 - x-coordinate of second point
     * @param y1 - y-coordinate of first point
     * @param y2 - y-coordinate of second point
     * @return side length
     * @see ArithmeticService
     */

    public double sideLength(double x2, double y2, double x1, double y1) {
        return service.sqrt(service.sum(service.power((x2 - x1), 2), service.power((y2 - y1), 2)));
    }

    /**
     * This method calculate height of the triangle
     *
     * @param a - length of the first side
     * @param b - length of the second side
     * @param c - length of the third side
     * @return calculating result
     */

    public double height(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return (2 * service.sqrt(p * (p - a) * (p - b) * (p - c))) / a;
    }
}

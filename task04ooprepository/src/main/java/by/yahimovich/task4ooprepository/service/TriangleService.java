package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Triangle;

/**
 * Triangle service class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Triangle
 * @see Point3DClass
 * @see PointService
 */

public class TriangleService {

    PointService pointService = new PointService();

    /**
     * Method triangleSquare.
     *
     * @return square of triangle.
     */

    public double triangleSquare(Triangle triangle) {
        double firstSide = pointService.sideLength(triangle.getPoint1(), triangle.getPoint2());
        double secondSide = pointService.sideLength(triangle.getPoint2(), triangle.getPoint3());
        double thirdSide = pointService.sideLength(triangle.getPoint1(), triangle.getPoint3());

        double p = semiPerimeter(firstSide, secondSide, thirdSide);

        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    /**
     * Method semiPerimeter.
     *
     * @return semi perimeter of triangle.
     */

    private double semiPerimeter(double firstSide, double secondSide, double thirdSide) {
        return (firstSide + secondSide + thirdSide) / 2;
    }
}

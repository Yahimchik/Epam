package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Triangle;

public class TriangleService {

    PointService pointService = new PointService();

    public double triangleSquare(Triangle triangle) {
        double firstSide = pointService.sideLength(triangle.getPoint1(), triangle.getPoint2());
        double secondSide = pointService.sideLength(triangle.getPoint2(), triangle.getPoint3());
        double thirdSide = pointService.sideLength(triangle.getPoint1(), triangle.getPoint3());

        double p = semiPerimeter(firstSide, secondSide, thirdSide);

        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    private double semiPerimeter(double firstSide, double secondSide, double thirdSide) {
        return (firstSide + secondSide + thirdSide) / 2;
    }

    public Triangle createTriangle(Point3DClass point1, Point3DClass point2, Point3DClass point3) {
        return new Triangle(point1, point2, point3);
    }
}

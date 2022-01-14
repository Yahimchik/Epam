package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Plane;
import by.yahimovich.task4ooprepository.entity.Point;

import java.util.List;

public class PointService {
    public double sideLength(Point point) {
        return Math.sqrt(Math.pow(point.getX(), 2)
                + Math.pow(point.getY(), 2)
                + Math.pow(point.getZ(), 2));
    }

    Plane createPlane(Point point1, Point point2, Point point3) {

        if (point1 == point2 && point1 == point3) {
            return new Plane(0, 0, 0, 0);
        } else {

            double A = point1.getY() * (point2.getZ() - point3.getZ())
                    + point2.getY() * (point3.getZ() - point1.getZ())
                    + point3.getY() * (point1.getZ() - point2.getZ());

            double B = point1.getZ() * (point2.getX() - point3.getX())
                    + point2.getZ() * (point3.getX() - point1.getX())
                    + point3.getZ() * (point1.getX() - point2.getX());

            double C = point1.getX() * (point2.getY() - point3.getY())
                    + point2.getX() * (point3.getY() - point1.getY())
                    + point3.getX() * (point1.getY() - point2.getY());

            double D = -(point1.getX() * (point2.getY() * point3.getZ() - point3.getY() * point2.getZ())
                    + point2.getX() * (point3.getY() * point1.getZ() - point1.getY() * point3.getZ())
                    + point3.getX() * (point1.getY()) * point2.getZ() - point2.getY() * point1.getZ());

            return new Plane(A, B, C, D);
        }
    }

    public void createPyramidBase(List<Point> points){

    }
}

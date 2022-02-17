package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Point3DClass;

public class PointService {
    public double sideLength(Point3DClass point1, Point3DClass point2) {
        return Math.sqrt(
                Math.pow(Math.abs(point1.getX() - point2.getX()), 2)
                        + Math.pow(Math.abs(point1.getY() - point2.getY()), 2)
                        + Math.pow(Math.abs(point1.getZ() - point2.getZ()), 2)
        );
    }

    public void straightLineEquation(Point3DClass point1, Point3DClass point2) {
        double Xa = point1.getX();
        double Ya = point1.getY();
        double Za = point1.getZ();

        double Xb = point2.getX();
        double Yb = point2.getY();
        double Zb = point2.getZ();

        double X;
        double Y;
        double Z;

        double t = 1;

        X = (Xb - Xa) * t + Xa;
        Y = (Yb - Ya) * t + Ya;
        Z = (Zb - Za) * t + Za;
    }

}

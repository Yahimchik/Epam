package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Plane;
import by.yahimovich.task4ooprepository.entity.Point3DClass;

public class PlaneService {

    public Plane createPlane(Point3DClass point3D1, Point3DClass point3D2, Point3DClass point3D3) {

        if (point3D1 == point3D2 && point3D1 == point3D3) {
            return new Plane(0, 0, 0, 0);
        } else {

            double A = point3D1.getY() * (point3D2.getZ() - point3D3.getZ())
                    + point3D2.getY() * (point3D3.getZ() - point3D1.getZ())
                    + point3D3.getY() * (point3D1.getZ() - point3D2.getZ());

            double B = point3D1.getZ() * (point3D2.getX() - point3D3.getX())
                    + point3D2.getZ() * (point3D3.getX() - point3D1.getX())
                    + point3D3.getZ() * (point3D1.getX() - point3D2.getX());

            double C = point3D1.getX() * (point3D2.getY() - point3D3.getY())
                    + point3D2.getX() * (point3D3.getY() - point3D1.getY())
                    + point3D3.getX() * (point3D1.getY() - point3D2.getY());

            double D = -(point3D1.getX() * (point3D2.getY() * point3D3.getZ() - point3D3.getY() * point3D2.getZ())
                    + point3D2.getX() * (point3D3.getY() * point3D1.getZ() - point3D1.getY() * point3D3.getZ())
                    + point3D3.getX() * (point3D1.getY()) * point3D2.getZ() - point3D2.getY() * point3D1.getZ());

            return new Plane(A, B, C, D);
        }
    }
}

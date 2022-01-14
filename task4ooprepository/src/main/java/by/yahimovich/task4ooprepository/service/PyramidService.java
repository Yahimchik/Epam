package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Plane;
import by.yahimovich.task4ooprepository.entity.Point;
import by.yahimovich.task4ooprepository.entity.Pyramid;

public class PyramidService extends PointService {

    public boolean isPyramid(Pyramid pyramid) {
        Plane plane = createPlane(
                pyramid.getPeak(0),
                pyramid.getPeak(1),
                pyramid.getPeak(2)
        );

        double res;
        int count = 0;
        Point point = new Point();

        for (int i = 3; i < pyramid.getCountOfPeaks(); i++) {
            res = plane.getA() * pyramid.getPeak(i).getX()
                    + plane.getB() * pyramid.getPeak(i).getY()
                    + plane.getC() * pyramid.getPeak(i).getZ()
                    + plane.getD();
            if (res != 0) {
                point.setX(pyramid.getPeak(i).getX());
                point.setY(pyramid.getPeak(i).getY());
                point.setZ(pyramid.getPeak(i).getZ());
                count++;
            }
        }

        System.out.println(point);
        return count == 1;
    }
}

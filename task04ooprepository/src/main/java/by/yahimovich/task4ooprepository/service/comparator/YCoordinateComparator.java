package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Point3DClass;

import java.util.Comparator;

public class YCoordinateComparator implements Comparator<Point3DClass> {
    @Override
    public int compare(Point3DClass o1, Point3DClass o2) {
        return Double.compare(o1.getY(), o2.getY());
    }
}

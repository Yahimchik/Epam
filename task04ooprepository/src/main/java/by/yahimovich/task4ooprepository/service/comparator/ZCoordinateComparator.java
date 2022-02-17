package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Point3DClass;

import java.util.Comparator;

public class ZCoordinateComparator implements Comparator<Point3DClass> {
    @Override
    public int compare(Point3DClass o1, Point3DClass o2) {
        return Double.compare(o1.getZ(), o2.getZ());
    }
}

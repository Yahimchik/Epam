package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Point;

import java.util.Comparator;

public class ZCoordinateComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        return Double.compare(o1.getZ(), o2.getZ());
    }
}

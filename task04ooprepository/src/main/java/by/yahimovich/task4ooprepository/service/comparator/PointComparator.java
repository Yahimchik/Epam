package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Point3DClass;

import java.util.Comparator;

/**
 * Point Comparator class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Comparator
 */

public class PointComparator implements Comparator<Point3DClass> {

    /**
     * Override method compare.
     * Compare pyramids by points values.
     *
     * @return 1 if o1 > o2 -> 0 if o1 = o2 -> -1 if o1 < o2.
     */

    @Override
    public int compare(Point3DClass o1, Point3DClass o2) {

        if (o1.getX() == o2.getX() && o2.getX() != 0) {
            return Double.compare(o2.getY(), o1.getY());
        }
        if (o1.getX() == o2.getX() && o1.getY() == o2.getY()) {
            return Double.compare(o1.getZ(), o2.getZ());
        }
        return Double.compare(o1.getX(), o2.getX());
    }
}

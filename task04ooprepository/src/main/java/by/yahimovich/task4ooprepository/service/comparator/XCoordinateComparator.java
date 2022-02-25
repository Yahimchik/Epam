package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Point3DClass;

import java.util.Comparator;

/**
 * Comparator X class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Comparator
 */

public class XCoordinateComparator implements Comparator<Point3DClass> {

    /**
     * Override method compare.
     * Compare pyramids by x coordinate.
     *
     * @return 1 if o1 > o2 -> 0 if o1 = o2 -> -1 if o1 < o2.
     */

    @Override
    public int compare(Point3DClass o1, Point3DClass o2) {
        return Double.compare(o1.getX(), o2.getX());
    }
}

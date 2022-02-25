package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.service.PointService;

/**
 * Comparator by length class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class ComparatorByLength {

    public int compare(PointService o1, PointService o2, Point3DClass point1, Point3DClass point2) {
        return Double.compare(o1.sideLength(point1, point2), o2.sideLength(point1, point2));
    }
}

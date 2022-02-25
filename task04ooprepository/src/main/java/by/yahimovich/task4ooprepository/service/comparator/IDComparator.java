package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Pyramid;

import java.util.Comparator;

/**
 * Comparator ID class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Comparator
 */

public class IDComparator implements Comparator<Pyramid> {

    /**
     * Override method compare.
     * Compare pyramids by ID.
     *
     * @return 1 if o1 > o2 -> 0 if o1 = o2 -> -1 if o1 < o2.
     */

    @Override
    public int compare(Pyramid o1, Pyramid o2) {
        return Integer.compare(o1.getID(), o2.getID());
    }
}

package by.yahimovich.task4ooprepository.service.comparator;

import by.yahimovich.task4ooprepository.entity.Pyramid;

import java.util.Comparator;

public class IDComparator implements Comparator<Pyramid> {
    @Override
    public int compare(Pyramid o1, Pyramid o2) {
        return Integer.compare(o1.getID(), o2.getID());
    }
}

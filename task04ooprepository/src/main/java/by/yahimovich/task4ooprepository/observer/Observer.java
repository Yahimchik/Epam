package by.yahimovich.task4ooprepository.observer;

import by.yahimovich.task4ooprepository.entity.Pyramid;

/**
 * Observer interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Pyramid
 */

public interface Observer {

    /**
     * Method update.
     * Update parameters of pyramid.
     */

    void update(Pyramid pyramid);
}

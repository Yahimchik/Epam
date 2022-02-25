package by.yahimovich.task4ooprepository.observer;

/**
 * Observable interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Observer
 */

public interface Observable {

    /**
     * Method registerObserver.
     * Register new observer.
     */

    void registerObserver(Observer observer);

    /**
     * Method removeObserver.
     * Remove observer.
     */

    void removeObserver(Observer observer);

    /**
     * Method notifyObserver.
     * Notify observer.
     */

    void notifyObservers();
}

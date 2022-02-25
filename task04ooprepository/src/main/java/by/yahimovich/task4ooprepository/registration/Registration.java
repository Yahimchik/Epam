package by.yahimovich.task4ooprepository.registration;

import by.yahimovich.task4ooprepository.observer.Observable;
import by.yahimovich.task4ooprepository.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Observable
 */

public class Registration implements Observable {

    private final List<Observer> observers = new ArrayList<>();

    /**
     * Override method registerObserver
     */

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Override method removeObserver.
     */

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Override method notifyObserver.
     */

    @Override
    public void notifyObservers() {
        System.out.println(observers);
    }
}

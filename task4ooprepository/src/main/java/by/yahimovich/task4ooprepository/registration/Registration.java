package by.yahimovich.task4ooprepository.registration;

import by.yahimovich.task4ooprepository.observer.Observable;
import by.yahimovich.task4ooprepository.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Registration implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

    }
}

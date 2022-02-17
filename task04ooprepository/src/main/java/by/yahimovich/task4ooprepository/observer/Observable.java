package by.yahimovich.task4ooprepository.observer;

public interface Observable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

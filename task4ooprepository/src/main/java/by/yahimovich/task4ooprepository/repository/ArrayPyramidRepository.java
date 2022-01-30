package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.listener.Observable;
import by.yahimovich.task4ooprepository.listener.Observer;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;

import java.util.ArrayList;
import java.util.List;

public class ArrayPyramidRepository implements PyramidRepository, Observable {

    private final List<Pyramid> pyramids = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void save(Pyramid pyramid) {
        this.pyramids.add(pyramid);
    }

    @Override
    public List<Pyramid> getPyramidList() throws RepositoryException {
        if (pyramids.isEmpty()) {
            throw new RepositoryException("No pyramid!");
        } else {
            return this.pyramids;
        }
    }

    @Override
    public Pyramid findByID(PyramidID pyramidID) throws RepositoryException {
        Pyramid pyramid = new Pyramid();
        for (Pyramid value : pyramids) {
            if (pyramidID.getID() == value.getID()) {
                pyramid = value;
            } else {
                throw new RepositoryException();
            }
        }
        return pyramid;
    }

    @Override
    public void delete(PyramidID pyramidID) throws RepositoryException {
        for (int i = 0; i < pyramids.size(); ++i) {
            if (pyramidID.getID() == pyramids.get(i).getID()) {
                pyramids.remove(i);
            } else {
                throw new RepositoryException();
            }
        }
    }

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
        for (int i = 0; i < observers.size(); ++i) {
            observers.get(i).update(pyramids.get(i));
        }
    }
}

package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.observer.Observer;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see PyramidRepository
 * @see Observer
 */

public class ArrayPyramidRepository implements PyramidRepository {

    private final List<Pyramid> pyramids = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    /**
     * Override method save.
     * Save pyramid to repository.
     */

    @Override
    public void save(Pyramid pyramid) {
        this.pyramids.add(pyramid);
    }

    /**
     * Override method getPyramidList.
     * Output all pyramids from repository.
     */

    @Override
    public List<Pyramid> getPyramidList() throws RepositoryException {
        if (pyramids.isEmpty()) {
            throw new RepositoryException("No pyramid!");
        } else {
            return this.pyramids;
        }
    }

    /**
     * Override method findByID.
     * Find pyramid in repository by ID.
     */

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

    /**
     * Override method delete.
     * Delete pyramid from repository by ID.
     */

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
}

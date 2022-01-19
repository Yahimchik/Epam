package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayPyramidRepository implements PyramidRepository<Pyramid> {

    public static final Logger LOGGER = LogManager.getLogger(ArrayPyramidRepository.class);
    private final List<Pyramid> pyramids = new ArrayList<>();

    public ArrayPyramidRepository() {
    }

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
    public void update(Pyramid pyramid) {

    }
}

package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;

import java.util.List;

public interface PyramidRepository {

    List<Pyramid> getPyramidList() throws RepositoryException;

    Pyramid findByID(PyramidID pyramidID) throws RepositoryException;

    void save(Pyramid pyramid);

    void delete(PyramidID pyramidID) throws RepositoryException;

}

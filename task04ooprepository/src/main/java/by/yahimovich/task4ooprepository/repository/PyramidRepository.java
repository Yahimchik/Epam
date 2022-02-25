package by.yahimovich.task4ooprepository.repository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;

import java.util.List;

/**
 * Observable interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public interface PyramidRepository {

    /**
     * Output all pyramids from repository.
     */

    List<Pyramid> getPyramidList() throws RepositoryException;

    /**
     * Find pyramid in repository by ID.
     */

    Pyramid findByID(PyramidID pyramidID) throws RepositoryException;

    /**
     * Save pyramid to repository.
     */


    void save(Pyramid pyramid);

    /**
     * Delete pyramid from repository by ID.
     */

    void delete(PyramidID pyramidID) throws RepositoryException;

}

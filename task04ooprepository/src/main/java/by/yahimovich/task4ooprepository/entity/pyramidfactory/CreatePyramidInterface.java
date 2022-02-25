package by.yahimovich.task4ooprepository.entity.pyramidfactory;

import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

/**
 * Create Pyramid Interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see PyramidException
 */

public interface CreatePyramidInterface {

    /**
     * Method create.
     * Create new object.
     * */

    Object create() throws PyramidException;
}

package by.yahimovich.task4ooprepository.validation;

import by.yahimovich.task4ooprepository.entity.Pyramid;

/**
 * Validation interface.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Pyramid
 */

public interface ValidationInterface {

    /**
     * Method isValid.
     *
     * @return true is valid and false if not.
     */

    boolean isValid(Pyramid pyramid);
}

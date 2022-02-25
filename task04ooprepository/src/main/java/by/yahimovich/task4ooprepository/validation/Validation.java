package by.yahimovich.task4ooprepository.validation;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.service.PyramidService;

/**
 * Validation class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Validation implements ValidationInterface {

    private final PyramidService service = new PyramidService();

    /**
     * Method isValid.
     *
     * @return true is valid and false if not.
     */

    @Override
    public boolean isValid(Pyramid pyramid) {
        return service.isPyramid(pyramid);
    }
}

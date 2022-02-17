package by.yahimovich.task4ooprepository.validation;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.service.PyramidService;

public class Validation implements ValidationInterface {

    private final PyramidService service = new PyramidService();

    @Override
    public boolean isValid(Pyramid pyramid) {
        return service.isPyramid(pyramid);
    }
}

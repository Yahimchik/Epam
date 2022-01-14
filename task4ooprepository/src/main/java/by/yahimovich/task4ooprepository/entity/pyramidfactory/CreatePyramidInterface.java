package by.yahimovich.task4ooprepository.entity.pyramidfactory;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

public interface CreatePyramidInterface {
    Pyramid create() throws PyramidException;
}

package by.yahimovich.task4ooprepository.view.dao.txt;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.io.IOException;
import java.util.List;

public interface TxtInterface<T> {
    Pyramid read(String fileName) throws IOException, ClassNotFoundException, PyramidException;

    void write(List<T> list, String fileName);
}

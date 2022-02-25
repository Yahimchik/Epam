package by.yahimovich.task4ooprepository.view.dao.txt;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.io.IOException;
import java.util.List;

/**
 * Txt interface.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public interface TxtInterface<T> {

    /**
     * Method read.
     *
     * @return list of objects from file.
     */

    Pyramid read(String fileName) throws IOException, ClassNotFoundException, PyramidException;

    /**
     * Method write.
     * Writes list of objects to file.
     */

    void write(List<T> list, String fileName);
}

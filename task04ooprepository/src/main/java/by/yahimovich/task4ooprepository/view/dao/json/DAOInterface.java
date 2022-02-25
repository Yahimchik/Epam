package by.yahimovich.task4ooprepository.view.dao.json;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * DAO interface.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public interface DAOInterface<T> {

    /**
     * Method read.
     *
     * @return list of objects from file.
     */

    List<T> read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException;

    /**
     * Method write.
     * Writes list of objects to file.
     */

    void write(List<T> data, String fileName) throws IOException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException;
}

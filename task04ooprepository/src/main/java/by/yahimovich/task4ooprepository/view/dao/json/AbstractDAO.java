package by.yahimovich.task4ooprepository.view.dao.json;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Abstract DAO.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

abstract public class AbstractDAO<T> implements DAOInterface<T> {

    Class<T> type;

    /**
     * Constructor - create new object.
     *
     * @param type Class type.
     */

    AbstractDAO(Class<T> type) {
        this.type = type;
    }

    /**
     * Method read.
     *
     * @return list of objects from file.
     */

    @Override
    public abstract List<T> read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException;

    /**
     * Method write.
     * Writes list of objects to file.
     */

    @Override
    public void write(List<T> data, String filename) throws IOException {
    }
}

package by.yahimovich.task4ooprepository.view.dao.txt;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.io.IOException;
import java.util.List;

/**
 * Abstract TXT.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */


abstract public class AbstractTxt<T> implements TxtInterface<T> {

    Class<T> type;

    /**
     * Constructor - create new object.
     *
     * @param type Class type.
     */

    public AbstractTxt(Class<T> type) {
        this.type = type;
    }

    /**
     * Method read.
     *
     * @return list of objects from file.
     */

    @Override
    public abstract Pyramid read(String fileName) throws IOException, ClassNotFoundException, PyramidException;

    /**
     * Method write.
     * Writes list of objects to file.
     */

    @Override
    public abstract void write(List<T> list, String fileName);
}

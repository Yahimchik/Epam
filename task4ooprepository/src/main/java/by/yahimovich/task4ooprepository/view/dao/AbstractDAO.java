package by.yahimovich.task4ooprepository.view.dao;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@SuppressWarnings("ALL")
abstract public class AbstractDAO<T> implements DAOInterface {

    Class<T> type;

    AbstractDAO(Class<T> type) {
        this.type = type;
    }

    public abstract List<T> read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException;

    @Override
    public void write(List data, String filename) throws IOException {
    }
}

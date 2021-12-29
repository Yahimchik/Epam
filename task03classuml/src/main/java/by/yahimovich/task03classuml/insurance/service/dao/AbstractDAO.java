package by.yahimovich.task03classuml.insurance.service.dao;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

abstract public class AbstractDAO<T> implements DAOInterface {

    Class<T> type;

    AbstractDAO(Class<T> type) {
        this.type = type;
    }

    public abstract List<T> read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException;

    @Override
    public void write(List data, String filename) throws IOException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
    }
}

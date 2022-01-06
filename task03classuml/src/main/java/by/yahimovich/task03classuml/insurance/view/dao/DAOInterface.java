package by.yahimovich.task03classuml.insurance.view.dao;

import by.yahimovich.task03classuml.insurance.view.dao.exception.DAOException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface DAOInterface<T> {
    List<T> read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, DAOException;

    void write(List<T> data, String fileName) throws IOException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException;
}

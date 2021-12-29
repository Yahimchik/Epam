package by.yahimovich.task03classuml.insurance.service.dao;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface DAOInterface<T> {
    List<T> read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException;

    void write(List<T> data, String fileName) throws IOException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException;
}

package by.yahimovich.task4ooprepository.view.dao.txt;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.io.IOException;
import java.util.List;

abstract public class AbstractTxt<T> implements TxtInterface<T> {

    Class<T> type;

    public AbstractTxt(Class<T> type) {
        this.type = type;
    }

    @Override
    public abstract Pyramid read(String fileName) throws IOException, ClassNotFoundException, PyramidException;

    @Override
    public abstract void write(List<T> list, String fileName);
}

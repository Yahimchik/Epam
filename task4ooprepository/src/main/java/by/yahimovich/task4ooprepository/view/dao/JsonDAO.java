package by.yahimovich.task4ooprepository.view.dao;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SuppressWarnings("ALL")
public class JsonDAO<T> extends AbstractDAO {

    public JsonDAO(Class<T> type) {
        super(type);
    }

    @Override
    public List read(String filename) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Pyramid> data;
        data = mapper.readValue(new File(filename),
                TypeFactory.defaultInstance().constructCollectionType(List.class, Pyramid.class));
        return data;

    }

    @Override
    public void write(List data, String fileName) throws IOException {
        (new ObjectMapper())
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .writeValue(new File(fileName), data);
    }
}

package by.yahimovich.task03classuml.insurance.service.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class JsonDAO<T> extends AbstractDAO {

    public JsonDAO(Class<T> type) {
        super(type);
    }

    @Override
    public List read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        ObjectMapper mapper = new ObjectMapper();
        List<T> data;
        data = mapper.readValue(new File(filename),
                TypeFactory.defaultInstance().constructCollectionType(List.class, this.type));
        return data;
    }

    @Override
    public void write(List data, String fileName) throws IOException {
        (new ObjectMapper())
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .writeValue(new File(fileName), data);
    }
}

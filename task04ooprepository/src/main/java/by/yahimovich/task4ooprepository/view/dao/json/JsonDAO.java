package by.yahimovich.task4ooprepository.view.dao.json;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Jsom DAO.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */


public class JsonDAO<T> extends AbstractDAO<T> {

    /**
     * Constructor - create new object.
     *
     * @param type Class type.
     */

    public JsonDAO(Class<T> type) {
        super(type);
    }

    /**
     * Method read.
     *
     * @return list of objects from file.
     */

    @Override
    public List read(String filename) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Pyramid> data;
        data = mapper.readValue(new File(filename),
                TypeFactory.defaultInstance().constructCollectionType(List.class, Pyramid.class));
        return data;

    }

    /**
     * Method write.
     * Writes list of objects to file.
     */

    @Override
    public void write(List<T> data, String fileName) throws IOException {
        (new ObjectMapper())
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .writeValue(new File(fileName), data);
    }
}

package by.yahimovich.task03classuml.insurance.view.dao;

import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.view.dao.exception.DAOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonDAO<T> extends AbstractDAO {

    public JsonDAO(Class<T> type) {
        super(type);
    }

    @Override
    public List read(String filename) throws DAOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Derivatives> data;
            data = mapper.readValue(new File(filename),
                    TypeFactory.defaultInstance().constructCollectionType(List.class, Derivatives.class));
            return data;
        } catch (IOException e) {
            throw new DAOException();
        }
    }

    @Override
    public void write(List data, String fileName) throws IOException {
        (new ObjectMapper())
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .writeValue(new File(fileName), data);
    }
}

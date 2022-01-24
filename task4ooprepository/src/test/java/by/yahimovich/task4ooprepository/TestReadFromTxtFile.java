package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.view.dao.txt.TxtDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileNotFoundException;
import java.util.stream.Stream;

public class TestReadFromTxtFile {

    //TODO разобраться, почему тест не проходит

    @ParameterizedTest
    @MethodSource("provideData")
    void test(String fileName, Pyramid pyramid) throws FileNotFoundException, PyramidException {
        Assertions.assertEquals(pyramid.hashCode(), new TxtDAO<>(Pyramid.class).read(fileName).hashCode());
    }

    private static Stream<Arguments> provideData() throws PyramidException {

        return Stream.of(
                Arguments.of(
                        "example.txt", new CreatePyramid().create()
                )
        );
    }
}

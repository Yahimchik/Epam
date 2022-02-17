package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.PyramidID;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestRepositoryFindByID {

    private static final ArrayPyramidRepository repository = new ArrayPyramidRepository();

    @ParameterizedTest
    @MethodSource("provideDataForFindByID")
    void test(Pyramid pyramid, Pyramid expected) {
        Assertions.assertEquals(expected, pyramid);
    }

    private static Stream<Arguments> provideDataForFindByID() throws PyramidException, RepositoryException {
        Pyramid pyramid = new CreatePyramid().create();
        repository.save(pyramid);

        return Stream.of(
                Arguments.of(
                        pyramid, repository.findByID(new PyramidID(1))
                )
        );
    }


}

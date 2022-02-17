package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.repository.ArrayPyramidRepository;
import by.yahimovich.task4ooprepository.repository.exception.RepositoryException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestRepositoryGetAllPyramids {

    private static final ArrayPyramidRepository repository = new ArrayPyramidRepository();

    @ParameterizedTest
    @MethodSource("provideDataForGetAllPyramids")
    void test(List<Pyramid> pyramids, List<Pyramid> expected) {
        Assertions.assertEquals(expected, pyramids);
    }

    private static Stream<Arguments> provideDataForGetAllPyramids() throws PyramidException, RepositoryException {
        repository.save(new CreatePyramid().create());
        List<Pyramid> pyramids = List.of(new CreatePyramid().create());

        return Stream.of(
                Arguments.of(
                        repository.getPyramidList(), pyramids
                )
        );
    }
}

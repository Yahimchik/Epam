package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.service.PyramidService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPyramidVolume {

    private final PyramidService service = new PyramidService();

    @ParameterizedTest
    @MethodSource("provideData")
    void test(Pyramid pyramid, double expected) {
        Assertions.assertEquals(expected, service.pyramidVolume(pyramid));
    }


    private static Stream<Arguments> provideData() throws PyramidException {
        return Stream.of(
                Arguments.of(
                        new CreatePyramid().create(), Math.abs(2)
                )
        );
    }
}

package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.entity.pyramidfactory.CreatePyramid;
import by.yahimovich.task4ooprepository.service.PyramidService;
import org.intellij.lang.annotations.MagicConstant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestCreatePyramid {
    private static final PyramidService service = new PyramidService();

    @ParameterizedTest
    @MethodSource("provideData")
    void test(Pyramid pyramid, boolean expected) {
        Assertions.assertEquals(expected, service.isPyramid(pyramid));
    }


    private static Stream<Arguments> provideData() throws PyramidException {
        return Stream.of(
                Arguments.of(
                        new CreatePyramid().create(), true
                )
        );
    }
}

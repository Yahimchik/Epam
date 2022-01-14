package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Point;
import by.yahimovich.task4ooprepository.service.PointService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSideLengthMethod {

    private static final PointService service = new PointService();

    @ParameterizedTest
    @MethodSource("providePoint")
    void test(Point point, double expected) {
        Assertions.assertEquals(expected, service.sideLength(point));
    }

    private static Stream<Arguments> providePoint() {
        return Stream.of(
                Arguments.of(
                        new Point(1, 2, 3), Math.sqrt(14)
                ),
                Arguments.of(
                        new Point(3, 3, 3), Math.sqrt(27)
                ),
                Arguments.of(
                        new Point(0, 0, 0), Math.sqrt(0)
                ),
                Arguments.of(
                        new Point(5, 4, 4), Math.sqrt(57)
                ),
                Arguments.of(
                        new Point(1, 0, 12), Math.sqrt(145)
                )
        );
    }
}

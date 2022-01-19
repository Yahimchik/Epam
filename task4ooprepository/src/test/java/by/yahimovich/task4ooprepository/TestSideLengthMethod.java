package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
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
    void test(Point3DClass point1, Point3DClass point2, double expected) {
        Assertions.assertEquals(expected, service.sideLength(point1, point2));
    }

    private static Stream<Arguments> providePoint() {
        return Stream.of(
                Arguments.of(
                        new Point3DClass(1, 2, 3),
                        new Point3DClass(3, 2, 1),
                        Math.sqrt(14)
                ),
                Arguments.of(
                        new Point3DClass(3, 3, 3),
                        new Point3DClass(3, 2, 1),
                        Math.sqrt(27)
                ),
                Arguments.of(
                        new Point3DClass(0, 0, 0),
                        new Point3DClass(3, 2, 1),
                        Math.sqrt(0)
                ),
                Arguments.of(
                        new Point3DClass(5, 4, 4),
                        new Point3DClass(3, 2, 1),
                        Math.sqrt(57)
                ),
                Arguments.of(
                        new Point3DClass(1, 0, 12),
                        new Point3DClass(3, 2, 1),
                        Math.sqrt(145)
                )
        );
    }
}

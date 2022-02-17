package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Triangle;
import by.yahimovich.task4ooprepository.service.TriangleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestTriangleSquare {
    private static final TriangleService service = new TriangleService();

    @ParameterizedTest
    @MethodSource("provideData")
    void test(Triangle triangle, double expected) {
        Assertions.assertEquals(expected, service.triangleSquare(triangle));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(
                        new Triangle(
                                new Point3DClass(0, 0, 0),
                                new Point3DClass(0, 3, 0),
                                new Point3DClass(4, 0, 0)
                        ), 6
                )
        );
    }
}

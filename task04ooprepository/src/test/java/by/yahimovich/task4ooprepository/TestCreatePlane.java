package by.yahimovich.task4ooprepository;

import by.yahimovich.task4ooprepository.entity.Plane;
import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.service.PlaneService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestCreatePlane {
    private static final PlaneService service = new PlaneService();

    @ParameterizedTest
    @MethodSource("provideData")
    void test(Plane plane, Plane expected){
        Assertions.assertEquals(expected,plane);
    }


    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(
                        service.createPlane(
                                new Point3DClass(0, 0, 0),
                                new Point3DClass(0, 3, 0),
                                new Point3DClass(4, 0, 0)
                        ), new Plane(0, 0, -12, 0)
                )
        );
    }
}

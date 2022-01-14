package by.yahimovich.task03classuml;


import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.entity.insurance.derivativefactory.CreateDerivative;
import by.yahimovich.task03classuml.insurance.service.Service;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class ServiceTest {

    private static Stream<Derivatives> derivativesStream() {
        List<Derivatives> list = List.of(new CreateDerivative().create());
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("derivativesStream")
    public void Test(List<Derivatives> list) {
        List<Derivatives> list1 = new Service().sortByDamage(list);
        Assertions.assertEquals(list1, new Service().sortByDamage(list));
    }
}

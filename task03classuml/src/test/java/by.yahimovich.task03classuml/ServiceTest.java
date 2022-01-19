package by.yahimovich.task03classuml;


import by.yahimovich.task03classuml.insurance.entity.insurance.Address;
import by.yahimovich.task03classuml.insurance.entity.insurance.BankDetails;
import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.entity.insurance.InsuranceContract;
import by.yahimovich.task03classuml.insurance.entity.person.Initials;
import by.yahimovich.task03classuml.insurance.entity.person.Person;
import by.yahimovich.task03classuml.insurance.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class ServiceTest {

    public static Service service = new Service();

    private static Stream<? extends Arguments> derivativesStream() {
        List<Derivatives> derivatives = new ArrayList<>();
        derivatives.add(
                new Derivatives(
                        new InsuranceContract(
                                "Accident and illness insurance",
                                "Property of citizens",
                                new Date(1),
                                1313,
                                1710,
                                new Person(
                                        new Initials(
                                                "Abramson",
                                                "Oliver",
                                                "Evans"
                                        ),
                                        new Address(
                                                "Albania",
                                                "", "Berat",
                                                "Rrugica Mbrica",
                                                "163",
                                                "",
                                                "43",
                                                348651
                                        ),
                                        new BankDetails("4012888888881881",
                                                "4242424242424242",
                                                "AT483200000012345864",
                                                "044525976",
                                                "Hello"),
                                        "+375335197687"
                                ),
                                new Person(
                                        new Initials(
                                                "Abramson",
                                                "Oliver",
                                                "Evans"
                                        ),
                                        new Address(
                                                "Albania",
                                                "", "Berat",
                                                "Rrugica Mbrica",
                                                "163",
                                                "",
                                                "43",
                                                348651
                                        ),
                                        new BankDetails("4012888888881881",
                                                "4242424242424242",
                                                "AT483200000012345864",
                                                "044525976",
                                                "Hello"),
                                        "+375335197687"
                                ),
                                200
                        )
                )
        );
        return Stream.of(Arguments.of(derivatives, Math.abs(1313))
        );
    }

    @ParameterizedTest
    @MethodSource("derivativesStream")
    public void Test(List<Derivatives> list, double expected) {
        double actual = service.fullDamage(list);
        Assertions.assertEquals(expected, actual);
    }
}

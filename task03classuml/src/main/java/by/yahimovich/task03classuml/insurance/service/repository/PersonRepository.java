package by.yahimovich.task03classuml.insurance.service.repository;

import by.yahimovich.task03classuml.insurance.entity.insurance.Address;
import by.yahimovich.task03classuml.insurance.entity.insurance.BankDetails;
import by.yahimovich.task03classuml.insurance.entity.person.Initials;

import java.util.List;

public class PersonRepository {

    public final List<Initials> initials = List.of(

            new Initials(
                    "Abramson",
                    "Oliver",
                    "Evans"
            ),

            new Initials(
                    "Blare",
                    "Jack",
                    "Stone"
            ),

            new Initials(
                    "Cook",
                    "Harry",
                    "Roberts"
            ),

            new Initials(
                    "Derrick",
                    "Jacob",
                    "Mills"
            ),

            new Initials(
                    "Erickson",
                    "Charley",
                    "Lewis"
            ),

            new Initials(
                    "Ford",
                    "Thomas",
                    "Morgan"
            ),

            new Initials(
                    "Gilbert",
                    "George",
                    "Florence"
            ),

            new Initials(
                    "Hailey",
                    "Oscar",
                    "Campbell"
            ),

            new Initials(
                    "Foster",
                    "James",
                    "Bronte"
            ),

            new Initials(
                    "Gilmore",
                    "William",
                    "Bell"
            )
    );

    public final List<Address> addresses = List.of(

            new Address(
                    "Albania",
                    "", "Berat",
                    "Rrugica Mbrica",
                    "163",
                    "",
                    "43",
                    348651
            ),

            new Address(
                    "Belgium",
                    "Namur",
                    "Andenne",
                    "Route de Hannut",
                    "32A",
                    "4",
                    "21",
                    172984
            ),

            new Address(
                    "Canada",
                    "",
                    "Ottawa",
                    "Wellington Street",
                    "A",
                    "B",
                    "12A",
                    674524
            ),

            new Address(
                    "Dominican Republic",
                    "",
                    "Santo Domingo de Guzmán",
                    "Malecon, Av. George Washington",
                    "3C",
                    "12",
                    "123",
                    974513
            ),

            new Address(
                    "Ecuador",
                    "Guayas",
                    "Guayaquil",
                    "Via Perimetral",
                    "34F",
                    "",
                    "",
                    657431
            ),

            new Address(
                    "Finland",
                    "",
                    "Akaa",
                    "Nieuw Nickerie",
                    "56T",
                    "",
                    "94",
                    957864
            ),

            new Address(
                    "Germany",
                    "Bavaria",
                    "Munich",
                    "Bundesautobahn",
                    "12",
                    "3G",
                    "34",
                    734537
            ),

            new Address(
                    "Hungary",
                    "Zala",
                    "Nagykanizsa",
                    "Ady Endre Street",
                    "A2",
                    "3C",
                    "31",
                    945367
            ),

            new Address(
                    "Indonesia",
                    "East Java",
                    "Surabaya",
                    "Surabaya St",
                    "60A",
                    "",
                    "12D",
                    675237
            ),

            new Address(
                    "Belarus",
                    "Minskiy",
                    "Vileyka",
                    "Nezaleshnosti",
                    "2",
                    "2",
                    "7",
                    222417
            )
    );

    public final List<BankDetails> details = List.of(

            new BankDetails(
                    "4012888888881881",
                    "4242424242424242",
                    "AT483200000012345864",
                    "044525976",
                    "Hello"
            ),

            new BankDetails(
                    "5169147129584558",
                    "5555555555554444",
                    "AZ96AZEJ00000000001234567890",
                    "044525710",
                    "Hello"
            ),

            new BankDetails(
                    "5496198584584769",
                    "586824160825533338",
                    "AL35202111090000000001234567",
                    "045004815",
                    "Hello"
            ),

            new BankDetails(
                    "2222990905257051",
                    "2201382000000013",
                    "AD1400080001001234567890",
                    "049240803",
                    "Hello"
            ),

            new BankDetails(
                    "2223577120017656",
                    "4012888888881881",
                    "BH02CITI00001077181611",
                    "044525288",
                    "Hello"
            ),

            new BankDetails(
                    "5124990000000002",
                    "5169147129584558",
                    "BY86AKBB10100000002966000000",
                    "044525268",
                    "Hello"
            ),

            new BankDetails(
                    "5105105105105100",
                    "4000000000000002",
                    "BE71096123456769",
                    "044525787",
                    "Hello"
            ),

            new BankDetails(
                    "4111110000000112",
                    "5100000000000412",
                    "BG18RZBB91550123456789",
                    "040507867",
                    "Hello"
            ),

            new BankDetails(
                    "4300000000000777",
                    "4222222222222220",
                    "BA393385804800211234",
                    "044106888", "Hello"
            ),

            new BankDetails(
                    "5000000000000009",
                    "5100000000000511",
                    "BR1500000000000010932840814P2",
                    "049205774", "Hello"
            )
    );

    public final List<String> phoneNumbers = List.of(

            ("+375335197687"),
            ("+938590457"),
            ("+3554453375"),
            ("+217533148"),
            ("+6845161585"),
            ("+3762952734"),
            ("+2446014906"),
            ("+1-2648941181"),
            ("+1-2689328160"),
            ("+3747932646")
    );
}

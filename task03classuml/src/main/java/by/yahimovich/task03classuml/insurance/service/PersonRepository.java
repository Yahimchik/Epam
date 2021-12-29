package by.yahimovich.task03classuml.insurance.service;

import by.yahimovich.task03classuml.insurance.entity.insurance.Address;
import by.yahimovich.task03classuml.insurance.entity.insurance.BankDetails;
import by.yahimovich.task03classuml.insurance.entity.person.Initials;
import by.yahimovich.task03classuml.insurance.entity.person.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    List<Initials> initials = new ArrayList<>();
    List<Address> addresses = new ArrayList<>();
    List<BankDetails> details = new ArrayList<>();
    List<String> phoneNumbers = new ArrayList<>();

    public void addInitials() {
        initials.add(new Initials("Abramson", "Oliver", "Evans"));
        initials.add(new Initials("Blare", "Jack", "Stone"));
        initials.add(new Initials("Cook", "Harry", "Roberts"));
        initials.add(new Initials("Derrick", "Jacob", "Mills"));
        initials.add(new Initials("Erickson", "Charley", "Lewis"));
        initials.add(new Initials("Ford", "Thomas", "Morgan"));
        initials.add(new Initials("Gilbert", "George", "Florence"));
        initials.add(new Initials("Hailey", "Oscar", "Campbell"));
        initials.add(new Initials("Foster", "James", "Bronte"));
        initials.add(new Initials("Gilmore", "William", "Bell"));
    }

    public void addAddresses() {
        addresses.add(new Address("Albania", "", "Berat", "Rrugica Mbrica",
                "163", "", "43", 348651));

        addresses.add(new Address("Belgium", "Namur", "Andenne", "Route de Hannut",
                "32A", "4", "21", 172984));

        addresses.add(new Address("Canada", "", "Ottawa", "Wellington Street",
                "A", "B", "12A", 674524));

        addresses.add(new Address("Dominican Republic", "", "Santo Domingo de Guzmán",
                "Malecon, Av. George Washington",
                "3C", "12", "123", 974513));

        addresses.add(new Address("Ecuador", "Guayas", "Guayaquil", "Via Perimetral",
                "34F", "", "", 657431));

        addresses.add(new Address("Finland", "", "Akaa", "Nieuw Nickerie",
                "56T", "", "94", 957864));

        addresses.add(new Address("Germany", "Bavaria", "Munich", "Bundesautobahn",
                "12", "3G", "34", 734537));

        addresses.add(new Address("Hungary", "Zala", "Nagykanizsa", "Ady Endre Street",
                "A2", "3C", "31", 945367));

        addresses.add(new Address("Indonesia", "East Java", "Surabaya", "Surabaya St",
                "60A", "", "12D", 675237));

        addresses.add(new Address("Belarus", "Minskiy", "Vileyka", "Nezaleshnosti",
                "2", "2", "7", 222417));
    }

    public void addBankDetails() {
        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));

        details.add(new BankDetails(123, 321, "BY12312",
                54321234, "Hello"));
    }

    public void addPhoneNumber() {
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
        phoneNumbers.add("+375333139380");
    }


    public Person createPerson() {

        addInitials();
        addAddresses();
        addBankDetails();
        addPhoneNumber();
        int r = rand();

        Person person = null;
        for (int i = 0; i < initials.size(); ++i) {
            person = new Person(
                    new Initials(
                            initials.get(rand()).getFirstName(),
                            initials.get(rand()).getSecondName(),
                            initials.get(rand()).getLastName()),
                    new Address(
                            addresses.get(r).getCountry(),
                            addresses.get(r).getDistrict(),
                            addresses.get(r).getCity(),
                            addresses.get(r).getStreet(),
                            addresses.get(r).getHouseNumber(),
                            addresses.get(r).getCaseNumber(),
                            addresses.get(r).getApartmentNumber(),
                            addresses.get(r).getPostcode()
                    ),
                    new BankDetails(
                            details.get(rand()).getPayerPAN(),
                            details.get(rand()).getRecipientPAN(),
                            details.get(rand()).getRecipientIBAN(),
                            details.get(rand()).getBankRecipientBIC(),
                            details.get(rand()).getAppointment()),
                    phoneNumbers.get(rand()));
        }
        return person;
    }

    private int rand() {
        return (int) ((Math.random() * 10));
    }
}

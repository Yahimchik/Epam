package by.yahimovich.task03classuml.insurance.service;

import by.yahimovich.task03classuml.insurance.entity.insurance.Address;
import by.yahimovich.task03classuml.insurance.entity.insurance.BankDetails;
import by.yahimovich.task03classuml.insurance.entity.person.Initials;
import by.yahimovich.task03classuml.insurance.entity.person.Person;
import by.yahimovich.task03classuml.insurance.service.repository.PersonRepository;

public class CreatePerson extends PersonRepository {

    private final Service service = new Service();

    public Person createPerson() {
        int r = service.rand(10);

        return new Person(
                new Initials(
                        initials.get(service.rand(10)).getFirstName(),
                        initials.get(service.rand(10)).getSecondName(),
                        initials.get(service.rand(10)).getLastName()),
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
                        details.get(service.rand(10)).getPayerPAN(),
                        details.get(service.rand(10)).getRecipientPAN(),
                        details.get(service.rand(10)).getRecipientIBAN(),
                        details.get(service.rand(10)).getBankRecipientBIC(),
                        details.get(service.rand(10)).getAppointment()),
                phoneNumbers.get(service.rand(10)));

    }
}

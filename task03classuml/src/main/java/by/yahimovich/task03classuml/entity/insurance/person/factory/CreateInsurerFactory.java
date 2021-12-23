package by.yahimovich.task03classuml.entity.insurance.person.factory;

import by.yahimovich.task03classuml.entity.insurance.Address;
import by.yahimovich.task03classuml.entity.insurance.BankDetails;
import by.yahimovich.task03classuml.entity.insurance.person.Insurer;
import by.yahimovich.task03classuml.entity.insurance.person.Initials;

public class CreateInsurerFactory implements FactoryPerson {

    @Override
    public Insurer createPerson() {
        return new Insurer(
                new Initials("Yahimovich", "Egor", "Aleksandrovich"),
                new Address("Belarus", "Minskiy", "Vileyka", "Nezaleshnosti",
                        "2", "2", "7", 222417),
                new BankDetails(123, 321, "BY12312",
                        54321234, "Hello"), "+375333139380");
    }
}

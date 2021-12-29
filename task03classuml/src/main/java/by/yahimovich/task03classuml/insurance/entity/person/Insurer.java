package by.yahimovich.task03classuml.insurance.entity.person;

import by.yahimovich.task03classuml.insurance.entity.insurance.Address;
import by.yahimovich.task03classuml.insurance.entity.insurance.BankDetails;

public class Insurer extends Person {

    public Insurer(Initials initials, Address address, BankDetails details, String phoneNumber) {
        super(initials, address, details, phoneNumber);
    }
}

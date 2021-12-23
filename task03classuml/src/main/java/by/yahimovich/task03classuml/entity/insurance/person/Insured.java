package by.yahimovich.task03classuml.entity.insurance.person;

import by.yahimovich.task03classuml.entity.insurance.Address;
import by.yahimovich.task03classuml.entity.insurance.BankDetails;

public class Insured extends Person {

    public Insured(Initials initials, Address address, BankDetails details, String phoneNumber) {
        super(initials, address, details, phoneNumber);
    }

}

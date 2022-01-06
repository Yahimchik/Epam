package by.yahimovich.task03classuml.insurance.entity.person;

import by.yahimovich.task03classuml.insurance.entity.insurance.Address;
import by.yahimovich.task03classuml.insurance.entity.insurance.BankDetails;

/**
 * Class person.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Person {

    private Initials initials;
    private Address address;
    private BankDetails details;
    private String phoneNumber;

    public Person() {
    }

    /**
     * Constructor these parameters. The constructor creates a new person.
     *
     * @param initials    Surname -> Name -> Patronymic.
     * @param address     Country -> District -> City -> Street -> House number -> Apartment number
     *                    -> Postcode
     * @param details     Payer initials -> Payer UNP -> Payer address -> Recipient -> Recipient UNP
     *                    -> Recipient IBAN -> Bank recipient BIC -> Appointment.
     * @param phoneNumber Phone number.
     */

    public Person(Initials initials, Address address, BankDetails details, String phoneNumber) {
        this.initials = initials;
        this.address = address;
        this.details = details;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method getInitials.
     *
     * @return Initials.
     */

    public Initials getInitials() {
        return initials;
    }

    /**
     * Method setInitials.
     *
     * @param initials Set new initials for the person.
     * @see Initials
     */

    public void setInitials(Initials initials) {
        this.initials = initials;
    }

    /**
     * Method getAddress.
     *
     * @return Address.
     */

    public Address getAddress() {
        return address;
    }

    /**
     * Method setAddress.
     *
     * @param address Set new address.
     * @see Address
     */

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Method getDetails.
     *
     * @return Details.
     */

    public BankDetails getDetails() {
        return details;
    }

    /**
     * Method setDetails.
     *
     * @param details Set new details.
     * @see BankDetails
     */

    public void setDetails(BankDetails details) {
        this.details = details;
    }

    /**
     * Method getPhoneNumber.
     *
     * @return phoneNumber.
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Method setPhoneNumber.
     * Set new phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nINITIALS: " + getInitials() +
                "\n\nADDRESS: " + getAddress() +
                "\n\nBANK DETAILS: " + getDetails() +
                "\n\nPHONE NUMBER: " + getPhoneNumber() + "\n";
    }
}

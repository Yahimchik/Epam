package by.yahimovich.task03classuml.entity.insurance;

/**
 * Class Address.
 *
 * @author Egor Yahiomvich.
 * @version 1.0
 */

public class Address {

    private String country;
    private String district;
    private String city;
    private String street;
    private String houseNumber;
    private String caseNumber;
    private String apartmentNumber;

    private int postcode;

    /**
     * Constructor these parameters. The address parameters allow you to establish the exact location of the object.
     *
     * @param country         Country name.
     * @param district        District name.
     * @param city            City name.
     * @param street          Street name.
     * @param houseNumber     House number.
     * @param apartmentNumber Apartment number.
     * @param postcode        Postcode.
     */

    public Address(String country, String district, String city, String street,
                   String houseNumber, String apartmentNumber, int postcode) {
        this.country = country;
        this.district = district;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.postcode = postcode;
    }

    /**
     * Constructor these parameters. The address parameters allow you to establish the exact location of the object.
     *
     * @param country         Country name.
     * @param district        District name.
     * @param city            City name.
     * @param street          Street name.
     * @param houseNumber     House number.
     * @param caseNumber      Case Number.
     * @param apartmentNumber Apartment number.
     * @param postcode        Postcode.
     */


    public Address(String country, String district, String city, String street,
                   String houseNumber, String caseNumber, String apartmentNumber, int postcode) {
        this.country = country;
        this.district = district;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.caseNumber = caseNumber;
        this.apartmentNumber = apartmentNumber;
        this.postcode = postcode;
    }

    /**
     * Method getCountry.
     *
     * @return Country name.
     */

    public String getCountry() {
        return country;
    }

    /**
     * Method setCountry.
     *
     * @param country Set new country name.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Method getDistrict.
     *
     * @return District name.
     */

    public String getDistrict() {
        return district;
    }

    /**
     * Method setCountry.
     *
     * @param district Set new district name.
     */

    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Method getCity.
     *
     * @return City name.
     */

    public String getCity() {
        return city;
    }

    /**
     * Method setCountry.
     *
     * @param city Set new city name.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Method getStreet.
     *
     * @return Country name.
     */

    public String getStreet() {
        return street;
    }

    /**
     * Method setCountry.
     *
     * @param street Set new street name.
     */

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Method getHouseNumber.
     *
     * @return House number.
     */

    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Method setCountry.
     *
     * @param houseNumber Set new house number.
     */

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Method getCaseNumber.
     *
     * @return Case number.
     */

    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Method setCountry.
     *
     * @param caseNumber Set new case number.
     */

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * Method getApartmentNumber.
     *
     * @return Apartment number.
     */

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Method setCountry.
     *
     * @param apartmentNumber Set new apartment number.
     */

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    /**
     * Method getPostcode.
     *
     * @return Postcode value.
     */

    public int getPostcode() {
        return postcode;
    }

    /**
     * Method setCountry.
     *
     * @param postcode Set new postcode value.
     */

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    /**
     * Overriding method toString.
     *
     * @return Address to string.
     */

    @Override
    public String toString() {
        return "\nCountry: " + getCountry() +
                "\nDistrict: " + getDistrict() +
                "\nCity: " + getCity() +
                "\nStreet: " + getStreet() +
                "\nHouse number: " + getHouseNumber() +
                "\nCase number: " + getCaseNumber() +
                "\nApartment number: " + getApartmentNumber();
    }
}

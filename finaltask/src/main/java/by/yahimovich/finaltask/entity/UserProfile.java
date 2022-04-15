package by.yahimovich.finaltask.entity;

import java.util.Objects;

/**
 * User profile class.
 * Additional information
 * about the user.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Entity
 */

public class UserProfile extends Entity {
    private Integer id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public UserProfile() {
        super();
    }

    /**
     * Constructor - creates new object.
     *
     * @param id          User identification number.
     * @param firstName   User first name.
     * @param secondName  User second name.
     * @param lastName    User last name.
     * @param phoneNumber User phone number.
     */

    public UserProfile(Integer id, String firstName, String secondName,
                       String lastName, String address,
                       String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method getId.
     *
     * @return User identification number.
     */

    public Integer getId() {
        return id;
    }

    //Тут тоже самое что и с остальными id.

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method getFirstName.
     *
     * @return User first name.
     */

    public String getFirstName() {
        return firstName;
    }


    /**
     * Method setFirstName
     * Set new value for user first name.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method getSecondName.
     *
     * @return User second name.
     */

    public String getSecondName() {
        return secondName;
    }

    /**
     * Method setSecondName.
     * Set new value for user second name.
     */

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Method getLastName.
     *
     * @return User last name.
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Method setLastName.
     * Set new value for user last name.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method getAddress.
     *
     * @return user address.
     */

    public String getAddress() {
        return address;
    }

    /**
     * Method setAddress.
     * Sets new address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method getPhoneNumber.
     *
     * @return User phone number.
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Method setPhoneNumber.
     * Set new value for user phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nFirst name: " + getFirstName()
                + "\nSecond name: " + getSecondName()
                + "\nLast name: " + getLastName()
                + "\nAddress: " + getAddress()
                + "\nPhone number: " + getPhoneNumber();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName,
                lastName, phoneNumber);
    }

    /**
     * Override method equals.
     *
     * @return true or false if the objects
     * are equal or not respectively.
     */

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        UserProfile other = (UserProfile) object;
        return Objects.equals(id, other.id) &&
                firstName.equals(other.firstName) &&
                secondName.equals(other.secondName) &&
                lastName.equals(other.lastName) &&
                phoneNumber.equals(other.phoneNumber);
    }
}

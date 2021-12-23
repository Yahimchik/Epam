package by.yahimovich.task03classuml.entity.insurance.person;

/**
 * Class initials.
 *
 * @author Egor Yahimovich.
 * @version 1.0
 */

public class Initials {

    private String firstName;
    private String secondName;
    private String lastName;

    /**
     * Constructor these parameters. The initials parameters allow you to initialize new person.
     *
     * @param firstName  Surname.
     * @param secondName Name.
     * @param lastName   Patronymic.
     */

    public Initials(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    /**
     * Constructor these parameters. The initials parameters allow you to initialize new person.
     *
     * @param firstName  Surname.
     * @param secondName Name.
     */

    public Initials(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    /**
     * Method getFirstName.
     *
     * @return Surname.
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * Method setFirstName.
     *
     * @param firstName Set new surname for the person.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method getSecondName.
     *
     * @return Name.
     */

    public String getSecondName() {
        return secondName;
    }

    /**
     * Method setSecondName.
     *
     * @param secondName Set new name for the person.
     */

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Method getLastName.
     *
     * @return Patronymic.
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Method setName.
     *
     * @param lastName Set new patronymic for the person.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\nFirst name: " + getFirstName() +
                "\nSurname: " + getSecondName() +
                "\nPatronymic: " + getLastName();
    }
}

package by.yahimovich.finaltask.entity;

import java.util.Objects;

/**
 * Class User.
 * Create new user is system.
 *
 * @author Egor Yahimovich
 * @version 1.3
 * @see Entity
 */

public class User extends Entity {

    private static Integer count = 1;
    private Integer id = 0;
    private String email;
    private String password;
    private String role;

    public User() {
        super();
        id = count++;
    }

    /**
     * Constructor - creates new user as
     * object with parameters
     *
     * @param email    User email. Use email address
     *                 for registration (unique).
     * @param password User password. Use character
     *                 set to protect user profile.
     * @param role     Set user role.
     *                 Example: Trainer or Client.
     */

    public User(String email, String password, String role) {
        id = count++;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    /**
     * Method getId.
     *
     * @return User identification number.
     */

    public Integer getId() {
        return id;
    }

    // Пока не знаю, может потом уберу.
    // Потому что id устанавливается из бд.

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method getEmail.
     *
     * @return User email.
     */

    public String getEmail() {
        return email;
    }

    /**
     * Method setEmail.
     * Set new value for user email.
     * Example: The user decided to change
     * his email.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method getPassword.
     *
     * @return User password.
     */

    public String getPassword() {
        return password;
    }

    /**
     * Method setPassword.
     * Set new password for user profile.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method getRole.
     *
     * @return User role.
     */

    public String getRole() {
        return role;
    }

    /**
     * Method setRole.
     * Set a new role for the user.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nUser name: " + getEmail()
                + "\nPassword: " + getPassword()
                + "\nRole: " + getRole();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, email,
                password, role);
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
        User user = (User) object;
        return Objects.equals(id, user.id) &&
                email.equals(user.email) &&
                password.equals(user.password) &&
                role.equals(user.role);
    }
}

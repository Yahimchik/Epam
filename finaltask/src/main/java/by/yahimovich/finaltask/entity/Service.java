package by.yahimovich.finaltask.entity;

import java.util.Objects;

/**
 * Service class.
 * Services provided by coach.
 *
 * @author Ehor Yahimovich
 * @version 1.0
 * @see Entity
 */

public class Service extends Entity {
    private Integer id;
    private String nameService;

    public Service() {
    }

    /**
     * Constructor - creates new object.
     *
     * @param id   Coach identification number.
     * @param nameService Service name.
     */

    public Service(Integer id, String nameService) {
        this.id = id;
        this.nameService = nameService;
    }

    /**
     * Method getId.
     *
     * @return User identification number.
     */

    public Integer getId() {
        return id;
    }

    //Этот метод я пока не убираю.
    //Но, скорее всего уже знаю что
    //с ним делать.

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Method getName.
     *
     * @return Service name.
     */

    public String getNameService() {
        return nameService;
    }

    /**
     * Method setName.
     * Set new value for service name.
     */

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nName: " + getNameService();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, nameService);
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
        Service service = (Service) object;
        return id.equals(service.id) &&
                nameService.equals(service.nameService);
    }
}

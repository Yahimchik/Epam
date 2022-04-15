package by.yahimovich.finaltask.entity;

import java.util.Objects;

/**
 * Employee specialization class.
 * Store information about employee
 * specialization.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Entity
 */

public class EmployeeSpecialization extends Entity {
    private Integer id;
    private String note;
    private Service service;
    private UserProfile employee;

    public EmployeeSpecialization() {
    }

    /**
     * Constructor - creates new object.
     *
     * @param id       Employee id.
     * @param note     Summary of achievements.
     * @param service  Coach services.
     * @param employee Information about employee.
     */

    public EmployeeSpecialization(Integer id, String note,
                                  Service service,
                                  UserProfile employee) {
        this.id = id;
        this.note = note;
        this.service = service;
        this.employee = employee;
    }

    /**
     * Method getId.
     *
     * @return identification number of
     * specialization.
     */

    public Integer getId() {
        return id;
    }

    //...

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Method getNote.
     *
     * @return Summary of achievements.
     */

    public String getNote() {
        return note;
    }

    /**
     * Method setNote.
     * Set new value for note.
     */

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Method getService.
     *
     * @return Coach services.
     */

    public Service getService() {
        return service;
    }

    /**
     * Method setService.
     * Set new value for service.
     */

    public void setService(Service service) {
        this.service = service;
    }

    /**
     * Method getEmployee.
     *
     * @return Information about coach.
     */

    public UserProfile getEmployee() {
        return employee;
    }

    /**
     * Method setEmployee.
     * Allows set new information
     * about coach.
     */

    public void setEmployee(UserProfile employee) {
        this.employee = employee;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nNote: " + getNote()
                + "\nService: " + getService()
                + "\nEmployee: " + getEmployee();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, note, service, employee);
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
        if (object == null
                || getClass() != object.getClass()) {
            return false;
        }
        EmployeeSpecialization other = (EmployeeSpecialization) object;
        return id.equals(other.id)
                && note.equals(other.note)
                && service.equals(other.service)
                && employee.equals(other.employee);
    }
}

package by.yahimovich.finaltask.entity;

import java.util.Objects;

/**
 * Rooms class.
 * Store information about
 * rooms in the gym.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Entity
 */

public class Rooms extends Entity {
    private Integer id;
    private String name;
    private String description;
    private Schedule schedule;

    /**
     * Constructor - creates new object.
     *
     * @param id          Identification number of the room.
     * @param name        Room name.
     * @param description Description.
     * @param schedule    Information about schedule.
     */

    public Rooms(Integer id, String name,
                 String description, Schedule schedule) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.schedule = schedule;
    }

    /**
     * Method getId.
     *
     * @return room id.
     */

    public Integer getId() {
        return id;
    }

    /**
     * Method setId.
     * Ser new value for room id.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Method getName.
     *
     * @return Room name.
     */

    public String getName() {
        return name;
    }

    /**
     * Method setName.
     * Sets new value for room name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * MethodGetDescription.
     *
     * @return Description.
     */

    public String getDescription() {
        return description;
    }

    /**
     * Method setDescription.
     * Sets new description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method getSchedule.
     *
     * @return Schedule information.
     */

    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Method setSchedule.
     * Sets new schedule.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nName: " + getName()
                + "\nDescription: " + getDescription()
                + "\nSchedule: " + getSchedule();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, schedule);
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
        if (object == null ||
                getClass() != object.getClass()) {
            return false;
        }
        Rooms rooms = (Rooms) object;
        return id.equals(rooms.id) &&
                name.equals(rooms.name) &&
                description.equals(rooms.description) &&
                schedule.equals(rooms.schedule);
    }
}

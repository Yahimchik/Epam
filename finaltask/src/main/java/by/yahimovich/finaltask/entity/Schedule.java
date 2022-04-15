package by.yahimovich.finaltask.entity;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

/**
 * Schedule class.
 * Store schedule information.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Entity
 */

public class Schedule extends Entity {
    private Integer id;
    private Date date;
    private Time timeStart;
    private Time timeEnd;
    private Rooms room;
    private String note;
    private EmployeeSpecialization specialization;

    /**
     * Constructor - creates new object.
     *
     * @param id             Schedule identification number.
     * @param date           Day of the week.
     * @param timeStart      Training start time.
     * @param timeEnd        Training end time.
     * @param room           Information about training room.
     * @param note           Additional information.
     * @param specialization Employees specialization.
     */

    public Schedule(Integer id, Date date, Time timeStart,
                    Time timeEnd, Rooms room, String note,
                    EmployeeSpecialization specialization) {
        this.id = id;
        this.date = date;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.room = room;
        this.note = note;
        this.specialization = specialization;
    }

    /**
     * Method getId.
     *
     * @return Schedule identification number.
     */

    public Integer getId() {
        return id;
    }

    //...

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Method getDate.
     *
     * @return Day of the week.
     */

    public Date getDate() {
        return date;
    }

    /**
     * Method setDate.
     * Set new date value.
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Method getTimeStart.
     *
     * @return Training start time.
     */

    public Time getTimeStart() {
        return timeStart;
    }

    /**
     * Method setTimeStart.
     * Set new training start time.
     */

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * Method getTimeEnd.
     *
     * @return Training end time.
     */

    public Time getTimeEnd() {
        return timeEnd;
    }

    /**
     * Method setTimeEnd.
     * Set new training end time.
     */

    public void setTimeEnd(Time timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * Method getRoom.
     *
     * @return Information about training room.
     */

    public Rooms getRoom() {
        return room;
    }

    /**
     * Method setRoom.
     * Set new information about
     * training room.
     */

    public void setRoom(Rooms room) {
        this.room = room;
    }

    /**
     * Method getNote.
     *
     * @return Additional information.
     */

    public String getNote() {
        return note;
    }

    /**
     * Method setNote.
     * Set new additional information.
     */

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Method getSpecialization.
     *
     * @return Employees specialization.
     */

    public EmployeeSpecialization getSpecialization() {
        return specialization;
    }

    /**
     * Method setSpecialization.
     * Set new Employee specialization.
     */

    public void setSpecialization(EmployeeSpecialization
                                          specialization) {
        this.specialization = specialization;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nDate: " + getDate()
                + "\nTime start: " + getTimeStart()
                + "\nTime end: " + getTimeEnd()
                + "\nRoom: " + getRoom()
                + "\nNote: " + getNote()
                + "\nSpecialization: " + getSpecialization();
    }

    /**
     * Override method hashCode.
     *
     * @return a hash value for an object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, date, timeStart,
                timeEnd, room, note, specialization);
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
        Schedule schedule = (Schedule) object;
        return id.equals(schedule.id) &&
                date.equals(schedule.date) &&
                timeStart.equals(schedule.timeStart) &&
                timeEnd.equals(schedule.timeEnd) &&
                room.equals(schedule.room) &&
                note.equals(schedule.note) &&
                specialization.equals(schedule.specialization);
    }
}

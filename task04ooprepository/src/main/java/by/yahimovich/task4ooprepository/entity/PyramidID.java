package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

/**
 * PyramidID class
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 */

public class PyramidID implements Serializable {

    private int ID;

    /**
     * Constructor - creates new object.
     *
     * @param ID Pyramid ID.
     */

    public PyramidID(int ID) {
        this.ID = ID;
    }

    /**
     * Method getID.
     *
     * @return Pyramid id.
     */

    public int getID() {
        return ID;
    }

    /**
     * Method setID.
     * Set id for pyramid.
     */

    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "ID: " + ID;
    }

    /**
     * Override method hashCode.
     *
     * @return hash value of the object.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (71 * hash + getID());
        return hash;
    }

    /**
     * Override method equals.
     *
     * @return true of objects are equal of false if not.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PyramidID pyramidID = (PyramidID) o;
        return ID == pyramidID.ID;
    }
}

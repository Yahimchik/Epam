package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

public class PyramidID implements Serializable {

    private static int id = 1;
    private int ID = id++;

    public PyramidID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ID: " + ID;
    }

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (71 * hash + getID());
        return hash;
    }
}

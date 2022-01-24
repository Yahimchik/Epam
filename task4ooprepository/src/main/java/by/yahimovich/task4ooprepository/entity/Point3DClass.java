package by.yahimovich.task4ooprepository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties

public class Point3DClass extends Point2DClass implements Serializable {

    /**
     * Point class parameters.
     * x - first value of point.
     * y - second value of point.
     */

    private double z;

    public Point3DClass() {
        super();
    }

    public Point3DClass(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "X: " + getX()
                + ", Y: " + getY()
                + ", Z: " + getZ();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (71 * hash + this.getX());
        hash = (int) (71 * hash + this.getX());
        hash = (int) (71 * hash + this.z);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Point3DClass other)) {
            return false;
        }

        return (this.getX() == other.getX() && this.getY() == other.getY() && z == other.z);
    }
}

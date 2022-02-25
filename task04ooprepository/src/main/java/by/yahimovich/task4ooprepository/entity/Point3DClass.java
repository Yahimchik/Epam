package by.yahimovich.task4ooprepository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Point 3D class
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 * @see Point2DClass
 */

@JsonIgnoreProperties
public class Point3DClass extends Point2DClass implements Serializable {

    private double z;

    public Point3DClass() {
        super();
    }

    /**
     * Constructor - creates new object.
     *
     * @param x coordinate
     * @param y coordinate
     * @param z coordinate
     */


    public Point3DClass(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Method getZ.
     *
     * @return z coordinate of a point.
     */

    public double getZ() {
        return z;
    }

    /**
     * Method setZ.
     * Set new value for z coordinate of a point.
     */

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return "X: " + getX()
                + ", Y: " + getY()
                + ", Z: " + getZ();
    }

    /**
     * Override method toString.
     *
     * @return hash value of the object.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (71 * hash + this.getX());
        hash = (int) (71 * hash + this.getX());
        hash = (int) (71 * hash + this.z);
        return hash;
    }

    /**
     * Override method equals.
     *
     * @return true of objects are equal of false if not.
     */

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

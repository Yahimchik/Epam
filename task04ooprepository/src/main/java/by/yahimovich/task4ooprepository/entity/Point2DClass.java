package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

/**
 * Point 2D class
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 */

public class Point2DClass implements Serializable {

    private double x;
    private double y;

    public Point2DClass() {
        super();
    }

    /**
     * Constructor - creates new object.
     *
     * @param x coordinate
     * @param y coordinate
     */

    public Point2DClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method getX.
     *
     * @return x coordinate of a point.
     */

    public double getX() {
        return x;
    }

    /**
     * Method setX.
     * Set new value for x coordinate of a point.
     */

    public void setX(double x) {
        this.x = x;
    }

    /**
     * Method getY.
     *
     * @return y coordinate of the point.
     */

    public double getY() {
        return y;
    }

    /**
     * Method setY.
     * Set new value for y coordinate of a point.
     */

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Override method toString
     *
     * @return point as string.
     */

    @Override
    public String toString() {
        return "X: " + getX()
                + ", Y: " + getY();
    }

    /**
     * Override method hashCode.
     *
     * @return hash value of the object.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (71 * hash + this.getX());
        hash = (int) (71 * hash + this.getX());
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

        return (this.getX() == other.getX() && this.getY() == other.getY());
    }
}

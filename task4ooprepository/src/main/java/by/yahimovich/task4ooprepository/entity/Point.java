package by.yahimovich.task4ooprepository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties

public class Point {

    /**
     * Point class parameters.
     * x - first value of point.
     * y - second value of point.
     */

    private double x;
    private double y;
    private double z;

    public Point() {
        super();
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(double coordinates) {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
        hash = (int) (71 * hash + this.x);
        hash = (int) (71 * hash + this.y);
        hash = (int) (71 * hash + this.z);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Point other)) {
            return false;
        }

        return (x == other.x && y == other.y && z == other.z);
    }
}

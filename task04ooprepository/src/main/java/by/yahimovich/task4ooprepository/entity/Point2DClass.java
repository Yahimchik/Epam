package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

public class Point2DClass implements Serializable {

    private double x;
    private double y;

    public Point2DClass() {
        super();
    }

    public Point2DClass(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "X: " + getX()
                + ", Y: " + getY();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (71 * hash + this.getX());
        hash = (int) (71 * hash + this.getX());
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

        return (this.getX() == other.getX() && this.getY() == other.getY());
    }
}

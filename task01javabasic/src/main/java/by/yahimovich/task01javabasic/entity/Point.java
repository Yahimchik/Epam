package by.yahimovich.task01javabasic.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return double. Return x-value of point.
     */

    public double getX() {
        return x;
    }

    /**
     * @return double. Return y-value of point.
     */

    public double getY() {
        return y;
    }

    /**
     * Set y-value of point.
     */

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Set x-value of point.
     */

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x " + getX() + " y " + getY();
    }

}

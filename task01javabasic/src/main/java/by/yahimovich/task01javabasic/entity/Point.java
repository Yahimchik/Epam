package by.yahimovich.task01javabasic.entity;

import java.util.ArrayList;
import java.util.List;

public class Point {

    private double x;
    private double y;
    List<Double> list = new ArrayList<>();

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public List<Double> getPoint() {
        return list;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x " + getX() + " y " + getY();
    }

}

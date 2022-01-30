package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

public class Plane implements Serializable {

    double a;
    double b;
    double c;
    double d;

    public Plane(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    @Override
    public String toString() {
        return "A: " + getA()
                + ", B: " + getB()
                + ", C: " + getC()
                + ", D: " + getD();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (71 * hash + this.a);
        hash = (int) (71 * hash + this.b);
        hash = (int) (71 * hash + this.c);
        hash = (int) (71 * hash + this.d);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Plane other)) {
            return false;
        }

        return (a == other.a && b == other.b
                && c == other.c && d == other.d);
    }
}

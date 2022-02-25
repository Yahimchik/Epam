package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

/**
 * Plane class. Creates an equation
 * of the plane.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 */

public class Plane implements Serializable {

    private final double a;
    private final double b;
    private final double c;
    private final double d;

    /**
     * Constructor - creates an equation of the plane.
     * Example: Ax + By + Cz + d = 0.
     *
     * @param a Coefficient before x.
     * @param b Coefficient before y.
     * @param c Coefficient before z.
     * @param d Direction factor.
     */

    public Plane(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Method getA.
     *
     * @return value of coefficient a.
     */

    public double getA() {
        return a;
    }

    /**
     * Method getB.
     *
     * @return value of coefficient b.
     */

    public double getB() {
        return b;
    }

    /**
     * Method getC.
     *
     * @return value of coefficient c.
     */

    public double getC() {
        return c;
    }

    /**
     * Method getD.
     *
     * @return value of coefficient d.
     */

    public double getD() {
        return d;
    }

    /**
     * Override method toString.
     *
     * @return plane as string.
     */

    @Override
    public String toString() {
        return "A: " + getA()
                + ", B: " + getB()
                + ", C: " + getC()
                + ", D: " + getD();
    }

    /**
     * Override method hashCode.
     *
     * @return hash value of object.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (71 * hash + this.a);
        hash = (int) (71 * hash + this.b);
        hash = (int) (71 * hash + this.c);
        hash = (int) (71 * hash + this.d);
        return hash;
    }

    /**
     * Override method equals.
     *
     * @return true if objects equal and false if not equal.
     */

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

package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

/**
 * Triangle class
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 * @see Point2DClass
 * @see Point3DClass
 */

public class Triangle implements Serializable {

    private Point3DClass point1;
    private Point3DClass point2;
    private Point3DClass point3;

    public Triangle() {
        super();
    }

    /**
     * Constructor - create new object.
     *
     * @param point1 First vertex of the triangle.
     * @param point2 Second vertex of the triangle.
     * @param point3 Third vertex of the triangle.
     */

    public Triangle(Point3DClass point1, Point3DClass point2, Point3DClass point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Method getPoint1.
     *
     * @return coordinates of first point.
     */

    public Point3DClass getPoint1() {
        return point1;
    }

    /**
     * Method setPoint1.
     * Set new value for first point coordinates.
     */

    public void setPoint1(Point3DClass point1) {
        this.point1 = point1;
    }

    /**
     * Method getPoint2.
     *
     * @return coordinates of second point.
     */

    public Point3DClass getPoint2() {
        return point2;
    }

    /**
     * Method setPoint2.
     * Set new value for second point coordinates.
     */

    public void setPoint2(Point3DClass point2) {
        this.point2 = point2;
    }

    /**
     * Method getPoint3.
     *
     * @return coordinates of third point.
     */

    public Point3DClass getPoint3() {
        return point3;
    }

    /**
     * Method setPoint3.
     * Set new value for third point coordinates.
     */

    public void setPoint3(Point3DClass point3) {
        this.point3 = point3;
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

    @Override
    public String toString() {
        return " First peak: " + getPoint1()
                + " Second peak: " + getPoint2()
                + " Third peak: " + getPoint3();
    }

    /**
     * Override method toString.
     *
     * @return hash value of the object.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (71 * hash + getPoint1().hashCode());
        hash = (71 * hash + getPoint2().hashCode());
        hash = (71 * hash + getPoint3().hashCode());
        return hash;
    }

    /**
     * Override method equals.
     *
     * @return true of objects are equal of false if not.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return point1 == (triangle.point1) && point2 == (triangle.point2) && point3 == (triangle.point3);
    }
}

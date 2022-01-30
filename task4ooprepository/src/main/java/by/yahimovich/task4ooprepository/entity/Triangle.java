package by.yahimovich.task4ooprepository.entity;

import java.io.Serializable;

public class Triangle implements Serializable {

    private Point3DClass point1;
    private Point3DClass point2;
    private Point3DClass point3;

    public Triangle() {
        super();
    }

    public Triangle(Point3DClass point1, Point3DClass point2, Point3DClass point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point3DClass getPoint1() {
        return point1;
    }

    public void setPoint1(Point3DClass point1) {
        this.point1 = point1;
    }

    public Point3DClass getPoint2() {
        return point2;
    }

    public void setPoint2(Point3DClass point2) {
        this.point2 = point2;
    }

    public Point3DClass getPoint3() {
        return point3;
    }

    public void setPoint3(Point3DClass point3) {
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return " First peak: " + getPoint1()
                + " Second peak: " + getPoint2()
                + " Third peak: " + getPoint3();
    }

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (71 * hash + getPoint1().hashCode());
        hash = (71 * hash + getPoint2().hashCode());
        hash = (71 * hash + getPoint3().hashCode());
        return hash;
    }
}

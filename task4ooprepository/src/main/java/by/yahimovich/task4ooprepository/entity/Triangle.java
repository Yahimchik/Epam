package by.yahimovich.task4ooprepository.entity;

public class Triangle {

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
}

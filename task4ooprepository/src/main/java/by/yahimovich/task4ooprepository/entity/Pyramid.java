package by.yahimovich.task4ooprepository.entity;

import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.io.Serializable;
import java.util.List;

public class Pyramid implements Serializable {

    private PyramidID ID;
    private List<Point3DClass> pointsOfPyramid;

    public Pyramid() {
        super();
    }

    public Pyramid(List<Point3DClass> pointsOfPyramid) {
        this.pointsOfPyramid = pointsOfPyramid;
    }

    public Pyramid(PyramidID ID, List<Point3DClass> pointsOfPyramid) {
        this.ID = ID;
        this.pointsOfPyramid = pointsOfPyramid;
    }

    public Pyramid(int countOfPeaks) throws PyramidException {
        if (countOfPeaks < 4) { // TODO сделал только для выпуклой пирамиды, надо сделать для вогнутой
            throw new PyramidException();
        }
    }

    public int getID() {
        return ID.getID();
    }

    public List<Point3DClass> getPointsOfPyramid() {
        return pointsOfPyramid;
    }

    public int getCountOfPeaks() {
        return pointsOfPyramid.size();
    }


    public void setPointsOfPyramid(int index, double x, double y, double z) {
        pointsOfPyramid.get(index).setX(x);
        pointsOfPyramid.get(index).setY(y);
        pointsOfPyramid.get(index).setZ(z);
    }

    public Point3DClass getPeak(int i) {
        return pointsOfPyramid.get(i);
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder str = new StringBuilder("Pyramid ID: " + getID() + "\nPoints: " + getCountOfPeaks() + "\n");
        for (Object object : pointsOfPyramid) {
            str.append(object).append(BLANK);
            str.append("\n");
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pyramid pyramid = (Pyramid) o;
        return ID == (pyramid.ID) && pointsOfPyramid == (pyramid.pointsOfPyramid);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (71 * hash * getCountOfPeaks() * getID());
        return hash;
    }
}

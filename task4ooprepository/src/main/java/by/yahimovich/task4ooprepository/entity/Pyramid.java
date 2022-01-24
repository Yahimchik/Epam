package by.yahimovich.task4ooprepository.entity;

import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.service.PlaneService;
import by.yahimovich.task4ooprepository.service.PyramidService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties

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


    public void setPointsOfPyramid() {
        pointsOfPyramid.set(0, new Point3DClass(1, 1, 0));
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

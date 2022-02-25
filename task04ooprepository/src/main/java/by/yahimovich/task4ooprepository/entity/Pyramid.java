package by.yahimovich.task4ooprepository.entity;

import by.yahimovich.task4ooprepository.entity.exception.PyramidException;

import java.io.Serializable;
import java.util.List;

/**
 * Pyramid class
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 * @see PyramidException
 */

public class Pyramid implements Serializable {

    private PyramidID ID;
    private List<Point3DClass> pointsOfPyramid;

    public Pyramid() {
        super();
    }

    /**
     * Constructor - creates new object.
     *
     * @param pointsOfPyramid List of points.
     *                        Create new pyramid by points.
     */

    public Pyramid(List<Point3DClass> pointsOfPyramid) {
        this.pointsOfPyramid = pointsOfPyramid;
    }

    /**
     * Constructor - creates new object.
     *
     * @param ID              Set id for new pyramid.
     * @param pointsOfPyramid List of points.
     *                        Create new pyramid by points.
     */

    public Pyramid(PyramidID ID, List<Point3DClass> pointsOfPyramid) {
        this.ID = ID;
        this.pointsOfPyramid = pointsOfPyramid;
    }

    /**
     * Constructor - creates new object.
     *
     * @param countOfPeaks Creates new pyramid with the number of points.
     * @throws PyramidException If count of peeks less than 4.
     */

    public Pyramid(int countOfPeaks) throws PyramidException {
        if (countOfPeaks < 4) { // TODO сделал только для выпуклой пирамиды, надо сделать для вогнутой
            throw new PyramidException();
        }
    }

    /**
     * Method getID.
     *
     * @return pyramid id.
     */

    public int getID() {
        return ID.getID();
    }

    /**
     * Method getPointsOfPyramid.
     *
     * @return list of pyramid points.
     */

    public List<Point3DClass> getPointsOfPyramid() {
        return pointsOfPyramid;
    }

    /**
     * Method getCountOfPeeks.
     *
     * @return count of pyramid peeks.
     */

    public int getCountOfPeaks() {
        return pointsOfPyramid.size();
    }


    public void setPointsOfPyramid(int index, double x, double y, double z) {
        pointsOfPyramid.get(index).setX(x);
        pointsOfPyramid.get(index).setY(y);
        pointsOfPyramid.get(index).setZ(z);
    }

    /**
     * Method getPeek.
     *
     * @param i Index of pyramid peek.
     * @return Pyramid peek by index.
     */

    public Point3DClass getPeak(int i) {
        return pointsOfPyramid.get(i);
    }

    /**
     * Override method toString.
     *
     * @return object as string.
     */

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

    /**
     * Override method toString.
     *
     * @return hash value of the object.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (71 * hash * getCountOfPeaks() * getID());
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
        Pyramid pyramid = (Pyramid) o;
        return ID == (pyramid.ID) && pointsOfPyramid == (pyramid.pointsOfPyramid);
    }
}

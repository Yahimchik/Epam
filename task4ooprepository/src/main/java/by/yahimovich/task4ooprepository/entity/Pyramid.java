package by.yahimovich.task4ooprepository.entity;

import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import by.yahimovich.task4ooprepository.service.PyramidService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties

public class Pyramid {

    PyramidID ID;
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
        if (countOfPeaks < 4 && !(new PyramidService().isPyramid(new Pyramid()))) { // TODO попробовать сделать для n точек
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

    public Point3DClass getPeak(int i) {
        return pointsOfPyramid.get(i);
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder str = new StringBuilder("\nPoints: " + getCountOfPeaks() + "\n");
        for (Object object : pointsOfPyramid) {
            str.append(object).append(BLANK);
            str.append("\n");
        }
        return str.toString();
    }
}

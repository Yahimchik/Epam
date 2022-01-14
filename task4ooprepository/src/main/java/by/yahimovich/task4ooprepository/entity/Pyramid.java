package by.yahimovich.task4ooprepository.entity;

import by.yahimovich.task4ooprepository.entity.exception.PyramidException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties

public class Pyramid {

    private static int id = 1;
    private int ID = id++;
    private List<Point> pointsOfPyramid;

    public Pyramid() {
        super();
    }

    public Pyramid(int ID, List<Point> pointsOfPyramid) {
        this.ID = ID;
        this.pointsOfPyramid = pointsOfPyramid;
    }

    public Pyramid(List<Point> points) {
        this.pointsOfPyramid = points;
    }

    public Pyramid(int countOfPeaks) throws PyramidException {
        if (countOfPeaks < 4) { // TODO попробовать сделать для n точек
            throw new PyramidException();
        }
    }
    
    public int getID() {
        return ID;
    }

    public List<Point> getPointsOfPyramid() {
        return pointsOfPyramid;
    }

    public int getCountOfPeaks() {
        return pointsOfPyramid.size();
    }

    public Point getPeak(int i) {
        return pointsOfPyramid.get(i);
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder str = new StringBuilder("\nPoints: " + pointsOfPyramid.size() + "\n");
        for (Object object : pointsOfPyramid) {
            str.append(object).append(BLANK);
            str.append("\n");
        }
        return str.toString();
    }
}

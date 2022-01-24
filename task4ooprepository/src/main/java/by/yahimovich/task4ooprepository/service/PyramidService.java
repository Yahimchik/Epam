package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Plane;
import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.Triangle;
import by.yahimovich.task4ooprepository.service.comparator.PointComparator;

import java.util.ArrayList;
import java.util.List;

public class PyramidService extends PointService {

    PointService pointService = new PointService();
    TriangleService triangleService = new TriangleService();
    PlaneService planeService = new PlaneService();

    public boolean isPyramid(Pyramid pyramid) {
        Plane plane = plane(pyramid);

        List<Point3DClass> points = pyramidPoints(pyramid);

        double res;
        int count = 0;

        for (int i = 3; i < points.size(); i++) {
            res = plane.getA() * pyramid.getPeak(i).getX()
                    + plane.getB() * pyramid.getPeak(i).getY()
                    + plane.getC() * pyramid.getPeak(i).getZ()
                    + plane.getD();
            if (res != 0) {
                count++;
            }
        }

        return count == 1;
    }

    private List<Point3DClass> pyramidPoints(Pyramid pyramid) {
        List<Point3DClass> point3DS = new ArrayList<>();
        for (int i = 0; i < pyramid.getCountOfPeaks(); ++i) {
            point3DS.add(pyramid.getPeak(i));
        }
        return point3DS;
    }

    private List<Point3DClass> pointsOfPyramidBase(Pyramid pyramid) {
        List<Point3DClass> point3DS = new ArrayList<>();
        for (int i = 0; i < pyramid.getCountOfPeaks(); ++i) {
            point3DS.add(pyramid.getPeak(i));
        }
        point3DS.remove(6);
        return point3DS;
    }

    private List<Point3DClass> pyramidTop(Pyramid pyramid) {
        List<Point3DClass> points = new ArrayList<>();
        points.add(pyramid.getPeak(6));
        return points;
    }

    private List<Double> sidesOfPyramidBase(List<Point3DClass> points) {
        List<Double> listOfSides = new ArrayList<>(); // Стороны основания пирамиды
        for (int i = 0; i < points.size() - 1; ++i) {
            listOfSides.add(pointService.sideLength(points.get(i), points.get(i + 1)));
        }
        listOfSides.add(pointService.sideLength(points.get(points.size() - 1), points.get(0)));
        return listOfSides;
    }

    private void sortPoints(List<Point3DClass> pointsOfBase) {
        PointComparator comparator = new PointComparator();
        pointsOfBase.sort(comparator);
    }

    private List<Triangle> triangulationPyramidBase(List<Point3DClass> pointsOfBase) {
        List<Triangle> triangles = new ArrayList<>();
        sortPoints(pointsOfBase);
        for (int i = 1; i < pointsOfBase.size() - 1; ++i) {
            triangles.add(new Triangle(pointsOfBase.get(0), pointsOfBase.get(i), pointsOfBase.get(i + 1)));
        }
        return triangles;
    }

    public double triangulationPyramid(Pyramid pyramid) {
        List<Point3DClass> points = pointsOfPyramidBase(pyramid);
        sortPoints(points);
        List<Point3DClass> topPoint = pyramidTop(pyramid);
        Point3DClass pointTop = topPoint.get(0);
        List<Triangle> trianglesOfPyramid = new ArrayList<>();

        for (int i = 0; i < points.size() - 1; ++i) {
            trianglesOfPyramid.add(new Triangle(pointTop, points.get(i), points.get(i + 1)));
        }
        trianglesOfPyramid.add(new Triangle(pointTop, points.get(5), points.get(0)));

        double square = 0;

        for (int i = 0; i < trianglesOfPyramid.size(); ++i) {
            square += triangleService.triangleSquare(trianglesOfPyramid.get(i));
        }

        double baseSquare = pyramidBaseSquare(pyramid);

        return square + baseSquare;

    }

    //Количество треугольников в основании пирамиды = n - 2, где n - количество вершин (точек)

    private double pyramidBaseSquare(Pyramid pyramid) {
        List<Point3DClass> pointsOfBase = pointsOfPyramidBase(pyramid); // Точки основания пирамиды
        List<Triangle> triangles = triangulationPyramidBase(pointsOfBase);

        double squareOfPyramidBase = 0;

        for (Triangle value : triangles) {
            squareOfPyramidBase += triangleService.triangleSquare(value);
        }

        return (float) squareOfPyramidBase;
    }

    public double pyramidVolume(Pyramid pyramid) {
        double base = pyramidBaseSquare(pyramid);
        double high = pyramidHigh(pyramid);
        return (1.0 / 3.0) * base * high;
    }

    private double pyramidHigh(Pyramid pyramid) {
        Plane plane = plane(pyramid);

        List<Point3DClass> points = pyramidTop(pyramid);

        double t = -((plane.getA() * points.get(0).getX()
                + plane.getB() * points.get(0).getY()
                + plane.getC() * points.get(0).getZ()
                + plane.getD())
                / (Math.pow(plane.getA(), 2) + Math.pow(plane.getB(), 2) + Math.pow(plane.getC(), 2)));

        double x = points.get(0).getX() + plane.getA() * t;
        double y = points.get(0).getY() + plane.getB() * t;
        double z = points.get(0).getZ() + plane.getC() * t;

        return pointService.sideLength(new Point3DClass(x, y, z), points.get(0));
    }

    private Plane plane(Pyramid pyramid) {
        return planeService.createPlane(
                pyramid.getPeak(0),
                pyramid.getPeak(1),
                pyramid.getPeak(2)
        );
    }
}

package by.yahimovich.task4ooprepository.service;

import by.yahimovich.task4ooprepository.entity.Plane;
import by.yahimovich.task4ooprepository.entity.Point3DClass;
import by.yahimovich.task4ooprepository.entity.Pyramid;
import by.yahimovich.task4ooprepository.entity.Triangle;
import by.yahimovich.task4ooprepository.service.comparator.PointComparator;

import java.util.ArrayList;
import java.util.List;

public class PyramidService extends PointService {

    PointService service1 = new PointService();
    TriangleService service = new TriangleService();

    public boolean isPyramid(Pyramid pyramid) {
        Plane plane = createPlane(
                pyramid.getPeak(0),
                pyramid.getPeak(1),
                pyramid.getPeak(2)
        );

        double res;
        int count = 0;

        for (int i = 3; i < pyramid.getCountOfPeaks(); i++) {
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

    public List<Point3DClass> pointsOfPyramidBase(Pyramid pyramid) {
        List<Point3DClass> point3DS = new ArrayList<>();
        for (int i = 0; i < pyramid.getCountOfPeaks(); ++i) {
            point3DS.add(pyramid.getPeak(i));
        }
        point3DS.remove(6);
        return point3DS;
    }

    private List<Double> sidesOfPyramid(List<Point3DClass> points) {
        List<Double> listOfSides = new ArrayList<>(); // Стороны основания пирамиды
        for (int i = 0; i < points.size() - 1; ++i) {
            listOfSides.add(service1.sideLength(points.get(i), points.get(i + 1)));
        }
        listOfSides.add(service1.sideLength(points.get(points.size() - 1), points.get(0)));
        return listOfSides;
    }

    public void sortPoints(List<Point3DClass> pointsOfBase) {
        PointComparator comparator = new PointComparator();
        pointsOfBase.sort(comparator);
    }

    public List<Triangle> triangulationPyramidBase(List<Point3DClass> pointsOfBase) {
        List<Triangle> triangles = new ArrayList<>();
        sortPoints(pointsOfBase);
        for (int i = 1; i < pointsOfBase.size() - 1; ++i) {
            triangles.add(new Triangle(pointsOfBase.get(0), pointsOfBase.get(i), pointsOfBase.get(i + 1)));
        }
        return triangles;
    }

    //Количество треугольников в основании пирамиды = n - 2, где n - количество вершин (точек)

    public double pyramidBaseSquare(Pyramid pyramid) {
        List<Point3DClass> pointsOfBase = pointsOfPyramidBase(pyramid); // Точки основания пирамиды
        List<Triangle> triangles = triangulationPyramidBase(pointsOfBase);

        double squareOfPyramidBase = 0;

        for (Triangle value : triangles) {
            squareOfPyramidBase += service.triangleSquare(value);
        }

        return (float) squareOfPyramidBase;
    }
}

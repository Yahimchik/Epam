package by.yahimovich.task01javabasic.controller.impl.arithmetic;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Point;
import by.yahimovich.task01javabasic.service.ArithmeticService;
import by.yahimovich.task01javabasic.service.GeometryService;

import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class NearestPoint implements Command {

    private final GeometryService service;
    private final ArithmeticService arithmeticService;
    private final List<Point> points;

    public NearestPoint(GeometryService service, ArithmeticService arithmeticService, List<Point> points) {
        this.service = service;
        this.arithmeticService = arithmeticService;
        this.points = points;
    }

    @Override
    public void execute() {
        String str;

        double section1 = service.sideLength(points.get(0).getX(), points.get(0).getY(),
                0, 0);
        double section2 = service.sideLength(points.get(1).getX(), points.get(1).getY(),
                0, 0);
        double res = arithmeticService.min(section1, section2);

        if (res == section1 && res == section2) {
            str = "Points are at the same distance.\n";
        } else if (res == section1) {
            str = "First point is closer (" + points.get(0).getX() + ", " + points.get(0).getY() + ")\n";
        } else {
            str = "Second point is closer (" + points.get(1).getX() + ", " + points.get(1).getY() + ")\n";
        }
        System.out.print(str);
    }
}

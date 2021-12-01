package by.yahimovich.task01javabasic.service;

public class GeometryService {
    public double hypotenuse(double a, double b) {
        ArithmeticService service = new ArithmeticService();
        return service.sqrt(service.degree(a, 2) + service.degree(b, 2));
    }

    public double square(double a, double b) {
        return (a * b) / 2;
    }

    public double perimeter(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        } else {
            System.out.print("Triangle does not exist: ");
        }
        return 0;
    }

    public double sideLength(double x2, double y2, double x1, double y1) {
        ArithmeticService service = new ArithmeticService();
        return service.sqrt(service.sum(service.degree((x2 - x1), 2), service.degree((y2 - y1), 2)));
    }

    public double height(double a, double b, double c) {
        ArithmeticService service = new ArithmeticService();
        double p = (a + b + c) / 2;
        return (2 * service.sqrt(p * (p - a) * (p - b) * (p - c))) / a;
    }
}

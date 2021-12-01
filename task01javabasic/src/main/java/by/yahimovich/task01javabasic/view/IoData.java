package by.yahimovich.task01javabasic.view;

import java.util.List;
import java.util.Scanner;

public class IoData {
    Scanner scanner = new Scanner(System.in);

    public int intInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("That not a number! Try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double input() {
        while (!scanner.hasNextDouble()) {
            System.out.print("That not a number! Try again: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void output(String arg) {
        System.out.print(arg);
    }

    public void output(String arg, double result) {
        System.out.println(arg + result);
    }

    public void output(String arg, List<Double> result) {
        System.out.println(arg + result);
    }
}

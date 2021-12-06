package by.yahimovich.task01javabasic.view;

import java.util.Scanner;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Scanner
 */

public class IoData {
    Scanner scanner = new Scanner(System.in);

    /**
     * Method which give opportunity to input integer value
     *
     * @return integer value
     * @see Scanner
     */

    public int intInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("That not a number! Try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Method which give opportunity to input double value
     *
     * @return double value
     * @see Scanner
     */

    public double input() {
        while (!scanner.hasNextDouble()) {
            System.out.print("That not a number! Try again: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    /**
     * Method which give opportunity to output value
     *
     * @param arg - argument which can accept values
     * @see Scanner
     */

    public void output(String arg) {
        System.out.print(arg);
    }

    /**
     * Method which give opportunity to output value
     *
     * @param arg - argument which can accept values
     * @see Scanner
     */

    public void output(String arg, double result) {
        System.out.println(arg + result);
    }
}

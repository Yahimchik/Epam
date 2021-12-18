package by.yahimovich.task02arraysdecomposition.view.inputinfo;

import java.util.Scanner;

public class IoInfo {

    public Scanner scanner = new Scanner(System.in);

    public double input() {
        while (!scanner.hasNextInt()) {
            System.out.print("Try again: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void output(String str) {
        System.out.print(str);
    }
}

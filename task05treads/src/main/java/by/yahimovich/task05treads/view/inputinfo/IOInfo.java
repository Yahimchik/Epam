package by.yahimovich.task05treads.view.inputinfo;

import java.util.Scanner;

public class IOInfo {

    public Scanner scanner = new Scanner(System.in);

    public int input() {
        while (!scanner.hasNextInt()) {
            System.out.print("Try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void output(String str) {
        System.out.print(str);
    }
}

package by.yahimovich.task03classuml.insurance.view.inputdata;

import java.util.List;
import java.util.Scanner;

public class IOData extends IODataAbstract {

    public IOData() {
    }

    public int input() {
        return new Scanner(System.in).nextInt();
    }

    public void output() {
        System.out.println();
    }

    public void output(String s) {
        System.out.print(s);
    }

    public static void output(List list) {
        for (Object element : list) {
            System.out.print(element);
        }
    }

    public void output(double value) {
        System.out.print(value);
    }
}

package by.yahimovich.task05treads.view.inputinfo;


import by.yahimovich.task05treads.entity.GenericArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see IOInfo
 */

public class InputArrayFromFile extends IOInfo implements Callable<GenericArray<Number>> {


    private final String fileName;

    public InputArrayFromFile(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Method call.
     *
     * @return array with input values from file.
     * @throws FileNotFoundException If file not found.
     * @throws ArithmeticException   If the creation of the array is incorrect -> throws ArithmeticException.
     */

    @Override
    public GenericArray<Number> call() throws Exception {
        scanner = new Scanner(new File(fileName));
        int N = scanner.nextInt();
        GenericArray<Number> array = new GenericArray<>(N);

        for (int i = 0; i < N; ++i) {
            array.setElement(i, scanner.nextInt());
        }
        System.out.println(Thread.currentThread().getName());
        return array;
    }
}

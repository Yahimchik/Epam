package by.yahimovich.task02arraysdecomposition.view.inputinfo;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see IoInfo
 */

public class InputArrayFromFile extends IoInfo {

    /**
     * Method input.
     *
     * @param fileName Takes file name.
     * @return array with input values from file.
     * @throws FileNotFoundException if file not found.
     * @throws ArithmeticException   If the creation of the array is incorrect -> throws ArithmeticException.
     */

    public GenericArray<Number> input(String fileName) throws FileNotFoundException, ArithmeticException {
        scanner = new Scanner(new File(fileName));
        int N = scanner.nextInt();
        GenericArray<Number> array = new GenericArray<>(N);

        for (int i = 0; i < N; ++i) {
            array.setElement(i, scanner.nextDouble());
        }
        return array;
    }
}

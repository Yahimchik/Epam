package by.yahimovich.task02arraysdecomposition.view.inputinfo;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputArrayFromFile extends IoInfo {

    public GenericArray<Number> inputArray() throws FileNotFoundException, ArrayException {
        scanner = new Scanner(new File("array.txt"));
        int N = scanner.nextInt();
        GenericArray<Number> array = new GenericArray<>(N);

        for (int i = 0; i < N; ++i) {
            array.setElement(i, scanner.nextDouble());
        }
        return array;
    }
}

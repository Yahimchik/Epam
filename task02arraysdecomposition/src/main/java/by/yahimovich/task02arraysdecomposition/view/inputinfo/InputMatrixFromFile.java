package by.yahimovich.task02arraysdecomposition.view.inputinfo;

import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputMatrixFromFile extends IoInfo {

    public GenericMatrix<Number> input(String fileName) throws FileNotFoundException, ArithmeticException {
        scanner = new Scanner(new File(fileName));
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        GenericMatrix<Number> matrix = new GenericMatrix<>(rows, columns);

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                matrix.setElement(i, j, scanner.nextDouble());
            }
        }
        return matrix;
    }
}

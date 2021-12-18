package by.yahimovich.task02arraysdecomposition.view.inputinfo;

import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.entity.exception.MatrixException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputMatrixFromFile extends IoInfo {

    public GenericMatrix<Number> inputMatrix() throws FileNotFoundException, MatrixException {
        scanner = new Scanner(new File("matrix.txt"));
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

package by.yahimovich.task05treads.view.inputinfo;


import by.yahimovich.task05treads.entity.GenericMatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class InputMatrixFromFile extends IOInfo implements Callable<GenericMatrix<Number>> {

    private final String fileName;

    public InputMatrixFromFile(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Method call.
     *
     * @return Matrix with input values from file.
     * @throws FileNotFoundException If file not found.
     * @throws ArithmeticException   If the creation of the matrix is incorrect -> throws ArithmeticException.
     */

    @Override
    public GenericMatrix<Number> call() throws Exception {
        scanner = new Scanner(new File(fileName));
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        GenericMatrix<Number> matrix = new GenericMatrix<>(rows, columns);

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                matrix.setElement(i, j, scanner.nextInt());
            }
        }
        return matrix;
    }
}

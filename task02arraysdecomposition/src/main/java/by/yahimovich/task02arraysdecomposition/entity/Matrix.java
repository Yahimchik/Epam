package by.yahimovich.task02arraysdecomposition.entity;

import by.yahimovich.task02arraysdecomposition.exception.MatrixException;

public class Matrix {

    private final double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int verticalSize, int horizontalSize) throws MatrixException {
        if (verticalSize < 1 || horizontalSize < 1) {
            throw new MatrixException();
        }
        matrix = new double[verticalSize][horizontalSize];
    }

    public int getVerticalSize() {
        return matrix.length;
    }

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    public double getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) {
            return matrix[i][j];
        } else {
            throw new MatrixException();
        }
    }

    public void setElement(int i, int j, double value) throws MatrixException {
        if (checkRange(i, j)) {
            matrix[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }

    public boolean checkRange(int i, int j) {
        return i >= 0 && i <= matrix.length - 1 && j >= 0 && j <= matrix[0].length - 1;
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder str = new StringBuilder("\nMatrix: " + matrix.length + "x" + matrix[0].length + "\n");
        for (double[] row : matrix) {
            for (double value : row) {
                str.append(value).append(BLANK);
            }
            str.append("\n");
        }
        return str.toString();
    }
}

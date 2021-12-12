package by.yahimovich.task02arraysdecomposition.service;

import by.yahimovich.task02arraysdecomposition.entity.Matrix;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;

public class MatrixService {

    public Matrix multiplyMatrix(Matrix first, Matrix second) throws MatrixException {
        if (first.getHorizontalSize() != second.getVerticalSize()) {
            throw new MatrixException("count of rows != count of columns");
        }
        Matrix result = new Matrix(first.getVerticalSize(), second.getHorizontalSize());
        try {
            for (int i = 0; i < first.getVerticalSize(); ++i) {
                for (int j = 0; j < second.getHorizontalSize(); ++j) {
                    double value = 0;
                    for (int k = 0; k < first.getHorizontalSize(); ++k) {
                        value += first.getElement(i, k) * second.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
            throw new MatrixException();
        }
        return result;
    }

    public Matrix matrixSum(Matrix first, Matrix second) throws MatrixException {
        if (first.getVerticalSize() != second.getVerticalSize() &&
                first.getHorizontalSize() != second.getHorizontalSize()) {
            throw new MatrixException();
        } else {

            Matrix result = new Matrix(first.getVerticalSize(), second.getHorizontalSize());

            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                for (int j = 0; j < second.getVerticalSize(); ++j) {
                    result.setElement(i, j, first.getElement(i, j) + second.getElement(i, j));
                }
            }
            return result;
        }
    }

    public Matrix matrixSub(Matrix first, Matrix second) throws MatrixException {
        if (first.getVerticalSize() != second.getVerticalSize() &&
                first.getHorizontalSize() != second.getHorizontalSize()) {
            throw new MatrixException();
        } else {

            Matrix result = new Matrix(first.getVerticalSize(), second.getHorizontalSize());
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                for (int j = 0; j < second.getVerticalSize(); ++j) {
                    result.setElement(i, j, first.getElement(i, j) - second.getElement(i, j));
                }
            }
            return result;
        }
    }

    public Matrix transposeMatrix(Matrix first) throws MatrixException {
        Matrix result = new Matrix(first.getVerticalSize(), first.getHorizontalSize());
        for (int i = 0; i < first.getVerticalSize(); ++i) {
            for (int j = 0; j < first.getHorizontalSize(); ++j) {
                result.setElement(i, j, first.getElement(j, i));
            }
        }
        return result;
    }

    public static Matrix inverseMatrix(Matrix firstMatrix) throws MatrixException {
        Matrix x = new Matrix(firstMatrix.getVerticalSize(), firstMatrix.getVerticalSize());
        Matrix b = new Matrix(firstMatrix.getVerticalSize(), firstMatrix.getVerticalSize());
        int[] index = new int[firstMatrix.getVerticalSize()];

        for (int i = 0; i < firstMatrix.getVerticalSize(); i++) {
            b.setElement(i, i, 1);
        }

        gauss(firstMatrix, index);

        for (int i = 0; i < firstMatrix.getVerticalSize() - 1; i++) {
            for (int j = i + 1; j < firstMatrix.getVerticalSize(); j++) {
                for (int k = 0; k < firstMatrix.getVerticalSize(); k++) {
                    b.setElement(index[j], k, (firstMatrix.getElement(index[j], (int) (i * b.getElement(index[i], k)))));
                }
            }
        }

        for (int i = 0; i < firstMatrix.getVerticalSize(); ++i) {
            x.setElement(firstMatrix.getVerticalSize() - 1,
                    i, b.getElement(index[firstMatrix.getVerticalSize() - 1], (int) (i /
                            firstMatrix.getElement(index[firstMatrix.getVerticalSize() - 1], firstMatrix.getVerticalSize() - 1))));
            for (int j = firstMatrix.getVerticalSize() - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < firstMatrix.getVerticalSize(); ++k) {
                    x[j][i] -= firstMatrix[index[j]][k] * x[k][i];
                }
                x[j][i] /= firstMatrix[index[j]][j];
            }
        }

        return x;
    }

    /*
     *
     *  Реализация самого метода Гаусса
     *
     */

    public static void gauss(Matrix firstMatrix, int[] index) throws MatrixException {
        double[] result = new double[firstMatrix.getVerticalSize()];
        for (int i = 0; i < firstMatrix.getVerticalSize(); i++) {
            index[i] = i;
        }

        for (int i = 0; i < firstMatrix.getVerticalSize(); i++) {
            double temp = 0;
            for (int j = 0; j < firstMatrix.getVerticalSize(); j++) {
                double temp1 = Math.abs(firstMatrix.getElement(i, j));
                if (temp1 > temp) {
                    temp = temp1;
                }
            }
            result[i] = temp;
        }

        int k = 0;
        for (int j = 0; j < firstMatrix.getVerticalSize() - 1; j++) {
            double pi1 = 0;
            for (int i = j; i < firstMatrix.getVerticalSize(); i++) {
                double pi0 = Math.abs(firstMatrix.getElement(index[i], i));
                pi0 /= result[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < firstMatrix.getVerticalSize(); i++) {
                double pj = firstMatrix.getElement(index[i], j)) /firstMatrix.getElement(index[j], j));
                firstMatrix.setElement(index[i], j, pj);
                for (int l = j + 1; l < firstMatrix.getVerticalSize(); l++) {
                    firstMatrix.setElement(index[i], l, pj * firstMatrix.getElement(index[j], l));
                }
            }
        }
    }

}

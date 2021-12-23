package by.yahimovich.task02arraysdecomposition.service;

import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.service.exception.ServiceException;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Number
 * @see ServiceException
 */

public class MatrixService {

    /**
     * Multiply matrix.
     *
     * @param first  1st parameter is first matrix.
     * @param second 2nd parameter is second matrix.
     *               Result - matrix multiplication.
     * @return GenericMatrix
     * @throws ServiceException    if try -> catch block takes ArithmeticException -> throws ServiceException
     * @throws ArithmeticException if count of roes != count of columns -> throws ArithmeticException.
     */

    public GenericMatrix<Number> multiplyMatrix(GenericMatrix<Number> first, GenericMatrix<Number> second)
            throws ServiceException {
        try {
            if (first.getHorizontalSize() != second.getVerticalSize()) {
                throw new ArithmeticException("count of rows != count of columns");
            }
            GenericMatrix<Number> result = new GenericMatrix<>(first.getVerticalSize(), second.getHorizontalSize());
            for (int i = 0; i < first.getVerticalSize(); ++i) {
                for (int j = 0; j < second.getHorizontalSize(); ++j) {
                    double value = 0;
                    for (int k = 0; k < first.getHorizontalSize(); ++k) {
                        value += (first.getElement(i, k).doubleValue() * second.getElement(k, j).doubleValue());
                    }
                    result.setElement(i, j, value);
                }
            }
            return result;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Sum matrix.
     *
     * @param first  1st parameter is first matrix.
     * @param second 2nd parameter is second matrix.
     *               Result - matrix sum.
     * @return GenericMatrix
     * @throws ServiceException    if try -> catch block takes ArithmeticException -> throws ServiceException
     * @throws ArithmeticException if rows and columns of matrix not equal -> throws ArithmeticException.
     */

    public GenericMatrix<?> matrixSum(GenericMatrix<?> first, GenericMatrix<?> second) throws ServiceException {
        try {
            if (first.getVerticalSize() != second.getVerticalSize() &&
                    first.getHorizontalSize() != second.getHorizontalSize()) {
                throw new ArithmeticException();
            }
            GenericMatrix<?> result = new GenericMatrix<>(first.getVerticalSize(), second.getHorizontalSize());
            for (int i = 0; i < first.getVerticalSize(); ++i) {
                for (int j = 0; j < second.getHorizontalSize(); ++j) {
                    result.setElement(i, j, first.getElement(i, j).doubleValue() +
                            second.getElement(i, j).doubleValue());
                }
            }
            return result;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Subtract matrix.
     *
     * @param first  1st parameter is first matrix.
     * @param second 2nd parameter is second matrix.
     *               Result - matrix subtract.
     * @return GenericMatrix
     * @throws ServiceException    if try -> catch block takes ArithmeticException -> throws ServiceException
     * @throws ArithmeticException if count of roes != count of columns -> throws ArithmeticException.
     */

    public GenericMatrix<?> matrixSub(GenericMatrix<?> first, GenericMatrix<?> second) throws ServiceException {
        try {
            if (first.getVerticalSize() != second.getVerticalSize() &&
                    first.getHorizontalSize() != second.getHorizontalSize()) {
                throw new ArithmeticException();
            }
            GenericMatrix<?> result = new GenericMatrix<>(first.getVerticalSize(), second.getHorizontalSize());

            for (int i = 0; i < first.getVerticalSize(); ++i) {
                for (int j = 0; j < second.getHorizontalSize(); ++j) {
                    result.setElement(i, j, first.getElement(i, j).doubleValue() -
                            second.getElement(i, j).doubleValue());
                }
            }
            return result;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Transpose matrix.
     *
     * @param first 1st parameter is matrix.
     *              Result - matrix transpose.
     * @return GenericMatrix
     */


    public GenericMatrix<?> transposeMatrix(GenericMatrix<?> first) throws ServiceException {
        try {
            GenericMatrix<?> result = new GenericMatrix<>(first.getHorizontalSize(), first.getVerticalSize());

            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                for (int j = 0; j < first.getVerticalSize(); ++j) {
                    result.setElement(i, j, first.getElement(j, i));
                }
            }
            return result;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Inverse matrix.
     *
     * @param matrix parameter is take matrix.
     *               Result - matrix inverse.
     * @return GenericMatrix
     * @throws ServiceException    if try -> catch block takes ArithmeticException -> throws ServiceException
     * @throws ArithmeticException if the matrix is not square -> throws ArithmeticException.
     */


    public GenericMatrix<Number> inverseMatrix(GenericMatrix<Number> matrix) throws ServiceException {
        try {

            if (matrix.getVerticalSize() != matrix.getHorizontalSize()) {
                throw new ArithmeticException();
            }

            double tmp;
            Number[][] A = new Number[matrix.getVerticalSize()][matrix.getVerticalSize()];

            copyMatrix(A, matrix);
            float[][] E = new float[A.length][A.length];

            createIdentityMatrix(A, E);

            for (int k = 0; k < A.length; k++) {
                tmp = A[k][k].doubleValue();

                for (int j = 0; j < A.length; j++) {
                    A[k][j] = A[k][j].doubleValue() / tmp;
                    E[k][j] /= tmp;
                }

                for (int i = k + 1; i < A.length; i++) {
                    calculation(A, E, i, k);
                }
            }

            for (int k = A.length - 1; k > 0; k--) {
                for (int i = k - 1; i >= 0; i--) {
                    calculation(A, E, i, k);
                }
            }

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    A[i][j] = (double) E[i][j];
                }
            }

            GenericMatrix<Number> result = new GenericMatrix<>(matrix.getMatrix());
            result.setMatrix(A);

            return result;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Matrix transformation.
     *
     * @param A matrix.
     * @param E identity matrix.
     * @param i first index of matrix element.
     * @param k second index of matrix element.
     */

    private void calculation(Number[][] A, float[][] E, int i, int k) {
        double tmp = A[i][k].doubleValue();
        for (int j = 0; j < A.length; j++) {
            A[i][j] = A[i][j].doubleValue() - (A[k][j].doubleValue() * tmp);
            E[i][j] -= E[k][j] * tmp;
        }
    }

    /**
     * Create identity matrix.
     *
     * @param A start matrix.
     * @param E identity matrix.
     */

    private void createIdentityMatrix(Number[][] A, float[][] E) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                E[i][j] = 0f;

                if (i == j) {
                    E[i][j] = 1f;
                }
            }
        }
    }

    /**
     * Copy matrix.
     *
     * @param A      matrix to change.
     * @param matrix original matrix.
     * @throws ArithmeticException If the creation of the matrix is incorrect -> throws ArithmeticException.
     */

    private void copyMatrix(Number[][] A, GenericMatrix<Number> matrix) throws ArithmeticException {
        for (int i = 0; i < matrix.getVerticalSize(); ++i) {
            for (int j = 0; j < matrix.getHorizontalSize(); ++j) {
                A[i][j] = matrix.getElement(i, j).doubleValue();
            }
        }
    }

    /**
     * Method fillMatrix.
     *
     * @param matrix   Takes matrix as parameter.
     * @param diapason Range ov values (example: from -10 to 10).
     * @return matrix with random values.
     * @throws ArithmeticException If the creation of the matrix is incorrect -> throws ArithmeticException.
     */

    public GenericMatrix<Number> fillMatrix(GenericMatrix<Number> matrix, int diapason) throws ArithmeticException {
        for (int i = 0; i < matrix.getVerticalSize(); ++i) {
            for (int j = 0; j < matrix.getHorizontalSize(); ++j) {
                matrix.setElement(i, j, (int) (Math.random() * (2 * diapason)) - diapason);
            }
        }
        return matrix;
    }
}

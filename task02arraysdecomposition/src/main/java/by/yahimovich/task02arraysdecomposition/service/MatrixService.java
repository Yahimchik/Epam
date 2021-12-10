package by.yahimovich.task02arraysdecomposition.service;

import by.yahimovich.task02arraysdecomposition.entity.Matrix;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixService {

    private static final Logger LOGGER = LogManager.getLogger(MatrixService.class);

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
            LOGGER.log(Level.TRACE, e);
        }
        return result;
    }
}

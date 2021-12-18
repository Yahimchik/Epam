package by.yahimovich.task02arraysdecomposition.entity;

import by.yahimovich.task02arraysdecomposition.entity.exception.MatrixException;

public class GenericMatrix<Type extends Number> {

    private Type[][] matrix;

    public GenericMatrix(Type[][] matrix) {
        this.matrix = matrix;
    }

    public GenericMatrix(int rows, int columns) throws MatrixException {
        if (rows < 1 || columns < 1) {
            throw new MatrixException();
        }

        this.matrix = (Type[][]) new Number[rows][columns];
    }

    public Type[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Number[][] matrix) {
        this.matrix = (Type[][]) matrix;
    }

    public int getVerticalSize() {
        return matrix.length;
    }

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    public Number getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) {
            return matrix[i][j];
        } else {
            throw new MatrixException();
        }
    }

    public void setElement(int i, int j, Number object) throws MatrixException {
        if (checkRange(i, j)) {
            matrix[i][j] = (Type) object;
        } else {
            throw new MatrixException();
        }
    }

    private boolean checkRange(int i, int j) {
        return i >= 0 && j <= matrix.length && j >= 0 && j <= matrix[0].length;
    }

    @Override
    public String toString() {
        final String BLANK = "\040\040";
        StringBuilder str = new StringBuilder("\nMatrix: " + matrix.length + "x" + matrix[0].length + "\n");
        for (Number[] row : matrix) {
            for (Number object : row) {
                str.append("[").append(object).append("]").append(BLANK);
            }
            str.append("\n");
        }
        return str.toString();
    }

    @Override
    public int hashCode() {
        if (matrix == null) {
            return 0;
        }

        int result = 1;

        for (Number[] row : matrix) {
            for (Number value : row) {
                result = (int) (31 * result + value.doubleValue());
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        GenericMatrix<?> other = (GenericMatrix<?>) object;

        if (matrix.length != other.matrix.length && matrix[0].length != other.matrix[0].length) {
            return false;
        }

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] != other.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}

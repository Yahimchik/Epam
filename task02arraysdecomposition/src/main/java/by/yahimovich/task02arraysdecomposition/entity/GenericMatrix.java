package by.yahimovich.task02arraysdecomposition.entity;

/**
 * Generic class matrix.
 *
 * @author Egor Yahimovich
 */

public class GenericMatrix<Type extends Number> {

    private Type[][] matrix;

    /**
     * Constructor this parameter.
     *
     * @param matrix Create class object with values of matrix.
     */

    public GenericMatrix(Type[][] matrix) {
        this.matrix = matrix;
    }

    //TODO

    /**
     * Constructor these values.
     *
     * @param rows    1st parameter is count of rows of matrix.
     * @param columns 2nd parameter is count of columns of matrix.
     *                Result - create new matrix.
     * @throws ArithmeticException - If condition not true throws new exception.
     */

    public GenericMatrix(int rows, int columns) throws ArithmeticException {
        if (rows < 1 || columns < 1) {
            throw new ArithmeticException("rows < 1 || columns < 1");
        }

        this.matrix = (Type[][]) new Number[rows][columns];
    }

    /**
     * Method getVerticalSize
     *
     * @return count of rows.
     */

    public int getVerticalSize() {
        return matrix.length;
    }

    /**
     * Method getHorizontalSize
     *
     * @return count of columns.
     */

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    /**
     * Method getElement
     *
     * @param i first index of matrix element.
     * @param j second index of matrix element.
     * @return value of matrix.
     * @throws ArithmeticException if checkRange() is false - throws new exception.
     */

    public Number getElement(int i, int j) throws ArithmeticException {
        if (checkRange(i, j)) {
            return matrix[i][j];
        } else {
            throw new ArithmeticException();
        }
    }

    /**
     * Method setElement
     *
     * @param i      first index of matrix element.
     * @param j      second index of matrix element.
     * @param object new value of matrix element.
     *               Result - matrix with new element value.
     * @throws ArithmeticException if checkRange() is false - throws new exception.
     */

    public void setElement(int i, int j, Number object) throws ArithmeticException {
        if (checkRange(i, j)) {
            matrix[i][j] = (Type) object;
        } else {
            throw new ArithmeticException();
        }
    }

    /**
     * Method checkRange
     *
     * @param i count of rows.
     * @param j count of columns.
     * @return boolean value.
     */

    private boolean checkRange(int i, int j) {
        return i >= 0 && j <= matrix.length && j >= 0 && j <= matrix[0].length;
    }

    /**
     * Method toString.
     * Give opportunity to output matrix in correct form.
     *
     * @return str String
     */

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

    /**
     * Calculate individual hashCode for class object.
     *
     * @return int value.
     */

    @Override
    public int hashCode() {
        if (matrix == null) {
            return 0;
        }

        int result = 1;

        for (Number[] row : matrix) {
            for (Number value : row) {
                result = (31 * result + value.intValue());
            }
        }
        return result;
    }

    /**
     * Method equals.
     * Compares to object of the class.
     *
     * @return boolean. If o1 == o2 -> true else -> false.
     */

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


package by.yahimovich.task02arraysdecomposition.entity;

import java.util.Objects;

/**
 * Generic class array.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Number
 */

public class GenericArray<Type extends Number> {

    private Type[] array;

    /**
     * Constructor this one parameter.
     *
     * @param array create class object this values of array.
     */

    public GenericArray(Type[] array) {
        this.array = array;
    }

    /**
     * Constructor this one parameter.
     *
     * @param n array length.
     * @throws ArithmeticException Throw new exception when N < 1.
     */

    public GenericArray(int n) throws ArithmeticException {
        if (n < 1) {
            throw new ArithmeticException("N < 1");
        }
        array = (Type[]) new Number[n];
    }

    /**
     * Method length.
     *
     * @return length of the array.
     */

    public int length() {
        return array.length;
    }

    /**
     * Method getElement.
     *
     * @return value of array on index position.
     */

    public Number getElement(int index) {
        return array[index];
    }

    /**
     * Method setElement.
     *
     * @param index index of array.
     * @param value new value.
     *              This method set value of array on index position.
     */

    public void setElement(int index, Type value) {
        array[index] = value;
    }

    public void setArray(Type[] array) {
        this.array =  array;
    }

    /**
     * Method toString.
     * Give opportunity to output array in correct form.
     *
     * @return str String
     */

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder str = new StringBuilder("\nArray: " + array.length + "\n");
        for (Number value : array) {
            str.append(value).append(BLANK);
        }
        str.append("\n");
        return str.toString();
    }

    /**
     * Calculate individual hashCode for class object.
     *
     * @return int value.
     */

    @Override
    public int hashCode() {
        if (array == null) {
            return 0;
        }

        int result = 1;

        for (Number element : array) {
            result = (31 * result + element.intValue());
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

        GenericArray<Number> other = (GenericArray<Number>) object;

        if (array.length != other.array.length) {
            return false;
        }
//TODo через arrays
        for (int i = 0; i < array.length; ++i) {
            if (!Objects.equals(array[i], other.array[i])) {
                return false;
            }
        }

        return true;
    }
}

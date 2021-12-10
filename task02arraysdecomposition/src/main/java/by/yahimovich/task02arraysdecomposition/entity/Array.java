package by.yahimovich.task02arraysdecomposition.entity;

import by.yahimovich.task02arraysdecomposition.exception.ArrayException;

public class Array {

    private final double[] array;

    public Array(double[] array) {
        this.array = array;
    }

    public Array(int N) throws ArrayException {
        if (N < 1) {
            throw new ArrayException();
        }
        array = new double[N];
    }

    public int length() {
        return array.length;
    }

    public double getElement(int index) {
        return array[index];
    }

    public void setElement(int index, double value) {
        array[index] = value;
    }


    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder str = new StringBuilder("\nArray: " + array.length + "\n");
        for (double value : array) {
            str.append(value).append(BLANK);
        }
        return str.toString();
    }
}

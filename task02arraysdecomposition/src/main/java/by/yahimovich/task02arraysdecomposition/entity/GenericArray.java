package by.yahimovich.task02arraysdecomposition.entity;

import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;

public class GenericArray<Type extends Number> {

    private final Type[] array;

    public GenericArray(Type[] array) {
        this.array = array;
    }

    public GenericArray(int N) throws ArrayException {
        if (N < 1) {
            throw new ArrayException();
        }
        array = (Type[]) new Number[N];
    }

    public int length() {
        return array.length;
    }

    public Number getElement(int index) {
        return array[index];
    }

    public void setElement(int index, Number value) {
        array[index] = (Type) value;
    }


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

    @Override
    public int hashCode() {
        if (array == null) {
            return 0;
        }

        int result = 1;

        for (Number element : array) {
            result = (int) (31 * result + element.doubleValue());
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

        GenericArray<?> other = (GenericArray<?>) object;

        if (array.length != other.array.length) {
            return false;
        }

        for (int i = 0; i < array.length; ++i) {
            if (array[i] != other.array[i]) {
                return false;
            }
        }

        return true;
    }
}

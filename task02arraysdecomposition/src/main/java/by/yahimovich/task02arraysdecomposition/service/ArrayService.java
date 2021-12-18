package by.yahimovich.task02arraysdecomposition.service;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;

public class ArrayService {

    public GenericArray<Number> bubbleSort(GenericArray<Number> genericArray) throws ArrayException {
        chek(genericArray);
        for (int i = 0; i < genericArray.length() - 1; ++i) {
            for (int j = i + 1; j < genericArray.length(); ++j) {
                if (genericArray.getElement(i).doubleValue() < genericArray.getElement(j).doubleValue()) {
                    swap(genericArray, i, j);
                }
            }
        }
        return genericArray;
    }

    public GenericArray<Number> shakerSort(GenericArray<Number> genericArray) throws ArrayException {
        chek(genericArray);
        int leftMark = 1;
        int rightMark = genericArray.length() - 1;

        while (leftMark <= rightMark) {
            for (int i = rightMark; i >= leftMark; i--) {
                if (genericArray.getElement(i - 1).doubleValue() > genericArray.getElement(i).doubleValue()) {
                    swap(genericArray, i - 1, i);
                }
            }

            leftMark++;

            for (int i = leftMark; i <= rightMark; i++) {
                if (genericArray.getElement(i - 1).doubleValue() > genericArray.getElement(i).doubleValue()) {
                    swap(genericArray, i - 1, i);
                }
            }
            rightMark--;
        }
        return genericArray;
    }

    public GenericArray<Number> selectionSort(GenericArray<Number> genericArray) throws ArrayException {
        chek(genericArray);
        for (int left = 0; left < genericArray.length(); left++) {
            int minInd = left;
            for (int i = left; i < genericArray.length(); i++) {
                if (genericArray.getElement(i).doubleValue() < genericArray.getElement(minInd).doubleValue()) {
                    minInd = i;
                }
            }
            swap(genericArray, left, minInd);
        }
        return genericArray;
    }

    public GenericArray<Number> insertionSort(GenericArray<Number> genericArray) throws ArrayException {

        chek(genericArray);
        int gap = genericArray.length() / 2;

        while (gap >= 1) {
            for (int right = 0; right < genericArray.length(); right++) {
                for (int index = right - gap; index >= 0; index -= gap) {
                    if (genericArray.getElement(index).doubleValue() < genericArray.getElement(index + gap).doubleValue()) {
                        swap(genericArray, index, index + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return genericArray;
    }

    public GenericArray<Number> shellSort(GenericArray<Number> genericArray) throws ArrayException {

        chek(genericArray);

        for (int step = genericArray.length() / 2; step > 0; step /= 2) {
            for (int i = step; i < genericArray.length(); ++i) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (genericArray.getElement(j).doubleValue() > genericArray.getElement(j + step).doubleValue()) {
                        swap(genericArray, j, j + step);
                    }
                }
            }
        }

        return genericArray;
    }

    public void fillArray(GenericArray<Number> array, int diapason) {
        for (int i = 0; i < array.length(); ++i) {
            array.setElement(i, (int) (Math.random() * (2 * diapason) - diapason));
        }
    }

    private void swap(GenericArray<Number> genericArray, int i, int j) {
        double tmp = genericArray.getElement(i).doubleValue();
        genericArray.setElement(i, genericArray.getElement(j));
        genericArray.setElement(j, tmp);
    }

    private void chek(GenericArray<Number> genericArray) throws ArrayException {
        if (genericArray.length() < 1) {
            throw new ArrayException();
        }
    }
}

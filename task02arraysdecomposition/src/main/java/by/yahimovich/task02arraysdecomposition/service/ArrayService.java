package by.yahimovich.task02arraysdecomposition.service;

import by.yahimovich.task02arraysdecomposition.entity.Array;

public class ArrayService {

    public Array bubbleSort(Array array) {
        for (int i = 0; i < array.length() - 1; ++i) {
            if (array.getElement(i) < array.getElement(i + 1)) {
                swap(array, i, i + 1);
            }
        }
        return array;
    }

    public Array shakerSort(Array array) {
        int leftMark = 1;
        int rightMark = array.length() - 1;

        while (leftMark <= rightMark) {
            for (int i = rightMark; i >= leftMark; i--) {
                if (array.getElement(i - 1) > array.getElement(i)) {
                    swap(array, i - 1, i);
                }
            }

            leftMark++;

            for (int i = leftMark; i <= rightMark; i++) {
                if (array.getElement(i - 1) > array.getElement(i)) {
                    swap(array, i - 1, i);
                }
            }
            rightMark--;
        }
        return array;
    }

    public Array selectionSort(Array array) {
        for (int i = 0; i < array.length(); i++) {
            int pos = i;
            double min = array.getElement(i);
            for (int j = i + 1; j < array.length(); j++) {
                if (array.getElement(j) < min) {
                    pos = j;
                    min = array.getElement(j);
                }
            }
            array.setElement(pos, array.getElement(i));
            array.setElement(i, min);
        }
        return array;
    }

    public Array insertionSort(Array array) {


        return array;
    }

    private void swap(Array array, int i, int j) {
        double tmp = array.getElement(i);
        array.setElement(i, array.getElement(j));
        array.setElement(j, tmp);
    }
}

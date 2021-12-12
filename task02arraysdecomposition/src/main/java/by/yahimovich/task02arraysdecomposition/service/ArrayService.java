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
        for (int left = 0; left < array.length(); left++) {
            int minInd = left;
            for (int i = left; i < array.length(); i++) {
                if (array.getElement(i) < array.getElement(minInd)) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        return array;
    }

    public Array insertionSort(Array array) {

        int gap = array.length() / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.length(); right++) {
                for (int index = right - gap; index >= 0; index -= gap) {
                    if (array.getElement(index) > array.getElement(index + gap)) {
                        swap(array, index, index + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return array;
    }

    private void swap(Array array, int i, int j) {
        double tmp = array.getElement(i);
        array.setElement(i, array.getElement(j));
        array.setElement(j, tmp);
    }
}

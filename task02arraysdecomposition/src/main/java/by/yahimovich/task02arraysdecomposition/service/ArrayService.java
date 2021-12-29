package by.yahimovich.task02arraysdecomposition.service;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.service.comparator.CompareNumberObject;
import by.yahimovich.task02arraysdecomposition.service.exception.ServiceException;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see ServiceException
 * @see Number
 */

public class ArrayService {

    /**
     * Bubble sort.
     *
     * @param genericArray Takes array as parameter and sort it.
     * @return sorted array.
     * @throws ServiceException throws new exception if try -> catch block takes ArithmeticException.
     */

    public GenericArray<Number> bubbleSort(GenericArray<Number> genericArray) throws ServiceException {
        try {
            chek(genericArray);
            for (int i = 0; i < genericArray.length() - 1; ++i) {
                for (int j = i + 1; j < genericArray.length(); ++j) {
                    if (genericArray.getElement(i).intValue() > genericArray.getElement(j).intValue()) {
                        swap(genericArray, i, j);
                    }
                }
            }
            return genericArray;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Shaker sort.
     *
     * @param genericArray Takes array as parameter and sort it.
     * @return sorted array.
     * @throws ServiceException throws new exception if try -> catch block takes ArithmeticException.
     */

    public GenericArray<Number> shakerSort(GenericArray<Number> genericArray) throws ServiceException {
        try {
            chek(genericArray);
            int leftMark = 1;
            int rightMark = genericArray.length() - 1;

            while (leftMark <= rightMark) {
                for (int i = rightMark; i >= leftMark; i--) {
                    if (new CompareNumberObject().compare(genericArray.getElement(i - 1).intValue(),
                            genericArray.getElement(i).intValue()) > 0) {
                        swap(genericArray, i - 1, i);
                    }
                }

                leftMark++;

                for (int i = leftMark; i <= rightMark; i++) {
                    if (genericArray.getElement(i - 1).intValue() > genericArray.getElement(i).intValue()) {
                        swap(genericArray, i - 1, i);
                    }
                }
                rightMark--;
            }
            return genericArray;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Selection sort.
     *
     * @param genericArray Takes array as parameter and sort it.
     * @return sorted array.
     * @throws ServiceException throws new exception if try -> catch block takes ArithmeticException.
     */

    public GenericArray<Number> selectionSort(GenericArray<Number> genericArray) throws ServiceException {
        try {
            chek(genericArray);
            for (int left = 0; left < genericArray.length(); left++) {
                int minInd = left;
                for (int i = left; i < genericArray.length(); i++) {
                    if (new CompareNumberObject().compare(genericArray.getElement(i), genericArray.getElement(minInd)) < 0) {
                        minInd = i;
                    }
                }
                swap(genericArray, left, minInd);
            }
            return genericArray;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Insertion sort.
     *
     * @param genericArray Takes array as parameter and sort it.
     * @return sorted array.
     * @throws ServiceException throws new exception if try -> catch block takes ArithmeticException.
     */

    public GenericArray<Number> insertionSort(GenericArray<Number> genericArray) throws ServiceException {
        try {
            chek(genericArray);
            int gap = genericArray.length() / 2;

            while (gap >= 1) {
                for (int right = 0; right < genericArray.length(); right++) {
                    for (int index = right - gap; index >= 0; index -= gap) {
                        if (genericArray.getElement(index).intValue() >
                                genericArray.getElement(index + gap).intValue()) {
                            swap(genericArray, index, index + gap);
                        }
                    }
                }
                gap = gap / 2;
            }
            return genericArray;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Shell sort.
     *
     * @param genericArray Takes array as parameter and sort it.
     * @return sorted array.
     * @throws ServiceException throws new exception if try -> catch block takes ArithmeticException.
     */

    public GenericArray<Number> shellSort(GenericArray<Number> genericArray) throws ServiceException {
        try {
            chek(genericArray);
            for (int step = genericArray.length() / 2; step > 0; step /= 2) {
                for (int i = step; i < genericArray.length(); ++i) {
                    for (int j = i - step; j >= 0; j -= step) {
                        if (new CompareNumberObject().compare(genericArray.getElement(j).intValue(),
                                genericArray.getElement(j + step).intValue()) > 0) {
                            swap(genericArray, j, j + step);
                        }
                    }
                }
            }
            return genericArray;
        } catch (ArithmeticException e) {
            throw new ServiceException();
        }
    }

    /**
     * Method fillArray.
     *
     * @param array    Takes array as parameter
     * @param diapason Range ov values (example: from -10 to 10).
     * @return array with random values.
     */

    public GenericArray<Number> fillArray(GenericArray<Number> array, int diapason) {
        for (int i = 0; i < array.length(); ++i) {
            array.setElement(i, (Math.random() * (2 * diapason) - diapason));
        }
        return array;
    }

    /**
     * Method swap.
     *
     * @param genericArray Takes array as parameter.
     * @param i            index of array element.
     * @param j            index of array element.
     *                     Result - Swaps the element at position i and the element at position j.
     */

    private void swap(GenericArray<Number> genericArray, int i, int j) {
        Number tmp = genericArray.getElement(i).intValue();
        genericArray.setElement(i, genericArray.getElement(j));
        genericArray.setElement(j, tmp);
    }

    /**
     * Method check.
     *
     * @param genericArray Takes array as parameter.
     * @throws ArithmeticException if array length < 1 - throws new exception.
     */

    private void chek(GenericArray<Number> genericArray) throws ArithmeticException {
        if (genericArray.length() < 1) {
            throw new ArithmeticException("Incorrect length if array!");
        }
    }
}

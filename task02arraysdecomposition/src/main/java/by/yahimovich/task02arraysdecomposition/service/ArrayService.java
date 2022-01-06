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
                    if (new CompareNumberObject().compare(genericArray.getElement(i),
                            genericArray.getElement(j)) > 0) {
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
                    if (new CompareNumberObject().compare(genericArray.getElement(i - 1),
                            genericArray.getElement(i)) > 0) {
                        swap(genericArray, i - 1, i);
                    }
                }

                //TODO посмотреть реализацию shaker sort  в кнуте индекс последнего обмена

                leftMark++;

                for (int i = leftMark; i <= rightMark; i++) {
                    if (new CompareNumberObject().compare(genericArray.getElement(i - 1),
                            genericArray.getElement(i)) > 0) {
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
                    if (new CompareNumberObject().compare(genericArray.getElement(i),
                            genericArray.getElement(minInd)) < 0) {
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
            for (int i = 1; i < genericArray.length(); ++i) {
                for (int j = i; j > 0 && new CompareNumberObject().compare(genericArray.getElement(j - 1),
                        genericArray.getElement(j)) > 0; --j) {
                    swap(genericArray, j - 1, j);
                }
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
                        if (new CompareNumberObject().compare(genericArray.getElement(j),
                                genericArray.getElement(j + step)) > 0) {
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
        Number tmp = genericArray.getElement(i);
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

package by.yahimovich.task02arraysdecomposition.controller.impl.array;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

/**
 * Selection sort
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see ArrayService
 * @see GenericArray
 */

public class SelectionSort implements Command {

    private final ArrayService service;
    private final GenericArray<Number> genericArray;

    /**
     * Constructor these parameters.
     *
     * @param service      1st parameter provides access to the method of the ArrayService class.
     * @param genericArray 2nd parameter takes an array witch be sorted.
     *                     Result - sorted array.
     * @see ArrayService
     * @see GenericArray
     */

    public SelectionSort(ArrayService service, GenericArray<Number> genericArray) {
        this.service = service;
        this.genericArray = genericArray;
    }

    /**
     * Method execute give opportunity to calculate and show result of it  work.
     *
     * @throws ArrayException This exception throws at the moment when the passed array is not created correctly.
     */

    @Override
    public void execute() throws ArrayException {
        System.out.println(service.selectionSort(genericArray));
    }
}

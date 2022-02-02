package by.yahimovich.task05treads.controller.impl.array;


import by.yahimovich.task05treads.controller.Command;
import by.yahimovich.task05treads.controller.exception.ControllerException;
import by.yahimovich.task05treads.entity.GenericArray;
import by.yahimovich.task05treads.service.ArrayService;

/**
 * Insertion sort method
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see ArrayService
 * @see GenericArray
 */

public class InsertionSort implements Command {

    private final ArrayService service;
    private final GenericArray<Number> genericArray;

    /**
     * Constructor these parameters.
     *
     * @param service      1st parameter provides access of the methods of the class ArrayService class.
     * @param genericArray 2nd parameter takes an array witch be sorted.
     *                     Result - sorted array.
     * @see ArrayService
     * @see GenericArray
     */

    public InsertionSort(ArrayService service, GenericArray<Number> genericArray) {
        this.service = service;
        this.genericArray = genericArray;
    }

    /**
     * Method execute give opportunity to calculate and show result of it  work.
     *
     * @throws ControllerException This exception throws at the moment when the passed array is not created correctly.
     */

    @Override
    public void execute() throws ControllerException {
        try {
            System.out.println(service.insertionSort(genericArray));
        } catch (SecurityException e) {
            throw new ControllerException();
        }
    }
}

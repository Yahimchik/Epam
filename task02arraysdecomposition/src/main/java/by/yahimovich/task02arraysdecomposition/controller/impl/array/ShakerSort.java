package by.yahimovich.task02arraysdecomposition.controller.impl.array;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

/**
 * Shaker sort
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see ArrayService
 * @see GenericArray
 */

public class ShakerSort implements Command {

    private final ArrayService service;
    private final GenericArray<Number> genericArray;

    /**
     * Constructor these parameters.
     *
     * @param service      1st parameter provides access to the methods of the ArrayService class.
     * @param genericArray 2nd parameter takes array.
     *                     Result - sorted array.
     * @see ArrayService
     * @see GenericArray
     */

    public ShakerSort(ArrayService service, GenericArray<Number> genericArray) {
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
            System.out.println(service.shakerSort(genericArray));
        } catch (SecurityException e) {
            throw new ControllerException();
        }
    }
}

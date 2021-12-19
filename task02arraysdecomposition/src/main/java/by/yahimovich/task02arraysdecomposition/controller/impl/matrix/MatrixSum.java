package by.yahimovich.task02arraysdecomposition.controller.impl.matrix;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;

/**
 * Matrix sum
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see MatrixService
 * @see GenericMatrix
 */

public class MatrixSum implements Command {

    private final MatrixService service;
    private final GenericMatrix<?> first;
    private final GenericMatrix<?> second;

    /**
     * Constructor these parameters.
     *
     * @param service 1st parameter provides access to the methods of the MatrixService class.
     * @param first   2nd parameter takes first matrix.
     * @param second  3rd parameter takes third parameter.
     *                Result - matrix sum
     * @see MatrixService
     * @see GenericMatrix
     */

    public MatrixSum(MatrixService service, GenericMatrix<?> first, GenericMatrix<?> second) {
        this.service = service;
        this.first = first;
        this.second = second;
    }

    /**
     * Method give opportunity to calculate and show result of it  work.
     *
     * @throws ControllerException This exception throws at the moment when the passed array is not created correctly.
     */

    @Override
    public void execute() throws ControllerException {
        try {
            System.out.print(service.matrixSum(first, second));
        } catch (SecurityException e) {
            throw new ControllerException();
        }
    }
}

package by.yahimovich.task02arraysdecomposition.controller.impl.matrix;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.service.exception.MatrixServiceException;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;

/**
 * Matrix subtract
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see MatrixService
 * @see GenericMatrix
 */

public class MatrixSub implements Command {

    private final MatrixService service;
    private final GenericMatrix<?> first;
    private final GenericMatrix<?> second;

    /**
     * Constructor these parameters.
     *
     * @param service 1st parameter provides access to the method of the MatrixService class.
     * @param first   2nd parameter takes first matrix.
     * @param second  3rd parameter takes second matrix.
     *                Result - matrix subtract (first - second).
     * @see MatrixService
     * @see GenericMatrix
     */

    public MatrixSub(MatrixService service, GenericMatrix<?> first, GenericMatrix<?> second) {
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
            System.out.print(service.matrixSub(first, second));
        } catch (MatrixServiceException e) {
            throw new ControllerException();
        }
    }
}

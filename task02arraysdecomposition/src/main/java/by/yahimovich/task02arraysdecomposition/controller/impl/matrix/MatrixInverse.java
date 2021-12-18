package by.yahimovich.task02arraysdecomposition.controller.impl.matrix;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.service.exception.MatrixServiceException;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;

/**
 * Inverse matrix
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see MatrixService
 * @see GenericMatrix
 */

public class MatrixInverse implements Command {

    private final MatrixService service;
    private final GenericMatrix<Number> matrix;

    /**
     * Constructor these parameters.
     *
     * @param service 1st parameter provides access to the methods of the MatrixService class.
     * @param matrix  2nd parameter takes matrix.
     *                Result - inverse matrix.
     * @see MatrixService
     * @see GenericMatrix
     */

    public MatrixInverse(MatrixService service, GenericMatrix<Number> matrix) {
        this.service = service;
        this.matrix = matrix;
    }

    /**
     * Method give opportunity to calculate and show result of it  work.
     *
     * @throws ControllerException This exception throws at the moment when the passed array is not created correctly.
     */

    @Override
    public void execute() throws ControllerException {
        try {
            System.out.print(service.inverseMatrix(matrix));
        } catch (MatrixServiceException e) {
            throw new ControllerException();
        }
    }
}

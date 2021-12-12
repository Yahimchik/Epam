package by.yahimovich.task02arraysdecomposition.controller.impl.matrix;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.Matrix;
import by.yahimovich.task02arraysdecomposition.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;

public class MatrixTransposes implements Command {

    private final MatrixService service;
    private final Matrix matrix;

    public MatrixTransposes(MatrixService service, Matrix matrix) {
        this.service = service;
        this.matrix = matrix;
    }

    @Override
    public void execute() throws ArrayException, MatrixException {
        System.out.println(service.transposeMatrix(matrix));
    }
}

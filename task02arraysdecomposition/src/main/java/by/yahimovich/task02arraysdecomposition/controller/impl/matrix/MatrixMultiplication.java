package by.yahimovich.task02arraysdecomposition.controller.impl.matrix;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.Matrix;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;

public class MatrixMultiplication implements Command {

    private final MatrixService service;
    private final Matrix first;
    private final Matrix second;

    public MatrixMultiplication(MatrixService service, Matrix first, Matrix second) {
        this.service = service;
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() throws MatrixException {
        System.out.println(service.multiplyMatrix(first, second));
    }
}

package by.yahimovich.task05treads.controller.impl.matrix;

import by.yahimovich.task05treads.controller.Command;
import by.yahimovich.task05treads.controller.exception.ControllerException;
import by.yahimovich.task05treads.entity.GenericMatrix;
import by.yahimovich.task05treads.service.threadservice.ParallelMatrixProduct;

public class ParallelMatrixMultiplication implements Command {

    private GenericMatrix<Number> first;
    private GenericMatrix<Number> second;

    public ParallelMatrixMultiplication(
            GenericMatrix<Number> first,
            GenericMatrix<Number> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() throws ControllerException, InterruptedException {
        ParallelMatrixProduct product = new ParallelMatrixProduct(
                Runtime.getRuntime().availableProcessors(),
                first, second);
        System.out.println(product.parallelProduct());
    }
}

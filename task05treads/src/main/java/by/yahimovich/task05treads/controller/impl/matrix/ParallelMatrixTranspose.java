package by.yahimovich.task05treads.controller.impl.matrix;

import by.yahimovich.task05treads.controller.Command;
import by.yahimovich.task05treads.controller.exception.ControllerException;
import by.yahimovich.task05treads.entity.GenericMatrix;
import by.yahimovich.task05treads.service.threadservice.ParallelMatrixProduct;

public class ParallelMatrixTranspose implements Command {
    private GenericMatrix<Number> first;

    public ParallelMatrixTranspose(GenericMatrix<Number> first) {
        this.first = first;
    }

    @Override
    public void execute() throws ControllerException, InterruptedException {
        ParallelMatrixProduct product = new ParallelMatrixProduct(
                Runtime.getRuntime().availableProcessors(),
                first);
        System.out.println(product.parallelTranspose());
    }
}

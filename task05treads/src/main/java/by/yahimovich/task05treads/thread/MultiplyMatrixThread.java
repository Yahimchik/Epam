package by.yahimovich.task05treads.thread;

import by.yahimovich.task05treads.entity.GenericArray;
import by.yahimovich.task05treads.entity.GenericMatrix;
import by.yahimovich.task05treads.service.ArrayService;
import by.yahimovich.task05treads.service.MatrixService;
import by.yahimovich.task05treads.service.exception.ServiceException;

import java.util.concurrent.Callable;

public class MultiplyMatrixThread implements Callable<GenericMatrix<Number>> {

    private final GenericMatrix<Number> first;
    private final GenericMatrix<Number> second;
    private final GenericMatrix<Number> result;

    public MultiplyMatrixThread(GenericMatrix<Number> first, GenericMatrix<Number> second,
                                GenericMatrix<Number> result) {
        this.first = first;
        this.second = second;
        this.result = result;
    }

    @Override
    public GenericMatrix<Number> call() throws Exception {
        result.setMatrix(new MatrixService().multiplyMatrix(first, second).getMatrix());
        return result;
    }
}

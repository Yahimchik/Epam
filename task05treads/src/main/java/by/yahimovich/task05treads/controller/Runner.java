package by.yahimovich.task05treads.controller;


import by.yahimovich.task05treads.entity.GenericMatrix;
import by.yahimovich.task05treads.service.MatrixService;
import by.yahimovich.task05treads.service.threadservice.ParallelMatrixService;
import by.yahimovich.task05treads.view.manager.Manager;

import java.io.FileNotFoundException;

/**
 * Run program
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see FileNotFoundException
 * @see Manager
 */

public class Runner {

    /**
     * Runs the run method.
     */

    public static void main(String[] args) throws Exception {

//        GenericMatrix<Number> first = new InputMatrixFromFile("matrix.txt").call();
        GenericMatrix<Number> first = new GenericMatrix<>(7000, 7000);
        first = new MatrixService().fillMatrix(first, 5);
        long start = System.currentTimeMillis();
        GenericMatrix<Number> result = new MatrixService().matrixSum(first, first);
        long end = System.currentTimeMillis() - start;
        System.out.println(end);
//        System.out.println(result);


//        GenericMatrix<Number> second = new InputMatrixFromFile("matrix.txt").call();
        GenericMatrix<Number> second = new GenericMatrix<>(7000, 7000);
        second = new MatrixService().fillMatrix(second, 5);
        long startTime1 = System.currentTimeMillis();
        GenericMatrix<Number> res = new ParallelMatrixService(Runtime.getRuntime().availableProcessors(), second, second).parallelSum();
        long end1 = System.currentTimeMillis() - startTime1;
        System.out.println(end1);
//        System.out.println(res);
        System.exit(0);

    }
}

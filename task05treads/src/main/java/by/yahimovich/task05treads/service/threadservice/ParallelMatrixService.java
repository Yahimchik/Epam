package by.yahimovich.task05treads.service.threadservice;

import by.yahimovich.task05treads.entity.GenericMatrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Class parallelMatrix service
 * This class calculate operations on matrices
 * on several threads, which allows you to speed up
 * the execution of the program.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Runnable
 */

public class ParallelMatrixService {
    private final int numberOfThreads;
    private final GenericMatrix<Number> first;
    private GenericMatrix<Number> second;
    private final GenericMatrix<Number> result;

    private final ExecutorService pool;

    /**
     * Constructor - create new object these parameters.
     * Create resulting matrix with count of rows
     * and columns of the first and second matrices
     * respectively. This constructor can be called to
     * multiply, addition and subtraction of matrices.
     *
     * @param numberOfThreads number of threads
     * @param first           first matrix
     * @param second          second matrix
     */

    public ParallelMatrixService(int numberOfThreads,
                                 GenericMatrix<Number> first,
                                 GenericMatrix<Number> second) {
        this.numberOfThreads = numberOfThreads;
        this.first = first;
        this.second = second;
        this.result = new GenericMatrix<>(first.getHorizontalSize(), second.getVerticalSize());
        pool = Executors.newFixedThreadPool(this.numberOfThreads);
    }

    /**
     * Constructor - create new object these parameters.
     * Create resulting matrix with count of rows
     * and columns of the first matrix. This constructor can be called to
     * find the inverse matrix or the transpose matrix.
     *
     * @param numberOfThreads number of threads
     * @param first           first matrix
     */

    public ParallelMatrixService(int numberOfThreads,
                                 GenericMatrix<Number> first) {
        this.numberOfThreads = numberOfThreads;
        this.first = first;
        this.result = new GenericMatrix<>(first.getHorizontalSize(), first.getVerticalSize());
        pool = Executors.newFixedThreadPool(this.numberOfThreads);
    }

    /**
     * Class ParallelThreadMultiplication - This class make it possible to parallelize
     * matrix multiplication.
     *
     * @see Runnable
     */

    private class ParallelThreadMultiplication implements Runnable {

        private final int stringIndex;

        /**
         * Constructor - create new object this parameter.
         *
         * @param stringIndex chose string of the matrix
         */

        public ParallelThreadMultiplication(int stringIndex) {
            this.stringIndex = stringIndex;
        }

        /**
         * Overriding method run which redefined from Runnable interface.
         * This method multiply matrix on threads.
         * Take the row of the first matrix and the corresponding column
         * of the second and calculate their values.
         */

        @Override
        public void run() {
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                double value = 0;
                for (int k = 0; k < second.getVerticalSize(); ++k) {
                    result.setElement(this.stringIndex, i, value +=
                            first.getElement(this.stringIndex, k).doubleValue() * second.getElement(k, i).doubleValue());
                }
            }
        }
    }

    /**
     * Class ParallelThreadSum - This class make it possible to parallelize
     * matrix sum.
     *
     * @see Runnable
     */

    private class ParallelThreadSum implements Runnable {

        private final int stringIndex;

        /**
         * Constructor - create new object this parameter.
         *
         * @param stringIndex chose string of the matrix
         */

        public ParallelThreadSum(int stringIndex) {
            this.stringIndex = stringIndex;
        }

        /**
         * Overriding method run which redefined from Runnable interface.
         * This method summarize matrix on threads.
         * Take the row of the first matrix and the corresponding row
         * of the second and calculate their values.
         */

        @Override
        public void run() {
            for (int i = 0; i < first.getVerticalSize(); ++i) {
                result.setElement(this.stringIndex, i,
                        first.getElement(this.stringIndex, i).doubleValue() +
                                second.getElement(this.stringIndex, i).doubleValue());
            }
        }
    }

    /**
     * Class ParallelThreadSub - This class make it possible to parallelize
     * matrix sub.
     *
     * @see Runnable
     */

    private class ParallelThreadSub implements Runnable {
        private final int stringIndex;

        /**
         * Constructor - create new object this parameter.
         *
         * @param stringIndex chose string of the matrix
         */

        public ParallelThreadSub(int stringIndex) {
            this.stringIndex = stringIndex;
        }

        /**
         * Overriding method run which redefined from Runnable interface.
         * This method summarize matrix on threads.
         * Take the row of the first matrix and the corresponding row
         * of the second and calculate their values.
         */

        @Override
        public void run() {
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                result.setElement(this.stringIndex, i,
                        first.getElement(this.stringIndex, i).doubleValue() -
                                second.getElement(this.stringIndex, i).doubleValue());
            }
        }
    }

    /**
     * Class ParallelThreadSub - This class make it possible to parallelize
     * matrix transpose.
     *
     * @see Runnable
     */

    private class ParallelThreadTranspose implements Runnable {
        private final int stringIndex;

        /**
         * Constructor - create new object this parameter.
         *
         * @param stringIndex chose string of the matrix
         */

        public ParallelThreadTranspose(int stringIndex) {
            this.stringIndex = stringIndex;
        }

        /**
         * Overriding method run which redefined from Runnable interface.
         * This method summarize matrix on threads.
         * Take the row of the matrix and transpose it.
         */

        @Override
        public void run() {
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                result.setElement(this.stringIndex, i, first.getElement(i, this.stringIndex));
            }
        }
    }

    /**
     * Method of multiplication matrix.
     *
     * @return result of matrix multiplication.
     */

    public GenericMatrix<Number> parallelMultiplication() throws InterruptedException {
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            pool.execute(new ParallelThreadMultiplication(i));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }
    //TODO подстраховка на случай interrupted

    /**
     * Method of summarize matrix.
     *
     * @return result of matrix summarize.
     */

    public GenericMatrix<Number> parallelSum() throws InterruptedException {
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            pool.execute(new ParallelThreadSum(i));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }

    /**
     * Method of subtraction matrix.
     *
     * @return result of matrix subtraction.
     */

    public GenericMatrix<Number> parallelSub() throws InterruptedException {
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            pool.execute(new ParallelThreadSub(i));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }

    /**
     * Method of transpose matrix.
     *
     * @return result of matrix transpose.
     */

    public GenericMatrix<Number> parallelTranspose() throws InterruptedException {
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            pool.execute(new ParallelThreadTranspose(i));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }
}

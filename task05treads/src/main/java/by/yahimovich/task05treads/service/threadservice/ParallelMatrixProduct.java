package by.yahimovich.task05treads.service.threadservice;

import by.yahimovich.task05treads.entity.GenericMatrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelMatrixProduct {
    private final int numberOfThreads;
    private final GenericMatrix<Number> first;
    private final GenericMatrix<Number> second;
    private final GenericMatrix<Number> result;

    public ParallelMatrixProduct(int numberOfThreads, GenericMatrix<Number> first, GenericMatrix<Number> second) {
        this.numberOfThreads = numberOfThreads;
        this.first = first;
        this.second = second;
        this.result = new GenericMatrix<>(first.getHorizontalSize(), second.getVerticalSize());
    }

    public ParallelMatrixProduct(int numberOfThreads, GenericMatrix<Number> first) {
        this.numberOfThreads = numberOfThreads;
        this.first = first;
        this.second = new GenericMatrix<>(1, 1);
        this.result = new GenericMatrix<>(first.getHorizontalSize(), first.getVerticalSize());
    }

    private class parallelThreadMultiplication implements Runnable {
        private final int stringIndex;

        public parallelThreadMultiplication(int stringIndex) {
            this.stringIndex = stringIndex;
        }

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

    private class parallelThreadSum implements Runnable {

        private final int stringIndex;

        public parallelThreadSum(int threadCount) {
            this.stringIndex = threadCount;
        }

        @Override
        public void run() {
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                result.setElement(this.stringIndex, i,
                        first.getElement(this.stringIndex, i).doubleValue() +
                                second.getElement(this.stringIndex, i).doubleValue());
            }
        }
    }

    private class parallelThreadSub implements Runnable {
        private final int stringIndex;

        public parallelThreadSub(int stringIndex) {
            this.stringIndex = stringIndex;
        }

        @Override
        public void run() {
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                result.setElement(this.stringIndex, i,
                        first.getElement(this.stringIndex, i).doubleValue() -
                                second.getElement(this.stringIndex, i).doubleValue());
            }
        }
    }

    private class parallelThreadTranspose implements Runnable {
        private final int stringIndex;

        public parallelThreadTranspose(int stringIndex) {
            this.stringIndex = stringIndex;
        }

        @Override
        public void run() {
            for (int i = 0; i < first.getHorizontalSize(); ++i) {
                result.setElement(this.stringIndex, i, first.getElement(i, this.stringIndex));
            }
        }
    }

    public GenericMatrix<Number> parallelProduct() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(this.numberOfThreads);
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            executorService.execute(new parallelThreadMultiplication(i));
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }

    public GenericMatrix<Number> parallelSub() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(this.numberOfThreads);
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            service.execute(new parallelThreadSub(i));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }

    public GenericMatrix<Number> parallelSum() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(this.numberOfThreads);
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            pool.execute(new parallelThreadSum(i));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }

    public GenericMatrix<Number> parallelTranspose() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(this.numberOfThreads);
        for (int i = 0; i < first.getHorizontalSize(); ++i) {
            pool.execute(new parallelThreadTranspose(i));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return this.result;
    }
}

package by.yahimovich.task05treads.view.manager;


import by.yahimovich.task05treads.entity.GenericArray;
import by.yahimovich.task05treads.entity.GenericMatrix;
import by.yahimovich.task05treads.service.exception.ServiceException;
import by.yahimovich.task05treads.view.inputinfo.IOInfo;
import by.yahimovich.task05treads.view.inputinfo.InputArrayFromFile;
import by.yahimovich.task05treads.view.inputinfo.InputMatrixFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;


public class Manager {
    public static final Logger LOGGER = LogManager.getLogger(MatrixManager.class);
    public IOInfo in = new IOInfo();


    public final void startFromFile() throws FileNotFoundException {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        ReentrantLock lock = new ReentrantLock();
        while (true) {
            in.output("""
                                        
                    1. Fill matrix from file.
                    2. Fill array from file.
                    3. Exit.
                    """);

            in.output("Enter number of menu:\040");

            int choice = in.input();

            if (choice == 3) {
                break;
            }
            lock.lock();
            try {
                switch (choice) {
                    case 1 -> {
                        in.output("\nFill matrix from file.\n");
                        Callable<GenericMatrix<Number>> callable = new InputMatrixFromFile("matrix.txt");
                        Future<GenericMatrix<Number>> future = pool.submit(callable);
                        new MatrixManager()
                                .matrixManager(future.get());
                    }
                    case 2 -> {
                        in.output("\nFill array from file.");
                        Callable<GenericArray<Number>> callable = new InputArrayFromFile("array.txt");
                        Future<GenericArray<Number>> future = pool.submit(callable);
                        new ArrayManager()
                                .arrayManager(future.get());
                    }
                    default -> {
                    }
                }
            } catch (ServiceException e) {
                LOGGER.debug(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
        pool.shutdown();
    }
}

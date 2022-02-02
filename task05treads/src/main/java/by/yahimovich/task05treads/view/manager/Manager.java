package by.yahimovich.task05treads.view.manager;


import by.yahimovich.task05treads.service.exception.ServiceException;
import by.yahimovich.task05treads.view.inputinfo.IOInfo;
import by.yahimovich.task05treads.view.inputinfo.InputArrayFromFile;
import by.yahimovich.task05treads.view.inputinfo.InputMatrixFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;


public class Manager implements Runnable {
    public static final Logger LOGGER = LogManager.getLogger(MatrixManager.class);
    public IOInfo in = new IOInfo();

    public final void startFromFile() throws FileNotFoundException {

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

            try {
                switch (choice) {
                    case 1 -> {
                        in.output("\nFill matrix from file.\n");
                        new MatrixManager()
                                .matrixManager(new InputMatrixFromFile("matrix.txt")
                                        .call());
                    }
                    case 2 -> {
                        in.output("\nFill array from file.");
                        new ArrayManager()
                                .arrayManager(new InputArrayFromFile("array.txt")
                                        .call());
                    }
                    default -> {
                    }
                }
            } catch (ServiceException e) {
                LOGGER.debug(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void run() {
        try {
            System.out.println("\n" + Thread.currentThread().getName());
            startFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

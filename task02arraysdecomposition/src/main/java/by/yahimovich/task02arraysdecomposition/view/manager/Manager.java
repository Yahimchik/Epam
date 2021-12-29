package by.yahimovich.task02arraysdecomposition.view.manager;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;
import by.yahimovich.task02arraysdecomposition.service.exception.ServiceException;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.IOInfo;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.InputArrayFromFile;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.InputMatrixFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager {
    public static final Logger LOGGER = LogManager.getLogger(MatrixManager.class);
    private final Scanner scanner = new Scanner(System.in);
    public IOInfo in = new IOInfo();

    public final void run() throws FileNotFoundException {

        while (true) {

            in.output("""
                                        
                    1. Fill matrix from file.
                    2. Fill array from file.
                    3. Fill matrix by random values.
                    4. Fill array by random values.
                    5. Exit.
                    Enter number of menu:\040""");

            double choice = in.input();

            if (choice == 5) {
                break;
            }

            try {
                switch ((int) choice) {
                    case 1: {
                        in.output("\nFill matrix from file.\n");
                        new MatrixManager()
                                .matrixManager(new InputMatrixFromFile()
                                        .input("matrix.txt"));
                        break;
                    }
                    case 2: {
                        in.output("\nFill array from file.");
                        new ArrayManager()
                                .arrayManager(new InputArrayFromFile()
                                        .input("array.txt"));
                        break;
                    }
                    case 3: {
                        in.output("""

                                Fill matrix by random values.
                                Enter count of rows and columns:\040""");
                        try {
                            new MatrixManager()
                                    .matrixManager(new MatrixService()
                                            .fillMatrix(new GenericMatrix<>
                                                    (scanner.nextInt(), scanner.nextInt()), 10));
                        } catch (ArithmeticException e) {
                            throw new ServiceException("Incorrect matrix!");
                        }
                        break;
                    }
                    case 4: {
                        in.output("""
                                                                
                                Fill array by random values.
                                Enter array length:\040""");
                        try {
                            new ArrayManager()
                                    .arrayManager(new ArrayService()
                                            .fillArray(new GenericArray<>
                                                    (scanner.nextInt()), 10));
                        } catch (ArithmeticException e) {
                            throw new ServiceException("Incorrect array!");
                        }
                    }
                    default: {
                        break;
                    }
                }
            } catch (ServiceException e) {
                LOGGER.debug(e.getMessage());
            }
        }
    }
}

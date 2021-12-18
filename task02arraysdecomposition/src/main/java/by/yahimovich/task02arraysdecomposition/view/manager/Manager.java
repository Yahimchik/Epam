package by.yahimovich.task02arraysdecomposition.view.manager;

import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.entity.exception.MatrixException;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.InputArrayFromFile;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.InputMatrixFromFile;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.IoInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

public class Manager {
    public static final Logger LOGGER = LogManager.getLogger(FileManager.class);

    public void run() throws ArrayException, FileNotFoundException {

        IoInfo in = new IoInfo();

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
                    case 1:
                        in.output("\nFill matrix from file.\n");
                        new FileManager().matrixManager(new InputMatrixFromFile().inputMatrix());
                        break;
                    case 2:
                        in.output("\nFill array from file.");
                        new ArrayManager().arrayManager(new InputArrayFromFile().inputArray());
                        break;
                    case 3:
                        in.output("\nFill matrix by random values.\n");
                        GenericMatrix<Number> matrix = new GenericMatrix<>(2, 2);
                        MatrixService service = new MatrixService();
                        service.fillMatrix(matrix, 10);
                        System.out.println(matrix);
                        new FileManager().matrixManager(matrix);
                        break;
                    case 4:
                        in.output("\nFill array by random values.\n");
                        GenericArray<Number> array = new GenericArray<>(5);
                        ArrayService service1 = new ArrayService();
                        service1.fillArray(array, 10);
                        System.out.println(array);
                        new ArrayManager().arrayManager(array);
                    default:
                        break;
                }
            } catch (MatrixException e) {
                LOGGER.error("Incorrect matrix!");
            } catch (ArrayException r) {
                LOGGER.error("Incorrect array!");
            }
        }
    }
}

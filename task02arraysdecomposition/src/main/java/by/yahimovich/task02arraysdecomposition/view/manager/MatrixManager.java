package by.yahimovich.task02arraysdecomposition.view.manager;

import by.yahimovich.task02arraysdecomposition.controller.CommandManager;
import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.controller.impl.matrix.*;
import by.yahimovich.task02arraysdecomposition.entity.GenericMatrix;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;
import by.yahimovich.task02arraysdecomposition.view.exception.ViewException;

public class MatrixManager extends Manager {
    CommandManager manager = new CommandManager();

    public void matrixManager(GenericMatrix<Number> matrix) throws ViewException {

        in.output("""
                Menu:
                1. Matrix inverse.
                2. Matrix multiplication.
                3. Matrix subtract.
                4. Matrix sum.
                5. Matrix transpose.
                6. Go back to main menu.""");

        while (true) {

            in.output("\nEnter function number: ");
            double choice = in.input();

            if (choice == 6) {
                break;
            }
            try {
                switch ((int) choice) {
                    case 1:
                        manager.executeOperation(new MatrixInverse(new MatrixService(), matrix));
                        break;
                    case 2:
                        manager.executeOperation(new MatrixMultiplication(new MatrixService(), matrix, matrix));
                        break;
                    case 3:
                        manager.executeOperation(new MatrixSub(new MatrixService(), matrix, matrix));
                        break;
                    case 4:
                        manager.executeOperation(new MatrixSum(new MatrixService(), matrix, matrix));
                        break;
                    case 5:
                        manager.executeOperation(new MatrixTransposes(new MatrixService(), matrix));
                        break;
                    default:
                        break;
                }
            } catch (ControllerException e) {
                throw new ViewException("Incorrect matrix!");
            }
        }
    }
}

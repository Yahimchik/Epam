package by.yahimovich.task02arraysdecomposition.view.manager;

import by.yahimovich.task02arraysdecomposition.controller.CommandManager;
import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.controller.impl.array.*;
import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;
import by.yahimovich.task02arraysdecomposition.view.exception.ViewException;
import by.yahimovich.task02arraysdecomposition.view.inputinfo.IoInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayManager {

    public static final Logger LOGGER = LogManager.getLogger(FileManager.class);
    IoInfo in = new IoInfo();
    CommandManager manager = new CommandManager();

    public void arrayManager(GenericArray<Number> array) throws ViewException {

        in.output("""
                Menu:
                1. Bubble sort.
                2. Insertion sort.
                3. Selection sort.
                4. Shaker sort.
                5. Shell sort.
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
                        manager.executeOperation(new BubbleSort(new ArrayService(), array));
                        break;
                    case 2:
                        manager.executeOperation(new InsertionSort(new ArrayService(), array));
                        break;
                    case 3:
                        manager.executeOperation(new SelectionSort(new ArrayService(), array));
                        break;
                    case 4:
                        manager.executeOperation(new ShakerSort(new ArrayService(), array));
                        break;
                    case 5:
                        manager.executeOperation(new ShellSort(new ArrayService(), array));
                        break;
                    default:
                        break;
                }
            } catch (ControllerException e) {
                throw new ViewException("Incorrect array!");
            }
        }
    }
}

package by.yahimovich.task02arraysdecomposition.view;

import by.yahimovich.task02arraysdecomposition.controller.CommandManager;
import by.yahimovich.task02arraysdecomposition.controller.impl.array.BubbleSort;
import by.yahimovich.task02arraysdecomposition.controller.impl.array.SelectionSort;
import by.yahimovich.task02arraysdecomposition.controller.impl.array.ShakerSort;
import by.yahimovich.task02arraysdecomposition.controller.impl.matrix.MatrixMultiplication;
import by.yahimovich.task02arraysdecomposition.entity.Array;
import by.yahimovich.task02arraysdecomposition.entity.Matrix;
import by.yahimovich.task02arraysdecomposition.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;
import by.yahimovich.task02arraysdecomposition.service.MatrixService;

public class Manager {
    public void run() throws MatrixException, ArrayException {
        CommandManager manager = new CommandManager();
        Matrix first = new Matrix(2, 3);
        first.setElement(0, 0, 1);
        first.setElement(0, 1, 3);
        first.setElement(0, 2, 2);
        first.setElement(1, 0, 4);
        first.setElement(1, 1, 3);
        first.setElement(1, 2, 5);

        Matrix second = new Matrix(3, 3);
        second.setElement(0, 0, 2);
        second.setElement(0, 1, 4);
        second.setElement(0, 2, 6);
        second.setElement(1, 0, 8);
        second.setElement(1, 1, 10);
        second.setElement(1, 2, 12);
        manager.executeOperation(new MatrixMultiplication(new MatrixService(), first, second));

        Array first1 = new Array(3);
        first1.setElement(0, 3);
        first1.setElement(1, 4);
        first1.setElement(2, 2);
        manager.executeOperation(new BubbleSort(new ArrayService(), first1));

        Array sec = new Array(4);
        sec.setElement(0, 4);
        sec.setElement(1, 5);
        sec.setElement(2, 2);
        sec.setElement(3, 7);
        manager.executeOperation(new ShakerSort(new ArrayService(), sec));

        Array third = new Array(4);
        third.setElement(0, 13);
        third.setElement(1, 12);
        third.setElement(2, 6);
        third.setElement(3, 4);
        manager.executeOperation(new SelectionSort(new ArrayService(), third));

    }
}

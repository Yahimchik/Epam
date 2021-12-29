package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.entity.GenericArray;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;
import by.yahimovich.task02arraysdecomposition.view.manager.Manager;

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

    public static void main(String[] args) throws ControllerException, FileNotFoundException {
        Manager manager = new Manager();
        manager.run();
//        GenericArray<Number> array = new GenericArray<>(5);
//        array.setElement(0, 1f);
//        array.setElement(1, 4f);
//        array.setElement(2, 2f);
//        array.setElement(3, 5f);
//        array.setElement(4, 3f);
//
//        System.out.println(new ArrayService().selectionSort(array));
    }
}

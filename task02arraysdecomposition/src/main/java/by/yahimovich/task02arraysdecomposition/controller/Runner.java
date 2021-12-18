package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.entity.exception.MatrixException;
import by.yahimovich.task02arraysdecomposition.view.manager.Manager;

import java.io.FileNotFoundException;

/**
 * Run program
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see MatrixException
 * @see ArrayException
 * @see FileNotFoundException
 * @see Manager
 */

public class Runner {

    /**
     * Runs the run method.
     */

    public static void main(String[] args) throws MatrixException, ArrayException, FileNotFoundException {
        Manager manager = new Manager();
        manager.run();
    }
}

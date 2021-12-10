package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;
import by.yahimovich.task02arraysdecomposition.view.Manager;

public class Runner {
    public static void main(String[] args) throws MatrixException, ArrayException {
        Manager manager = new Manager();
        manager.run();
    }
}

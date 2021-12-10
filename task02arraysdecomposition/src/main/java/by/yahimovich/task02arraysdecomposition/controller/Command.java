package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.exception.MatrixException;

public interface Command {
    void execute() throws MatrixException, ArrayException;
}

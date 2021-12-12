package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.exception.*;

public interface Command {
    void execute() throws ArrayException, MatrixException;
}

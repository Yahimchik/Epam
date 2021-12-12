package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.exception.*;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    private final List<Command> commands = new ArrayList<>();

    public void executeOperation(Command command) throws MatrixException, ArrayException {
        commands.add(command);
        command.execute();
    }
}

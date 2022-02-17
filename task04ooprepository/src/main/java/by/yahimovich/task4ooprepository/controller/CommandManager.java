package by.yahimovich.task4ooprepository.controller;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    private final List<CommandInterface> commands = new ArrayList<>();

    public void executeCommand(CommandInterface command) {
        commands.add(command);
        command.execute();
    }
}

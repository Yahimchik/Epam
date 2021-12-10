package by.yahimovich.task02arraysdecomposition.controller.impl.array;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.Array;
import by.yahimovich.task02arraysdecomposition.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

import java.util.Arrays;

public class BubbleSort implements Command {

    private final ArrayService service;
    private final Array array;

    public BubbleSort(ArrayService service, Array array) {
        this.service = service;
        this.array = array;
    }

    @Override
    public void execute() throws ArrayException {
        System.out.println(service.bubbleSort(array));
    }
}

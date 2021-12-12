package by.yahimovich.task02arraysdecomposition.controller.impl.array;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.Array;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

public class InsertionSort implements Command {

    private final ArrayService service;
    private final Array array;

    public InsertionSort(ArrayService service, Array array) {
        this.service = service;
        this.array = array;
    }

    @Override
    public void execute() {
        System.out.println(service.insertionSort(array));
    }
}

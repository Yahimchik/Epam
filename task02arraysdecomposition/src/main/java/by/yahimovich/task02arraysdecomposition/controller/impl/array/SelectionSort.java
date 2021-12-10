package by.yahimovich.task02arraysdecomposition.controller.impl.array;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.Array;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

public class SelectionSort implements Command {

    private final ArrayService service;
    private final Array array;

    public SelectionSort(ArrayService service, Array array) {
        this.service = service;
        this.array = array;
    }

    @Override
    public void execute() {
        System.out.println(service.selectionSort(array));
    }
}

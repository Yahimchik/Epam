package by.yahimovich.task02arraysdecomposition.controller.impl.array;

import by.yahimovich.task02arraysdecomposition.controller.Command;
import by.yahimovich.task02arraysdecomposition.entity.Array;
import by.yahimovich.task02arraysdecomposition.service.ArrayService;

public class ShakerSort implements Command {

    private ArrayService service;
    private Array array;

    public ShakerSort(ArrayService service, Array array) {
        this.service = service;
        this.array = array;
    }


    @Override
    public void execute() {
        System.out.println(service.shakerSort(array));
    }
}

package by.yahimovich.task03classuml.controller.impl;

import by.yahimovich.task03classuml.controller.CommandInterface;
import by.yahimovich.task03classuml.insurance.service.Service;
import by.yahimovich.task03classuml.insurance.view.inputdata.IOData;

import java.util.List;

public record DateComparator(Service service,
                             List list) implements CommandInterface {

    @Override
    public void execute() {
        IOData.output(service.sortByDate(list));
    }
}

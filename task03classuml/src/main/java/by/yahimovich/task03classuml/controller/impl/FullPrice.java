package by.yahimovich.task03classuml.controller.impl;

import by.yahimovich.task03classuml.controller.CommandInterface;
import by.yahimovich.task03classuml.insurance.service.Service;

import java.util.List;

public record FullPrice(Service service,
                        List list) implements CommandInterface {

    @Override
    public void execute() {
        System.out.println(service.fullDamage(list));
    }
}

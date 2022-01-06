package by.yahimovich.task03classuml.controller;

import by.yahimovich.task03classuml.controller.exception.ControllerException;
import by.yahimovich.task03classuml.insurance.view.manager.Manager;

import java.io.IOException;

public class Controller {
    public static void main(String[] args) throws IOException, ControllerException {
        new Manager().show();
    }
}

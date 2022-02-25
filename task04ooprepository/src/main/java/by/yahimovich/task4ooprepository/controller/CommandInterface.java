package by.yahimovich.task4ooprepository.controller;

import by.yahimovich.task4ooprepository.service.PointService;

/**
 * Command Interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see PointService
 */

public interface CommandInterface {

    /**
     * Calculation template for command.
     */

    void execute();
}

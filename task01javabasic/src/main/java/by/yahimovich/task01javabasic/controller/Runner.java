package by.yahimovich.task01javabasic.controller;

import by.yahimovich.task01javabasic.manager.Manager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Manager
 */

public class Runner {
    public static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.log(Level.TRACE, "Start application...");
        Manager manager = new Manager();
        manager.test();
        LOGGER.log(Level.TRACE, "Exiting application...");
    }
}

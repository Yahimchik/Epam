package by.yahimovich.task05treads.controller;


import by.yahimovich.task05treads.view.manager.Manager;
import by.yahimovich.task05treads.view.manager.UserManager;

import java.io.FileNotFoundException;

/**
 * Run program
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see FileNotFoundException
 * @see Manager
 */

public class Runner {

    /**
     * Runs the run method.
     */

    public static void main(String[] args) throws Exception {
        new UserManager().createUser();
    }
}

package by.yahimovich.task05treads.controller;

import by.yahimovich.task05treads.entity.user.User;

public class Main {
    public static void main(String[] args) {

        Thread[] threads = new Thread[2];

        for (int i = 0; i < 2; ++i) {
            threads[i] = new Thread(new User(), "User " + (i + 1) + " online");
            threads[i].start();
        }
    }
}

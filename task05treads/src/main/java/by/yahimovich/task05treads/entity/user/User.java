package by.yahimovich.task05treads.entity.user;

import by.yahimovich.task05treads.view.manager.Manager;

import java.io.FileNotFoundException;
import java.util.concurrent.Semaphore;

public class User implements Runnable {

    private String userName;
    private String password;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        Semaphore semaphore = new Semaphore(Thread.activeCount(), true);
        System.out.println(Thread.currentThread().getName());
        try {
            semaphore.acquire();
            new Manager().startFromFile();
        } catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}

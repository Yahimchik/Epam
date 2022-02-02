package by.yahimovich.task05treads.entity.user;

import by.yahimovich.task05treads.view.manager.Manager;

public class User implements Runnable {

    private String userName;
    private String password;

    public User() {
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
        Thread thread = new Thread(new Manager());
        thread.start();
    }
}

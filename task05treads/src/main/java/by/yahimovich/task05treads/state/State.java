package by.yahimovich.task05treads.state;

import by.yahimovich.task05treads.entity.user.User;

/**
 * Abstract class that displays the state of an object.
 *
 * @author Egor Yahimovich
 * @version 1.0
 */

public abstract class State {
    User user;

    /**
     * The context passes itself to the state
     * constructor so that the state can refer
     * to its data and methods in future if
     * needed.
     *
     * @param user object of class User.
     * @see User
     */

    public State(User user) {
        this.user = user;
    }

    public abstract String fillMatrix();

    public abstract String fillArray();

    public abstract String exit();
}

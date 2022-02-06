package by.yahimovich.task05treads.state;

import by.yahimovich.task05treads.entity.user.User;

public class ExitState extends State {

    public ExitState(User user) {
        super(user);
    }

    @Override
    public String fillMatrix() {
        return null;
    }

    @Override
    public String fillArray() {
        return null;
    }

    @Override
    public String exit() {
        return null;
    }
}

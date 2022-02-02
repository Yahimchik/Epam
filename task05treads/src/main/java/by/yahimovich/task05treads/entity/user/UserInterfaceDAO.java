package by.yahimovich.task05treads.entity.user;

public interface UserInterfaceDAO {

    abstract boolean isLogin(String userName, String password);

    abstract void registered(User user);
}

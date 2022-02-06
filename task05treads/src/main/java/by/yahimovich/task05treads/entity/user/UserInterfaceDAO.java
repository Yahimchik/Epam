package by.yahimovich.task05treads.entity.user;

public interface UserInterfaceDAO {

    boolean isLogin(String userName, String password);

    void registered(User user);
}

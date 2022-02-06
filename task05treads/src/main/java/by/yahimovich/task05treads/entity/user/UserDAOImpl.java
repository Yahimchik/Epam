package by.yahimovich.task05treads.entity.user;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserInterfaceDAO {

    private static final List<User> users = new ArrayList<>();

    @Override
    public boolean isLogin(String userName, String password) {
        boolean flag = false;

        for (User user : users) {
            if (user.getUserName().equals(userName) &&
                    user.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void registered(User user) {
        users.add(user);
    }
}

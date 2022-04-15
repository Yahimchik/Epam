package by.yahimovich.finaltask.connect;

import by.yahimovich.finaltask.entity.User;
import by.yahimovich.finaltask.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    private final static String SQL_INSERT =
            "INSERT INTO user(email, password, role) VALUES(?,?,?,?)";

    private final Connection connection;

    public DataBaseHelper() throws SQLException {
        connection = ConnectionPool.getConnection();
    }

    public PreparedStatement getPreparedStatement() {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public boolean insertUser(PreparedStatement statement, User user) {
        boolean flag = false;
        try {
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRole());
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void closeStatement(PreparedStatement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

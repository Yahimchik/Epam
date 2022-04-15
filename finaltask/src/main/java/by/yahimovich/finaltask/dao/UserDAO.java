package by.yahimovich.finaltask.dao;

import by.yahimovich.finaltask.entity.UserProfile;
import by.yahimovich.finaltask.pool.ConnectionPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAO<Integer, UserProfile> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDAO.class);
    private static final String SQL_SELECT_ALL_USERS =
            "SELECT * FROM user_profile";
    private static final String SQL_SELECT_USER_BY_LASTNAME =
            "SELECT id,firstname,secondname,lastname,address,phonenumber" +
                    " FROM user_profile WHERE lastname=?";
    private static final String SQL_SELECT_USER_BY_ID =
            "SELECT id,firstname,secondname,lastname,address,phonenumber" +
                    " FROM user_profile WHERE id=?";

    @Override
    public List<UserProfile> findAll() {
        List<UserProfile> users = new ArrayList<>();
        Connection connection;
        Statement statement = null;
        try {

            connection = ConnectionPool.getConnection();
//            connection = ConnectionPool.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_USERS);

            while (resultSet.next()) {
                UserProfile user = new UserProfile();
                user.setId(resultSet.getInt("id"));
                user.setFirstName(resultSet.getString("firstname"));
                user.setSecondName(resultSet.getString("secondname"));
                user.setLastName(resultSet.getString("lastname"));
                user.setAddress(resultSet.getString("address"));
                user.setPhoneNumber(resultSet.getString("phonenumber"));
                users.add(user);
            }
        } catch (SQLException e) {
            LOGGER.info(e.getMessage());
        } finally {
            close(statement);
        }
        return users;
    }

    @Override
    public UserProfile findEntityById(Integer id) {
        UserProfile user = new UserProfile();
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            connection = ConnectionPool.getConnection();
            statement = connection.prepareStatement(SQL_SELECT_USER_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("firstname"));
            user.setSecondName(resultSet.getString("secondname"));
            user.setLastName(resultSet.getString("lastname"));
            user.setAddress(resultSet.getString("address"));
            user.setPhoneNumber(resultSet.getString("phonenumber"));
        } catch (SQLException e) {
            LOGGER.info(e.getMessage());
        } finally {
            close(statement);
        }
        return user;
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(UserProfile entity) {
        return false;
    }

    @Override
    public boolean create(UserProfile entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UserProfile update(UserProfile entity) {
        return null;
    }

    public UserProfile findUserByLastName(String lastName) {
        UserProfile user = new UserProfile();
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            connection = ConnectionPool.getConnection();
            statement = connection.prepareStatement(SQL_SELECT_USER_BY_LASTNAME);
            statement.setString(1, lastName);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("firstname"));
            user.setSecondName(resultSet.getString("secondname"));
            user.setLastName(resultSet.getString("lastname"));
            user.setAddress(resultSet.getString("address"));
            user.setPhoneNumber(resultSet.getString("phonenumber"));
        } catch (SQLException e) {
            LOGGER.info(e.getMessage());
        } finally {
            close(statement);
        }
        return user;
    }
}

package by.yahimovich.finaltask.servlet;

import by.yahimovich.finaltask.connect.DataBaseHelper;
import by.yahimovich.finaltask.dao.UserDAO;
import by.yahimovich.finaltask.entity.User;
import by.yahimovich.finaltask.pool.ConnectionPool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/login")
public class InviteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        try {

            Connection connection = ConnectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement("insert into user VALUES(?,?,?,?)");

            User user = new User(email, password, role);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRole());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }
}

package by.yahimovich.finaltask;

import by.yahimovich.finaltask.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            String email = "email@";
            String password = "password";
            String role = "role";
            // loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/final_project", "root", "12345678");

            PreparedStatement ps = con.prepareStatement
                    ("INSERT INTO user VALUE (?,?,?,?)");

            ps.setInt(1,3);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, role);
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("You are successfully registered at geeksforgeeks");
            }

        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}

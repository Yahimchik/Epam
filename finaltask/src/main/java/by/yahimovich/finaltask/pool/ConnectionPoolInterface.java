package by.yahimovich.finaltask.pool;

import java.sql.Connection;

public interface ConnectionPoolInterface {
    Connection getConnection();
    boolean releaseConnection(Connection connection);
    String getUrl();
    String getUserDb();
    String getPassword();
}

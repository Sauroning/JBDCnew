package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_bdtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public Util() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}

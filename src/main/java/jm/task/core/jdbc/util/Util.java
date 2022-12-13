package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Util {

    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/postgres";
    private static final String DB_LOG = "postgres";
    private static final String DB_PASS = "12345db";

    public static Connection getConnectionDataBase() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_LOG, DB_PASS);
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return connection;
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        Connection connection = getConnectionDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }
}
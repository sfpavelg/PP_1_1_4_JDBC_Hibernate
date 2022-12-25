package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL_USERDB = "jdbc:mysql://localhost:3306/usersdb";
    private static final String NAME_USER = "root";
    private static final String PASSWORD = "GfdtkCjatby5555555555";

    private static Connection connection;


    public static Connection getConnection() {
        connection = null;
        try {
            connection = DriverManager.getConnection(URL_USERDB, NAME_USER, PASSWORD);
        } catch (SQLException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return connection;
    }
    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

}

package lesson_20220821;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    private static String dbUrl = "jdbc:mysql://localhost:3306/07_crud";
    private static String dbUsername = "root";
    private static String dbPassword = "mySQLR00tpsw";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}

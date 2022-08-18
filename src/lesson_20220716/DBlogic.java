package lesson_20220716;

// Add "mysql-connector-java-8.0.29.jar" to "lib" folder
import java.sql.*;

public class DBlogic {
    private String DB = "jdbc:mysql://localhost:3306/07_crud";
    private String USER = "root";
    private String PASSWORD = "mySQLR00tpsw";

    public void insert() {
        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement(); // SQL to DB

            String sqlInsert = "INSERT INTO users (email, name) VALUES ('lf@gmail.com', 'Laura')";
            stmt.executeUpdate(sqlInsert);
            System.out.println("Insert: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    public void update() {
        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();

            String sqlUpdate = "UPDATE users SET email = 'newlf@gmail.com' WHERE id = 2 LIMIT 1";
            stmt.executeUpdate(sqlUpdate);
            System.out.println("Update: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    public void delete() {
        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();

            String sqlDelete = "DELETE FROM users WHERE id = 1 LIMIT 1";
            stmt.executeUpdate(sqlDelete);
            System.out.println("Delete: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    public void select() {
        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT id, email, name FROM users");

            // next(): kamēr tabulā ir ieraksti, izpildam kodu..
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") +
                        "; e-mail: " + resultSet.getString("email") +
                        "; name: " + resultSet.getString("name"));
            }

            System.out.println("\n" + "Select: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }
}

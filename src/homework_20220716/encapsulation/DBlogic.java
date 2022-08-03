package homework_20220716.encapsulation;

import java.sql.*;

class DBlogic {
    private String DB;
    private String USER;
    private String PASSWORD;

    // Encapsulation: you can change the private field of the class through a separate setter method
    public void setDbConnection(String db, String user, String password) {
        this.DB = db;
        this.USER = user;
        this.PASSWORD = password;
    }

    public int getUserId(String email) {
        String sql = "SELECT id FROM users WHERE email = '" + email + "'";
        int userId = 0;

        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            PreparedStatement stmt = cnctn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery(sql);

            if (resultSet.next()) {
                userId = resultSet.getInt("id");
            }
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }

        if (userId == 0) {
            System.out.println("User isn't found.");
        }

        return userId;
    }

    public void insert(String email, String name) {
        String sql = "INSERT INTO users (email, name) VALUES ('" + email + "', '" + name + "')";

        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Insert: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    public void update(int id, String email) {
        String sql = "UPDATE users SET email = '" + email + "' WHERE id = " + id + " LIMIT 1";

        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Update: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    public void select() {
        String sql = "SELECT id, email, name FROM users";

        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            System.out.println();
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

    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id = " + id + " LIMIT 1";

        try {
            Connection cnctn = DriverManager.getConnection(DB, USER, PASSWORD);
            Statement stmt = cnctn.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Delete: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }
}

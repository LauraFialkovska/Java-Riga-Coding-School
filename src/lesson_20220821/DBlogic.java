package lesson_20220821;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBlogic {
    public void register(Connection conn, String name, String password) {
        String sql = "INSERT INTO users4login (name, password) VALUES (?, ?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setString(2, password);

            pstmt.executeUpdate();
            conn.close();

            System.out.println("Insert: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    public String select(Connection conn, String name) {
        String sql = "SELECT name FROM users4login WHERE name = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);

            ResultSet resultSet = pstmt.executeQuery();

            if(resultSet.next()) {
                System.out.println("User already exists :(");
            }

            resultSet.close();
            pstmt.close();
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }

        return name;
    }

    public boolean login(Connection conn, String name, String password) {
        boolean isLoggedIn = false;
        String sql = "SELECT name, password FROM users4login WHERE name = ? AND password = ?";

        try {
            PreparedStatement psdtmt = conn.prepareStatement(sql);

            psdtmt.setString(1, name);
            psdtmt.setString(2, password);

            ResultSet resultSet = psdtmt.executeQuery();

            if(resultSet.next()) {
                isLoggedIn = true;
            } else {
                System.out.println("User not found");
            }

            resultSet.close();
            psdtmt.close();
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }

        return isLoggedIn;
    }

}

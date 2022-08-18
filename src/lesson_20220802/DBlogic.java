package lesson_20220802;

// Add "mysql-connector-java-8.0.29.jar" to "lib" folder
import java.sql.*;

class DBlogic {
    int getUserId(Connection conn, String email) {
        String sql = "SELECT id FROM users WHERE email LIKE ?";
        int userId = 0;

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "%" + email + "%");

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                userId = resultSet.getInt("id");
            }

            resultSet.close();
            pstmt.close();
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }

        if (userId == 0) {
            System.out.println("User isn't found.");
        }

        return userId;
    }

    void insert(Connection conn, String email, String name) {
        String sql = "INSERT INTO users (email, name) VALUES (?, ?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, email);
            pstmt.setString(2, name);

            pstmt.executeUpdate();

            System.out.println("Insert: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    void update(Connection conn, int id, String email) {
        String sql = "UPDATE users SET email = ? WHERE id = ? LIMIT 1";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, email);
            pstmt.setInt(2, id);

            pstmt.executeUpdate();

            System.out.println("Update: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    void select(Connection conn) {
        String sql = "SELECT id, email, name FROM users";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet resultSet = pstmt.executeQuery();

            System.out.println();
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") +
                        "; e-mail: " + resultSet.getString("email") +
                        "; name: " + resultSet.getString("name"));
            }

            resultSet.close();
            pstmt.close();

            System.out.println("\n" + "Select: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }

    void delete(Connection conn, int id) {
        String sql = "DELETE FROM users WHERE id = ? LIMIT 1";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            pstmt.executeUpdate();

            System.out.println("Delete: done!");
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }
}

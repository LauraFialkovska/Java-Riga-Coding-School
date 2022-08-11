package lesson_20220802;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Files {
    public static void main(String[] args) throws SQLException {

        // DB
        String uEmail = "dasha.email@mail.mail";

        Connection conn = MySqlConnection.getConnection();
        DBlogic db = new DBlogic();

        int uId = db.getUserId(conn, uEmail);

        // File #1
        String filename = "src/lesson_20220802/testMe1.txt";

        try {
            /*
            java.io.File file = new java.io.File(filename);
            file.createNewFile();
            */

            FileWriter writer = new FileWriter(filename);
            writer.write(String.valueOf(uId));
            writer.close();

            System.out.println("File #1 is created!");
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        // File #2
        selectAndPutToFile(conn);
    }

    public static void selectAndPutToFile(Connection conn) {
        String sql = "SELECT id, email, name FROM users";
        String filename = "src/lesson_20220802/testMe2.txt";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet resultSet = pstmt.executeQuery();

            try {
                FileWriter writer = new FileWriter(filename);

                while (resultSet.next()) {
                    String data = "id: " + resultSet.getInt("id") +
                            "; e-mail: " + resultSet.getString("email") +
                            "; name: " + resultSet.getString("name");

                    writer.write(data + "\n");
                }

                writer.close();
                System.out.println("File #2 is created!");
            } catch (Exception e) {
                e.fillInStackTrace();
            }

            resultSet.close();
            pstmt.close();
        } catch (SQLException excptn) {
            excptn.printStackTrace();
        }
    }
}

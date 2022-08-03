package lesson_20220802;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        String uEmail = "tiktok.email@mail.mail";
        String newUEmail = "tiktak.email@mail.mail";
        String uName = "Tik Tok";

        Connection conn = MySqlConnection.getConnection();
        DBlogic db = new DBlogic();

        db.insert(conn, uEmail, uName);
        db.select(conn);

        int uId = db.getUserId(conn, uEmail);

        db.update(conn, uId, newUEmail);
        db.select(conn);

        db.delete(conn, uId);
        db.select(conn);
    }
}

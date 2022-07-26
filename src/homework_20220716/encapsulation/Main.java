package homework_20220716.encapsulation;

public class Main {
    public static void main(String[] args) {

        String uEmail = "tiktok.email@mail.mail";
        String newUEmail = "tiktak.email@mail.mail";
        String uName = "Tik Tok";

        DBlogic db = new DBlogic();
        db.setDbConnection("jdbc:mysql://localhost:3306/07_crud", "root", "mySQLR00tpsw");

        db.insert(uEmail, uName);
        db.select();

        int uId = db.getUserId(uEmail);

        db.update(uId, newUEmail);
        db.select();

        db.delete(uId);
        db.select();
    }
}

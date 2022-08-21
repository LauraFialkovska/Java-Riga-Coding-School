package lesson_20220816;

public class Encryption {
    public static void main(String[] args) {

        String password = "madars";
        System.out.println("Password: " + password);

        String hashedPassword = hash(password);
        System.out.println("hashedPassword: " + hashedPassword);

        String unhashedPassword = unhash(hashedPassword);
        System.out.println("unhashedPassword: " + unhashedPassword);
    }

    static String hash(String password) {
        // ASCII characters
        char[] characters = password.toCharArray();
        String hashedPassword = "";

        for (char c : characters) {
            c += 1;
            hashedPassword += c;
        }

        return hashedPassword;
    }

    static String unhash(String password) {
        char[] characters = password.toCharArray();
        String unhashedPassword = "";

        for (char c : characters) {
            c -= 1;
            unhashedPassword += c;
        }

        return unhashedPassword;
    }
}

package lesson_20220821;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.SQLException;

public class Auth implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel username;
    private JTextField userInput;

    private JLabel password;
    private JPasswordField userPass;
    private JButton register;
    private JButton login;

    private JPanel dashboard;

    public void authScreen() {
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dashboard = new JPanel();
        dashboard.setLayout(null);

        frame.add(panel);

        panel.setLayout(null);

        username = new JLabel("Username");
        username.setBounds(10,20,80,25);
        panel.add(username);

        userInput = new JTextField(20);
        userInput.setBounds(100,20,165,25);
        panel.add(userInput);

        password = new JLabel("Password");
        password.setBounds(10,50,80,25);
        panel.add(password);

        userPass = new JPasswordField(20);
        userPass.setBounds(100,50,165,25);
        panel.add(userPass);

        register = new JButton("Register");
        register.setBounds(6, 80, 80, 25);
        register.addActionListener(this);
        panel.add(register);

        login = new JButton("Login");
        login.setBounds(80, 80, 80, 25);
        login.addActionListener(this);
        panel.add(login);

        frame.setVisible(true);
    }

    public String md5(String value) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");

        algorithm.update(value.getBytes(), 0, value.length());

        return new BigInteger(1, algorithm.digest()).toString(16);
    }

    public void actionPerformed(ActionEvent e) {
        String userVal = userInput.getText();
        String passVal = userPass.getText();

        Connection conn;
        try {
            conn = MySqlConnection.getConnection();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        DBlogic db = new DBlogic();

        if (e.getSource() == register) {
            if(userVal.length() == 0 || passVal.length() == 0) {
                System.out.println("Empty field");
            } else {
                boolean check = Boolean.parseBoolean(db.select(conn, userVal));

                if (check) {
                    System.out.println("User already exists");
                } else {
                    String md5 = null;

                    try {
                        md5 = md5(passVal);
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }

                    System.out.println("MD5 password: " + md5);
                    db.register(conn, userVal, md5);
                }
            }
        } else if (e.getSource() == login) {
            if(userVal.length() == 0 || passVal.length() == 0) {
                System.out.println("Empty field");
            } else {
                String md5 = null;

                try {
                    md5 = md5(passVal);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }

                boolean ch = db.login(conn, userVal, md5);

                if (ch) {
                    frame.remove(panel);
                    frame.add(dashboard);
                    frame.repaint(); // Include changes
                    frame.setTitle("Welcome " + userVal + "!");
                }
            }
        }
        else {
            System.out.println("Error");
        }
    }
}

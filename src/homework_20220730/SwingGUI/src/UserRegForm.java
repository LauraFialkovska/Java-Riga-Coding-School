import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Enumeration;

public class UserRegForm extends JFrame {
    private JPanel mainPanel;
    private JLabel pageTitle;
    private JLabel name, email, phone, country, city, street, gender, password;
    private JLabel details, showName, showEmail, showPhone, showCountry, showCity, showStreet, showGender, showPassword;
    private JTextField inputName, inputEmail, inputPhone, inputCountry, inputCity, inputStreet, inputPassword;
    private JRadioButton selectMale, selectFemail;
    private JButton submit;

    public UserRegForm(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        ButtonGroup rbGroup = new ButtonGroup();
        rbGroup.add(selectMale);
        rbGroup.add(selectFemail);

        showName.setVisible(false);
        showEmail.setVisible(false);
        showPhone.setVisible(false);
        showCountry.setVisible(false);
        showCity.setVisible(false);
        showStreet.setVisible(false);
        showGender.setVisible(false);
        showPassword.setVisible(false);

        inputPhone.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                /*
                try {
                    int phone = Integer.parseInt(inputPhone.getText());
                } catch (NumberFormatException nfe) {
                    inputPhone.setText("");
                }
                */

                char character = e.getKeyChar();

                if ( ((character < '0') || (character > '9')) && (character != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // If it's not a number, ignore the event
                }
            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inputName.getText();
                String email = inputEmail.getText();
                String phone = inputPhone.getText();
                String country = inputCountry.getText();
                String city = inputCity.getText();
                String street = inputStreet.getText();
                String gender = getSelectedRadioButtonText(rbGroup);
                String password = inputPassword.getText();

                showName.setText(name);
                showEmail.setText(email);
                showPhone.setText(phone);
                showCountry.setText(country);
                showCity.setText(city);
                showStreet.setText(street);
                showGender.setText(gender);
                showPassword.setText(password);

                details.setVisible(true);
                showName.setVisible(true);
                showEmail.setVisible(true);
                showPhone.setVisible(true);
                showCountry.setVisible(true);
                showCity.setVisible(true);
                showStreet.setVisible(true);
                showGender.setVisible(true);
                showPassword.setVisible(true);
            }
        });
    }

    public String getSelectedRadioButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        JFrame frame = new UserRegForm("User registration");

        frame.setVisible(true);
        frame.setSize(350, 750);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}

import javax.swing.*;

/**
 * Developer Notes 1st April 2025
 *
 * This is the login window for the application.
 * Simple UI containing the username and password fields
 * Still do not have the possibility of checking login yet.
 * Also not yet connected to the database.
 *
 **/

public class Login extends JFrame {

    private final JLabel usernameLabel, passwordLabel, tooltip;
    private final JTextField usernameTextBox;
    private final JPasswordField passwTextBox;
    private final JButton loginButton;
    private final JPanel LoginPanel;

    Login() {

        pack();
        setSize(500, 300);
        setTitle("Login");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        tooltip = new JLabel();
        tooltip.setText("Enter your username and password");

        usernameLabel = new JLabel();
        usernameLabel.setText("Username:");
        usernameTextBox = new JTextField(15);

        passwordLabel = new JLabel();
        passwordLabel.setText("Password:");
        passwTextBox = new JPasswordField(15);

        loginButton = new JButton();
        loginButton.setText("Login");

        // Create JPanel and add the components.
        LoginPanel = new JPanel();
        LoginPanel.add(tooltip);
        LoginPanel.add(usernameLabel);
        LoginPanel.add(passwordLabel);
        LoginPanel.add(passwTextBox);
        LoginPanel.add(usernameTextBox);
        LoginPanel.add(loginButton);

        add(LoginPanel);
        setVisible(true);
        // set the default closing operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Login ex = new Login();
    }

}

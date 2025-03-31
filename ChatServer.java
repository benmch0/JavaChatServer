import javax.swing.*;

/***
 *
 * Developer Notes <31st March 2025>:
 *
 * Have tried to structure the file better by using a constructor. This contains
 * all the JFrame contents.
 * So far the file is only setup using a SpringLayout which I plan to change to
 * a more flexible one.
 * Also the buttons do not go to anywhere yet and there is no way to actually
 * register and login as of yet.
 * Still need to add data base functionality too but thats further down the line
 * once I have structured the app.
 *
 ***/

public class ChatServer extends JFrame {

    // Declaring all components here.
    private final JPanel openingPanel;
    private final JLabel textLabel;
    private final JLabel textLabel2;
    private final JButton loginButton;
    private final JButton registerButton;

    // No parameter constructor.
    ChatServer() {
        pack();
        setTitle("Ben's Chat Server");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true); // Try keeping it on top

        // creating a new panel using the SpringLayout (subject to change)
        openingPanel = new JPanel();
        SpringLayout layout = new SpringLayout();
        openingPanel.setLayout(layout);

        // add a username label and center it
        textLabel = new JLabel("Please Login or Register to chat!", JLabel.CENTER);
        layout.putConstraint(SpringLayout.WEST, textLabel, 50, SpringLayout.WEST, openingPanel);
        layout.putConstraint(SpringLayout.NORTH, textLabel, 30, SpringLayout.WEST, openingPanel);
        // add the text label to the panel
        openingPanel.add(textLabel);

        // add a username label and center it
        textLabel2 = new JLabel("Welcome!", JLabel.CENTER);
        layout.putConstraint(SpringLayout.WEST, textLabel2, 120, SpringLayout.WEST, openingPanel);
        layout.putConstraint(SpringLayout.NORTH, textLabel2, 10, SpringLayout.WEST, openingPanel);
        // add the text label to the panel
        openingPanel.add(textLabel2);

        // Add Login and Register Buttons.
        loginButton = new JButton("Login");
        loginButton.setToolTipText("press button to login");
        openingPanel.add(loginButton);
        layout.putConstraint(SpringLayout.WEST, loginButton, 20, SpringLayout.WEST, openingPanel);
        layout.putConstraint(SpringLayout.NORTH, loginButton, 80, SpringLayout.NORTH, openingPanel);

        registerButton = new JButton("Register");
        registerButton.setToolTipText("press button to register");
        openingPanel.add(registerButton);
        layout.putConstraint(SpringLayout.WEST, registerButton, 190, SpringLayout.WEST, openingPanel);
        layout.putConstraint(SpringLayout.NORTH, registerButton, 80, SpringLayout.NORTH, openingPanel);

        // add the panel to the window
        add(openingPanel);
        // make the window visible
        setVisible(true);
        // set the default closing operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ChatServer ex = new ChatServer();
    }
}

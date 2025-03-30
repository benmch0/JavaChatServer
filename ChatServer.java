import javax.swing.*;

public class ChatServer {

    private static void ChatServer() {

        // Create New JFrame for the Opening Window.
        JFrame frame = new JFrame("ChatServer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First Screen will be an option to sign up or login.
        JLabel label = new JLabel("Login or Sign Up Below!");
        frame.getContentPane().add(label);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(100, 100); // Set position
        frame.setSize(500, 500); // Set a fixed size
        frame.setAlwaysOnTop(true); // Try keeping it on top
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ChatServer();
            }
        });
    }
}

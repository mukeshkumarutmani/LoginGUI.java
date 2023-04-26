import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {
    // GUI components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;
    
    // Pre-defined credentials
    private String validUsername = "myusername";
    private String validPassword = "mypassword";
    
    public LoginGUI() {
        super("Login"); // Set title of the window
        
        // Create GUI components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        messageLabel = new JLabel();
        
        // Add event listeners to the components
        loginButton.addActionListener(this);
        passwordField.addActionListener(this);
        
        // Create and set layout for the window
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(messageLabel);
        setContentPane(panel);
        
        // Set size and make the window visible
        setSize(300, 150);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle login button or password field events
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        if (username.equals(validUsername) && password.equals(validPassword)) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Incorrect username or password.");
        }
    }
    
    public static void main(String[] args) {
        new LoginGUI();
    }
}
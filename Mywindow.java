import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mywindow extends JFrame {
    private JLabel heading;
    private JPanel mainPanel;
    private JLabel nameLabel, passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton submitButton, resetButton;
    private Font font = new Font("", Font.BOLD, 30);

    public Mywindow() {
        super.setTitle("My Window");
        super.setSize(500, 500);
        super.setLocation(100, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        super.setVisible(true); // Make the window visible after setting up the GUI
    }

    private void createGUI() {
        this.setLayout(new BorderLayout());

        // Heading
        heading = new JLabel("My First Form", JLabel.CENTER);
        heading.setFont(font);
        this.add(heading, BorderLayout.NORTH);

        // Main Panel with GridLayout
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2, 10, 10)); // Added gaps between components

        // Name Label and Text Field
        nameLabel = new JLabel("Enter Name:");
        nameLabel.setFont(font);
        nameTextField = new JTextField();
        nameTextField.setFont(font);

        // Password Label and Password Field
        passwordLabel = new JLabel("Enter Your Password:");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);

        // Buttons
        submitButton = new JButton("Submit");
        submitButton.setFont(font);
        resetButton = new JButton("Reset");
        resetButton.setFont(font);
        resetButton.setSize(10, 20);

        // Adding components to the main panel
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(submitButton);
        mainPanel.add(resetButton);

        // Adding the main panel to the center of the frame
        this.add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Mywindow(); // Create and display the window
    }
}

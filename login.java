package Swing;

import javax.swing.*;

public class login {    
    public static void main(String[] args) {
   
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 

        JLabel loginLabel = new JLabel("Login Form");
        loginLabel.setBounds(120, 10, 200, 30);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 80, 30);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 90, 80, 30);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(140, 50, 150, 30);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 90, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 140, 100, 30);

        frame.add(loginLabel);
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        frame.setVisible(true);
    }
}

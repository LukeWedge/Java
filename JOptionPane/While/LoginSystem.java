package While;

import javax.swing.JOptionPane;  // Import for dialog boxes

public class LoginSystem {
    public static void main(String[] args) {
        // Correct login and password
        String correctLogin = "admin";
        String correctPassword = "1234";

        String login = "";   // User input for login
        String password = ""; // User input for password

        // Repeat while login or password is incorrect
        while (!login.equals(correctLogin) || !password.equals(correctPassword)) {
            login = JOptionPane.showInputDialog("Enter login:");               // Ask for login
            password = JOptionPane.showInputDialog("Enter password:");        // Ask for password

            // Check if either is wrong
            if (!login.equals(correctLogin) || !password.equals(correctPassword)) {
                JOptionPane.showMessageDialog(null, "Incorrect login or password. Try again.");
            }
        }

        // If correct, show success message
        JOptionPane.showMessageDialog(null, "Access granted!");
    }
}

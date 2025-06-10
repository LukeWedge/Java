package While;

import javax.swing.JOptionPane; // Import for dialog boxes

public class PasswordCheck {
    public static void main(String[] args) {
        // Read the first password
        String password = JOptionPane.showInputDialog("Enter the password:");

        // Loop until the correct password is entered
        while (!password.equals("1234")) {
            // Show error message
            JOptionPane.showMessageDialog(null, "Incorrect password. Try again.");

            // Ask again
            password = JOptionPane.showInputDialog("Enter the password:");
        }

        // Show success message
        JOptionPane.showMessageDialog(null, "Access granted!");
    }
}

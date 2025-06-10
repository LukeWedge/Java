import javax.swing.JOptionPane;  // Import dialog utilities

public class LoginSystem {
    public static void main(String[] args) {
        String correctUser = "admin";      // Correct username
        String correctPass = "1234";       // Correct password
        String user, pass;                 // Input from user
        int attempts = 0;                  // Number of attempts

        // Try login at least once, repeat while incorrect and less than 3 attempts
        do {
            // Ask for username and password
            user = JOptionPane.showInputDialog("Username:");
            pass = JOptionPane.showInputDialog("Password:");

            // Check if login is correct
            if (user.equals(correctUser) && pass.equals(correctPass)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                return; // Exit program
            } else {
                attempts++; // Count the failed attempt
                JOptionPane.showMessageDialog(null, 
                    "Invalid login. Attempts left: " + (3 - attempts));
            }
        } while (attempts < 3);  // Repeat while attempts are less than 3

        // If login failed 3 times
        JOptionPane.showMessageDialog(null, "Access denied. Too many failed attempts.");
    }
}

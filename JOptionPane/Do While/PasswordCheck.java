import javax.swing.JOptionPane;  // Import for dialogs

public class PasswordCheck {
    public static void main(String[] args) {
        String correctPassword = "1234"; // The correct password
        String input;                    // User input
        int attempts = 0;                // Number of tries

        // Loop until password is correct or 3 attempts are used
        while (attempts < 3) {
            // Ask for password
            input = JOptionPane.showInputDialog("Enter the password:");

            // Check if password is correct
            if (input.equals(correctPassword)) {
                JOptionPane.showMessageDialog(null, "Access granted!");
                return; // Exit the program
            } else {
                attempts++; // Count the wrong attempt
                JOptionPane.showMessageDialog(null, "Incorrect. Attempts left: " + (3 - attempts));
            }
        }

        // If 3 attempts failed
        JOptionPane.showMessageDialog(null, "Access denied. Too many attempts.");
    }
}

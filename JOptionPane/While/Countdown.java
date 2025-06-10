package While;

import javax.swing.JOptionPane;  // Import for dialog boxes

public class Countdown {
    public static void main(String[] args) {
        // Read the starting number
        int i = Integer.parseInt(JOptionPane.showInputDialog("Enter a starting number:"));

        String result = "";  // To build the countdown string

        // While i is greater than or equal to 0
        while (i >= 0) {
            result += i + "\n";  // Add current number to the result
            i--;                 // Decrease by 1
        }

        // Show the countdown
        JOptionPane.showMessageDialog(null, result);
    }
}

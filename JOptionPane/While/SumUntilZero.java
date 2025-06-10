package While;

import javax.swing.JOptionPane;  // Import for dialog boxes

public class SumUntilZero {
    public static void main(String[] args) {
        int sum = 0;  // To store the total sum

        // Read the first number
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (0 to stop):"));

        // Loop while the number is not 0
        while (num != 0) {
            sum += num;  // Add the number to the sum

            // Ask for the next number
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter another number (0 to stop):"));
        }

        // Show the final result
        JOptionPane.showMessageDialog(null, "Total sum: " + sum);
    }
}

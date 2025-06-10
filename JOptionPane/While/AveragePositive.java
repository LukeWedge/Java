package While;

import javax.swing.JOptionPane; // Import for dialog boxes

public class AveragePositive {
    public static void main(String[] args) {
        int sum = 0; // Sum of values
        int count = 0; // Count of valid numbers

        // Read the first number
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number (negative to stop):"));

        // While the number is not negative
        while (num >= 0) {
            sum += num; // Add to the sum
            count++; // Count this number

            // Ask for the next number
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter another positive number (negative to stop):"));
        }

        // If at least one number was entered
        if (count > 0) {
            double average = (double) sum / count; // Calculate the average
            JOptionPane.showMessageDialog(null, "Average: " + average);
        } else {
            JOptionPane.showMessageDialog(null, "No positive numbers entered.");
        }
    }
}

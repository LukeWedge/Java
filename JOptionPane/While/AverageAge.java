package While;

import javax.swing.JOptionPane;  // Import for dialog boxes

public class AverageAge {
    public static void main(String[] args) {
        int sum = 0;    // To accumulate the ages
        int count = 0;  // To count how many ages were entered

        // Read the first age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter an age (-1 to stop):"));

        // Repeat while age is not -1
        while (age != -1) {
            sum += age;   // Add age to total
            count++;      // Count this entry

            // Read next age
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter another age (-1 to stop):"));
        }

        // Check if any age was entered
        if (count > 0) {
            double average = (double) sum / count;  // Calculate average
            JOptionPane.showMessageDialog(null, "Average age: " + average);
        } else {
            JOptionPane.showMessageDialog(null, "No ages entered.");
        }
    }
}

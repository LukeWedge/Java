import javax.swing.JOptionPane;  // Import for input/output dialogs

public class SumFiveNumbers {
    public static void main(String[] args) {
        int sum = 0;  // Variable to store the total sum

        // Loop to read 5 numbers
        for (int i = 1; i <= 5; i++) {
            // Ask user to input a number
            String input = JOptionPane.showInputDialog("Enter number " + i + ":");
            int number = Integer.parseInt(input);  // Convert to integer
            sum += number;  // Add to the sum
        }

        // Show the final result
        JOptionPane.showMessageDialog(null, "The total sum is: " + sum);
    }
}

import javax.swing.JOptionPane;  // Import for dialogs

public class FindMaxNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;  // Start with the smallest possible value

        // Loop to read 10 numbers
        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Enter number " + i + ":");
            int number = Integer.parseInt(input);  // Convert input to int

            // Check if this number is greater than the current max
            if (number > max) {
                max = number;  // Update max
            }
        }

        // Show the largest number
        JOptionPane.showMessageDialog(null, "The largest number is: " + max);
    }
}

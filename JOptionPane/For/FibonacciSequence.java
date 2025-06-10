import javax.swing.JOptionPane;  // Import for dialog boxes

public class FibonacciSequence {
    public static void main(String[] args) {
        // Ask the user for the number of Fibonacci terms
        String input = JOptionPane.showInputDialog("Enter how many Fibonacci numbers to generate:");
        int n = Integer.parseInt(input);  // Convert input to integer

        int a = 0, b = 1;     // First two terms
        String sequence = "Fibonacci Sequence:\n";

        // Generate Fibonacci terms using for loop
        for (int i = 1; i <= n; i++) {
            sequence += a + " ";  // Add current term to the sequence

            int next = a + b;     // Calculate next term
            a = b;                // Move to next values
            b = next;
        }

        // Show the sequence
        JOptionPane.showMessageDialog(null, sequence);
    }
}

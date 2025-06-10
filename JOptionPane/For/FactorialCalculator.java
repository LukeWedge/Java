import javax.swing.JOptionPane;  // Import for input/output dialogs

public class FactorialCalculator {
    public static void main(String[] args) {
        // Ask the user to enter a number
        String input = JOptionPane.showInputDialog("Enter a number to calculate the factorial:");
        int number = Integer.parseInt(input);  // Convert input to integer

        long factorial = 1;  // Use long to support large results

        // Loop from number down to 1
        for (int i = number; i >= 1; i--) {
            factorial *= i;  // Multiply the current value
        }

        // Show the factorial result
        JOptionPane.showMessageDialog(null, "Factorial of " + number + " is: " + factorial);
    }
}

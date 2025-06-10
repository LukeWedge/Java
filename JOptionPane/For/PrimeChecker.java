import javax.swing.JOptionPane;  // Import for dialog boxes

public class PrimeChecker {
    public static void main(String[] args) {
        // Ask the user to enter a number
        String input = JOptionPane.showInputDialog("Enter a number to check if it is prime:");
        int number = Integer.parseInt(input);  // Convert input to integer

        int count = 0;  // Count of divisors

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // If number is divisible by i
                count++;            // Increase divisor count
            }
        }

        // If the number has exactly 2 divisors, it's prime
        if (count == 2) {
            JOptionPane.showMessageDialog(null, number + " is a prime number.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is not a prime number.");
        }
    }
}

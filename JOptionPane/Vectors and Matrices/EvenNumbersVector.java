import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class EvenNumbersVector {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];  // Create a vector with 10 positions

        int number = 2;  // Start from the first even number

        // Loop to fill the vector with even numbers from 2 to 20
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = number;  // Store the current even number
            number += 2;  // Go to the next even number
        }

        // Prepare a string to display the even numbers
        String result = "Even numbers from 2 to 20:\n";

        // Loop to add each number to the result string
        for (int i = 0; i < evenNumbers.length; i++) {
            result += evenNumbers[i] + " ";  // Add each number with a space
        }

        // Show the result in a dialog
        JOptionPane.showMessageDialog(null, result);  // Display the vector
    }
}

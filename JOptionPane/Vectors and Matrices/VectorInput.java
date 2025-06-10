import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class VectorInput {
    public static void main(String[] args) {
        int[] numbers = new int[5];  // Create an integer array with 5 positions

        // Loop to read 5 numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            // Show input dialog and convert the input to an integer
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + (i + 1) + ":"));
        }

        // Prepare a string to show all values
        String result = "You entered:\n";  // Start the message

        // Loop to add each number to the message
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i] + "\n";  // Add each number and a newline
        }

        // Show the final message with all numbers
        JOptionPane.showMessageDialog(null, result);  // Display the result in a message box
    }
}

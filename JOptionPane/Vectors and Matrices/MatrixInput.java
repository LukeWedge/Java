import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class MatrixInput {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];  // Create a 2x2 integer matrix

        // Loop to read values for each row and column
        for (int i = 0; i < 2; i++) {  // Loop for rows
            for (int j = 0; j < 2; j++) {  // Loop for columns
                // Ask the user to enter a number for position [i][j]
                matrix[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter value for position [" + i + "][" + j + "]:")
                );
            }
        }

        // Prepare a string to show the matrix formatted
        String result = "Matrix:\n";  // Start the message

        // Loop to add each row to the result string
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result += matrix[i][j] + "\t";  // Add number with a tab for spacing
            }
            result += "\n";  // New line after each row
        }

        // Show the matrix in a message box
        JOptionPane.showMessageDialog(null, result);  // Display the matrix
    }
}

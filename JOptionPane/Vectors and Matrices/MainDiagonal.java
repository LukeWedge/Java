import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class MainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // Create a 3x3 integer matrix

        // Loop to read values for each matrix position
        for (int i = 0; i < 3; i++) {        // Loop over rows
            for (int j = 0; j < 3; j++) {    // Loop over columns
                // Ask user for value at position [i][j]
                matrix[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter value for position [" + i + "][" + j + "]:")
                );
            }
        }

        // Prepare string to show main diagonal elements
        String result = "Main diagonal elements:\n";

        // Loop to access only positions where row == column
        for (int i = 0; i < 3; i++) {
            result += matrix[i][i] + " ";  // Add diagonal element to result
        }

        // Show the result
        JOptionPane.showMessageDialog(null, result);  // Display the diagonal
    }
}

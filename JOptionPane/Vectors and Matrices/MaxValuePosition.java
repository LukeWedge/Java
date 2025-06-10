import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class MaxValuePosition {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];  // Create a 5x5 matrix
        int max = Integer.MIN_VALUE;  // Start with the smallest possible value
        int row = 0, col = 0;  // Variables to store the position of the max value

        // Loop to fill the matrix and find the max value
        for (int i = 0; i < 5; i++) {          // Rows
            for (int j = 0; j < 5; j++) {      // Columns
                // Read value from user
                matrix[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter value for [" + i + "][" + j + "]:")
                );

                // Check if this value is greater than the current max
                if (matrix[i][j] > max) {
                    max = matrix[i][j];  // Update the max value
                    row = i;             // Save the row index
                    col = j;             // Save the column index
                }
            }
        }

        // Show the max value and its position
        String message = "Max value: " + max + "\nPosition: [" + row + "][" + col + "]";
        JOptionPane.showMessageDialog(null, message);  // Display result
    }
}

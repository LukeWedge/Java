import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class CountGreaterThanTen {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // Create a 3x3 matrix
        int count = 0;  // Counter for elements greater than 10

        // Loop to fill the matrix with user input
        for (int i = 0; i < 3; i++) {         // Rows
            for (int j = 0; j < 3; j++) {     // Columns
                // Ask for value at position [i][j]
                matrix[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter value for [" + i + "][" + j + "]:")
                );

                // Check if the value is greater than 10
                if (matrix[i][j] > 10) {
                    count++;  // Increase the counter
                }
            }
        }

        // Show how many elements are greater than 10
        JOptionPane.showMessageDialog(null, "Elements > 10: " + count);
    }
}

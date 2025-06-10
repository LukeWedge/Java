import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];  // Create a 4x4 matrix
        int evenCount = 0;  // Counter for even numbers

        // Loop to read all elements of the matrix
        for (int i = 0; i < 4; i++) {         // Rows
            for (int j = 0; j < 4; j++) {     // Columns
                // Ask user for input and parse it to integer
                matrix[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter value for [" + i + "][" + j + "]:")
                );

                // Check if the number is even
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;  // Increment counter if number is even
                }
            }
        }

        // Show the total count of even numbers
        JOptionPane.showMessageDialog(null, "Total even numbers: " + evenCount);
    }
}

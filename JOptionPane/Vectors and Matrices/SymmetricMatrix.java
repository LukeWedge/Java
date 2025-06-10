import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // Create a 3x3 matrix
        boolean isSymmetric = true;     // Assume the matrix is symmetric

        // Fill the matrix with user input
        for (int i = 0; i < 3; i++) {         // Rows
            for (int j = 0; j < 3; j++) {     // Columns
                matrix[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter value for [" + i + "][" + j + "]:")
                );
            }
        }

        // Check symmetry by comparing matrix[i][j] with matrix[j][i]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;  // If any element differs, it's not symmetric
                    break;
                }
            }
            if (!isSymmetric) break;  // Exit early if already not symmetric
        }

        // Show result
        if (isSymmetric) {
            JOptionPane.showMessageDialog(null, "The matrix is symmetric.");
        } else {
            JOptionPane.showMessageDialog(null, "The matrix is NOT symmetric.");
        }
    }
}

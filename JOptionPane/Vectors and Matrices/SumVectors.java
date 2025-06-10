import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class SumVectors {
    public static void main(String[] args) {
        int[] vector1 = new int[5];  // First vector
        int[] vector2 = new int[5];  // Second vector
        int[] sumVector = new int[5];  // Vector to store the sum

        // Read values for the first vector
        for (int i = 0; i < 5; i++) {
            vector1[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Enter value " + (i + 1) + " for Vector 1:")
            );
        }

        // Read values for the second vector
        for (int i = 0; i < 5; i++) {
            vector2[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Enter value " + (i + 1) + " for Vector 2:")
            );
        }

        // Sum corresponding elements and store in sumVector
        for (int i = 0; i < 5; i++) {
            sumVector[i] = vector1[i] + vector2[i];  // Element-wise sum
        }

        // Prepare a string to show the sumVector
        String result = "Sum of corresponding elements:\n";
        for (int i = 0; i < 5; i++) {
            result += vector1[i] + " + " + vector2[i] + " = " + sumVector[i] + "\n";
        }

        // Show the result
        JOptionPane.showMessageDialog(null, result);
    }
}

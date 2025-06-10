package While;


import javax.swing.JOptionPane; // Import for dialog boxes

public class ShowNumbers {
    public static void main(String[] args) {
        int i = 1; // Start from 1
        String result = "Numbers from 1 to 20:\n";

        // Loop while i is less than or equal to 20
        while (i <= 20) {
            result += i + " "; // Add current number to result
            i++; // Increase the counter
        }

        // Show the result
        JOptionPane.showMessageDialog(null, result);
    }
}

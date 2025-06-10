import javax.swing.JOptionPane;  // Import for dialog boxes

public class DoWhileCount {
    public static void main(String[] args) {
        int i = 1;           // Start from 1
        String output = "";  // To store the numbers

        // Do this at least once
        do {
            output += i + "\n";  // Add number to output string
            i++;                 // Increase the counter
        } while (i <= 10);       // Repeat while i is less than or equal to 10

        // Show the numbers in a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}

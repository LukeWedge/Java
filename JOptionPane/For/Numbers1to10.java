import javax.swing.JOptionPane;  // Import for GUI dialogs

public class Numbers1to10 {
    public static void main(String[] args) {
        String output = "";  // String to store all numbers

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            output += i + "\n";  // Add number to output string
        }

        // Show result in a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}

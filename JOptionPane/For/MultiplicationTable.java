import javax.swing.JOptionPane;  // Import for dialogs

public class MultiplicationTable {
    public static void main(String[] args) {
        // Ask the user for a number
        String input = JOptionPane.showInputDialog("Enter a number for the multiplication table:");
        int number = Integer.parseInt(input);  // Convert input to integer

        String table = "Multiplication Table of " + number + ":\n";

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;  // Calculate the product
            table += number + " x " + i + " = " + result + "\n";  // Add to output
        }

        // Show the result in a dialog box
        JOptionPane.showMessageDialog(null, table);
    }
}

import javax.swing.JOptionPane;  // Import for dialogs

public class CountPositive {
    public static void main(String[] args) {
        int number;        // To store the number entered
        int count = 0;     // Counter for positive numbers

        // Repeat at least once
        do {
            // Read a number from user
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (negative to stop):"));

            // If number is positive, increase counter
            if (number >= 0) {
                count++;
            }
        } while (number >= 0);  // Continue while number is not negative

        // Show how many positives were entered
        JOptionPane.showMessageDialog(null, "You entered " + count + " positive number(s).");
    }
}

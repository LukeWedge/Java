import javax.swing.JOptionPane;  // Import for dialog boxes

public class CountEvenNumbers {
    public static void main(String[] args) {
        int count = 0;  // Variable to count even numbers

        // Loop from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {  // If the number is even
                count++;       // Increase the counter
            }
        }

        // Show the total count of even numbers
        JOptionPane.showMessageDialog(null, "There are " + count + " even numbers between 1 and 50.");
    }
}

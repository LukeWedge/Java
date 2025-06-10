import javax.swing.JOptionPane;  // Import for dialogs

public class ShoppingSimulation {
    public static void main(String[] args) {
        double price;       // To store each item price
        double total = 0;   // Accumulator for total price
        int option;         // User choice to continue or stop

        // Repeat while user wants to continue shopping
        do {
            // Read item price from user
            price = Double.parseDouble(JOptionPane.showInputDialog("Enter item price:"));

            // Add to the total
            total += price;

            // Ask if user wants to continue (1 = yes, 0 = no)
            option = Integer.parseInt(JOptionPane.showInputDialog("Add another item?\n1 - Yes\n0 - No"));

        } while (option != 0);  // Repeat if user chooses to continue

        // Show total amount spent
        JOptionPane.showMessageDialog(null, "Total purchase: $" + total);
    }
}

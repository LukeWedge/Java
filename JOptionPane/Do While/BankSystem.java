import javax.swing.JOptionPane;  // Dialogs for input and output

public class BankSystem {
    public static void main(String[] args) {
        double balance = 0.0; // Initial balance
        int option;           // Menu option
        double amount;        // Amount for deposit/withdrawal

        // Repeat the menu until the user chooses to exit (option 0)
        do {
            // Show menu options
            option = Integer.parseInt(JOptionPane.showInputDialog(
                "BANK MENU\n" +
                "1 - View Balance\n" +
                "2 - Deposit\n" +
                "3 - Withdraw\n" +
                "0 - Exit\n" +
                "Choose an option:"
            ));

            // Choose operation based on user's option
            switch (option) {
                case 1:
                    // Show current balance
                    JOptionPane.showMessageDialog(null, "Current balance: $" + balance);
                    break;

                case 2:
                    // Deposit money
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount:"));
                    if (amount > 0) {
                        balance += amount; // Add to balance
                        JOptionPane.showMessageDialog(null, "Deposited: $" + amount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid amount.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount:"));
                    if (amount > 0 && amount <= balance) {
                        balance -= amount; // Subtract from balance
                        JOptionPane.showMessageDialog(null, "Withdrawn: $" + amount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid or insufficient funds.");
                    }
                    break;

                case 0:
                    // Exit
                    JOptionPane.showMessageDialog(null, "Thank you for using our bank!");
                    break;

                default:
                    // Invalid menu option
                    JOptionPane.showMessageDialog(null, "Invalid option. Try again.");
            }

        } while (option != 0); // Repeat while option is not 0 (exit)
    }
}

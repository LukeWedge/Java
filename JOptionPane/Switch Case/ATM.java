import javax.swing.JOptionPane;  // Import for GUI dialogs

public class ATM {
    public static void main(String[] args) {
        double balance = 1000.0;  // Initial balance

        // Show the menu and get the user's choice
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "ATM Menu:\n1 - Withdraw\n2 - Deposit\n3 - Check Balance"
        ));

        switch (option) {
            case 1:
                // Withdraw option
                double withdraw = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter amount to withdraw:")
                );

                if (withdraw <= balance) {
                    balance -= withdraw;  // Subtract from balance
                    JOptionPane.showMessageDialog(null, "Withdraw successful.\nNew balance: $" + balance);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient funds.");
                }
                break;

            case 2:
                // Deposit option
                double deposit = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter amount to deposit:")
                );

                balance += deposit;  // Add to balance
                JOptionPane.showMessageDialog(null, "Deposit successful.\nNew balance: $" + balance);
                break;

            case 3:
                // Check balance
                JOptionPane.showMessageDialog(null, "Current balance: $" + balance);
                break;

            default:
                // Invalid option
                JOptionPane.showMessageDialog(null, "Invalid option!");
        }
    }
}

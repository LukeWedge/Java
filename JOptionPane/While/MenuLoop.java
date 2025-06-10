package While;

import javax.swing.JOptionPane;  // Import for dialog boxes

public class MenuLoop {
    public static void main(String[] args) {
        int option = -1;  // Start with a value different from 0

        // Repeat until the user chooses 0
        while (option != 0) {
            // Show menu and read option
            option = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU:\n" +
                "1 - Say Hello\n" +
                "2 - Show Date\n" +
                "0 - Exit\n" +
                "Choose an option:"
            ));

            // Check the selected option
            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Hello!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Today is a great day!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
            }
        }
    }
}

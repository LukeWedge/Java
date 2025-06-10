import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class MenuSwitch {
    public static void main(String[] args) {
        // Show menu and read option as integer
        int option = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Choose an option:\n1 - Say Hello\n2 - Show Time\n3 - Exit"
            )
        );

        // Execute action based on the selected option
        switch (option) {
            case 1:
                // If user chooses 1
                JOptionPane.showMessageDialog(null, "Hello there!");
                break;

            case 2:
                // If user chooses 2
                JOptionPane.showMessageDialog(null, "Time: " + java.time.LocalTime.now());
                break;

            case 3:
                // If user chooses 3
                JOptionPane.showMessageDialog(null, "Exiting... Goodbye!");
                break;

            default:
                // If user enters an invalid option
                JOptionPane.showMessageDialog(null, "Invalid option!");
        }
    }
}

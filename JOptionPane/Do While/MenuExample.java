import javax.swing.JOptionPane;  // Import for dialog boxes

public class MenuExample {
    public static void main(String[] args) {
        int option;  // User's menu choice

        // Repeat the menu until option is 0
        do {
            // Show menu and get user input
            option = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n" +
                "1 - Say Hello\n" +
                "2 - Show Date\n" +
                "3 - Show a Joke\n" +
                "0 - Exit\n" +
                "Choose an option:"
            ));

            // Decide what to do based on option
            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Hello there!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, java.time.LocalDate.now().toString());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Why do Java developers wear glasses?\nBecause they don't C#!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
            }

        } while (option != 0);  // Continue until user chooses 0
    }
}

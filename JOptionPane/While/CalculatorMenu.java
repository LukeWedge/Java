package While;

import javax.swing.JOptionPane;  // Import for input/output dialogs

public class CalculatorMenu {
    public static void main(String[] args) {
        int option = -1;  // Start with any number except 0

        // Repeat until option 0 (exit)
        while (option != 0) {
            // Show menu and read user's choice
            option = Integer.parseInt(JOptionPane.showInputDialog(
                "CALCULATOR MENU\n" +
                "1 - Add\n" +
                "2 - Subtract\n" +
                "3 - Multiply\n" +
                "4 - Divide\n" +
                "0 - Exit\n" +
                "Choose an option:"
            ));

            if (option >= 1 && option <= 4) {
                // Read two numbers
                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
                double result = 0;

                // Choose operation using switch
                switch (option) {
                    case 1:
                        result = n1 + n2;  // Addition
                        break;
                    case 2:
                        result = n1 - n2;  // Subtraction
                        break;
                    case 3:
                        result = n1 * n2;  // Multiplication
                        break;
                    case 4:
                        if (n2 != 0) {
                            result = n1 / n2;  // Division
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                            continue;  // Skip to next loop
                        }
                        break;
                }

                // Show result
                JOptionPane.showMessageDialog(null, "Result: " + result);
            } else if (option != 0) {
                // If option is invalid (not 1-4 and not 0)
                JOptionPane.showMessageDialog(null, "Invalid option.");
            }
        }

        // Exit message
        JOptionPane.showMessageDialog(null, "Calculator closed.");
    }
}

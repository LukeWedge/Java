import javax.swing.JOptionPane;  // Import for dialogs

public class SimpleCalculator {
    public static void main(String[] args) {
        // Read first number
        double num1 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the first number:")
        );

        // Read second number
        double num2 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the second number:")
        );

        // Read the operation (+, -, *, /)
        String op = JOptionPane.showInputDialog("Enter the operator (+, -, *, /):");

        double result;  // To store the result
        String message; // Message to show

        // Use switch to perform the selected operation
        switch (op) {
            case "+":
                result = num1 + num2;
                message = "Result: " + result;
                break;
            case "-":
                result = num1 - num2;
                message = "Result: " + result;
                break;
            case "*":
                result = num1 * num2;
                message = "Result: " + result;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    message = "Result: " + result;
                } else {
                    message = "Error: Division by zero!";
                }
                break;
            default:
                message = "Invalid operator!";
        }

        // Show result
        JOptionPane.showMessageDialog(null, message);
    }
}

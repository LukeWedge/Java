import java.util.Scanner; // import Scanner for input

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        // ask for first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble(); // read first number

        // ask for second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble(); // read second number

        // ask for operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = input.next().charAt(0); // read operator

        double result = 0; // variable for result

        switch (operator) {
            case '+':
                result = num1 + num2; // addition
                break;
            case '-':
                result = num1 - num2; // subtraction
                break;
            case '*':
                result = num1 * num2; // multiplication
                break;
            case '/':
                if (num2 != 0) { // check for divide by zero
                    result = num1 / num2; // division
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    input.close();
                    return; // exit program
                }
                break;
            default:
                System.out.println("Invalid operator.");
                input.close();
                return;
        }

        System.out.println("Result: " + result); // show result

        input.close(); // close Scanner
    }
}

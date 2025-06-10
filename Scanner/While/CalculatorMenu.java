import java.util.Scanner; // import Scanner for input

public class CalculatorMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int option = -1; // initial option (≠ 0 to enter loop)

        while (option != 0) { // loop until user chooses to exit
            // display menu
            System.out.println("\nCALCULATOR MENU:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt(); // read option

            if (option >= 1 && option <= 4) {
                // read two numbers for the operation
                System.out.print("Enter first number: ");
                double a = input.nextDouble(); // read number 1
                System.out.print("Enter second number: ");
                double b = input.nextDouble(); // read number 2

                switch (option) {
                    case 1:
                        System.out.println("Result: " + (a + b)); // addition
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b)); // subtraction
                        break;
                    case 3:
                        System.out.println("Result: " + (a * b)); // multiplication
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Result: " + (a / b)); // division
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                        }
                        break;
                }
            } else if (option == 0) {
                System.out.println("Exiting calculator...");
            } else {
                System.out.println("Invalid option.");
            }
        }

        input.close(); // close Scanner
    }
}

import java.util.Scanner; // import Scanner for input

public class MenuLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int option = -1; // initialize with a value different from 0

        while (option != 0) { // loop until the user chooses to exit
            // display the menu
            System.out.println("\nMENU:");
            System.out.println("1 - Say Hello");
            System.out.println("2 - Show Date (simulated)");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt(); // read user input

            switch (option) { // check the chosen option
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Today is a great day!");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        input.close(); // close Scanner
    }
}

import java.util.Scanner; // import Scanner for input

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int option; // variable for menu option

        do {
            // show menu options
            System.out.println("\nMENU:");
            System.out.println("1 - Say Hello");
            System.out.println("2 - Show Date");
            System.out.println("3 - Show a Joke");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt(); // read user choice

            switch (option) {
                case 1:
                    System.out.println("Hello, user!"); // option 1
                    break;
                case 2:
                    System.out.println("Today is a beautiful day!"); // option 2 (fake date)
                    break;
                case 3:
                    System.out.println("Why don't programmers like nature? Too many bugs!"); // option 3
                    break;
                case 0:
                    System.out.println("Exiting..."); // exit
                    break;
                default:
                    System.out.println("Invalid option."); // invalid choice
            }

        } while (option != 0); // repeat until user enters 0

        input.close(); // close Scanner
    }
}

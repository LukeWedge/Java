import java.util.Scanner; // import Scanner for input

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object for input

        // show the menu
        System.out.println("MENU:");
        System.out.println("1 - Say Hello");
        System.out.println("2 - Show Date");
        System.out.println("3 - Exit");

        System.out.print("Choose an option (1-3): "); // prompt
        int option = input.nextInt(); // read user input

        switch (option) { // switch checks the value of option
            case 1: // if option is 1
                System.out.println("Hello, user!"); // action for option 1
                break; // stop here

            case 2: // if option is 2
                System.out.println("Today's date is: 2025-06-10"); // placeholder date
                break;

            case 3: // if option is 3
                System.out.println("Exiting the program..."); // action for exit
                break;

            default: // if none of the above
                System.out.println("Invalid option! Please choose 1, 2, or 3."); // warning
        }

        input.close(); // close Scanner
    }
}

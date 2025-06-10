import java.util.Scanner; // for input

public class BankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner
        double balance = 0.0; // initial balance
        int option; // menu option

        do {
            // Show menu
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1 - View Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt(); // read option

            switch (option) {
                case 1:
                    System.out.println("Current balance: $" + balance); // show balance
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble(); // read deposit
                    if (deposit > 0) balance += deposit; // add if positive
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble(); // read withdrawal
                    if (withdraw <= balance && withdraw > 0) {
                        balance -= withdraw; // subtract if valid
                    } else {
                        System.out.println("Invalid withdrawal.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting. Goodbye!"); // exit message
                    break;
                default:
                    System.out.println("Invalid option."); // handle invalid
            }

        } while (option != 0); // repeat until exit

        input.close(); // close Scanner
    }
}

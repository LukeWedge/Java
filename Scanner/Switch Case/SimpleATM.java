import java.util.Scanner; // import Scanner for input

public class SimpleATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input
        double balance = 1000.0; // initial balance

        // show menu
        System.out.println("ATM MENU:");
        System.out.println("1 - Check balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");

        System.out.print("Choose an option: "); // prompt user
        int option = input.nextInt(); // read option

        switch (option) {
            case 1: // balance
                System.out.println("Your current balance is: $" + balance);
                break;

            case 2: // deposit
                System.out.print("Enter deposit amount: ");
                double deposit = input.nextDouble(); // read deposit value
                if (deposit > 0) {
                    balance += deposit; // add to balance
                    System.out.println("Deposit successful. New balance: $" + balance);
                } else {
                    System.out.println("Invalid deposit amount!");
                }
                break;

            case 3: // withdraw
                System.out.print("Enter withdrawal amount: ");
                double withdraw = input.nextDouble(); // read withdrawal value
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw; // subtract from balance
                    System.out.println("Withdrawal successful. New balance: $" + balance);
                } else {
                    System.out.println("Invalid amount or insufficient funds!");
                }
                break;

            default:
                System.out.println("Invalid option.");
        }

        input.close(); // close Scanner
    }
}

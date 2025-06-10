import java.util.Scanner; // for input

public class ShoppingTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        double price, total = 0; // price for each item, total sum
        String option; // user response to continue or not

        do {
            System.out.print("Enter product price: ");
            price = input.nextDouble(); // read product price
            total += price; // add to total

            input.nextLine(); // consume leftover newline
            System.out.print("Add another product? (yes/no): ");
            option = input.nextLine(); // read response

        } while (!option.equalsIgnoreCase("no")); // stop if user types "no"

        System.out.println("Total purchase: $" + total); // show total

        input.close(); // close Scanner
    }
}

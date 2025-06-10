import java.util.ArrayList; // to store names
import java.util.Scanner; // to read input

public class ReadNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input
        ArrayList<String> names = new ArrayList<>(); // list to store names

        String name; // variable for each input

        do {
            System.out.print("Enter a name (or 'fim' to stop): ");
            name = input.nextLine(); // read full line

            if (!name.equalsIgnoreCase("fim")) {
                names.add(name); // store if not "fim"
            }

        } while (!name.equalsIgnoreCase("fim")); // stop if "fim" (case-insensitive)

        // show all names
        System.out.println("\nNames entered:");
        for (String n : names) {
            System.out.println(n);
        }

        input.close(); // close Scanner
    }
}

import java.util.Scanner; // import Scanner for input

public class CountPositives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int number; // variable for user input
        int count = 0; // counter for positive numbers

        do {
            System.out.print("Enter a number (negative to stop): ");
            number = input.nextInt(); // read number

            if (number >= 0) {
                count++; // count only positive numbers
            }

        } while (number >= 0); // repeat while number is not negative

        System.out.println("Total positive numbers: " + count); // show result

        input.close(); // close Scanner
    }
}

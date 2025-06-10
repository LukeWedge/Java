import java.util.Scanner; // import Scanner for input

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        System.out.print("Enter a number: ");
        int num = input.nextInt(); // read the number

        int factorial = 1; // start with 1 (identity of multiplication)

        for (int i = num; i >= 1; i--) { // loop from num down to 1
            factorial *= i; // multiply factorial by current i
        }

        System.out.println("Factorial of " + num + " is: " + factorial); // print result

        input.close(); // close Scanner
    }
}

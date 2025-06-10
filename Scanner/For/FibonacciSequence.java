import java.util.Scanner; // import Scanner for input

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        System.out.print("Enter how many Fibonacci numbers to generate: ");
        int n = input.nextInt(); // read the number of terms

        int a = 0, b = 1; // first two Fibonacci numbers

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= n; i++) { // loop n times
            System.out.print(a + " "); // print current number

            int next = a + b; // calculate next number
            a = b; // move forward: a becomes b
            b = next; // b becomes the new next
        }

        input.close(); // close Scanner
    }
}

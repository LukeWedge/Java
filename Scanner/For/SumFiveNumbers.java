import java.util.Scanner; // import Scanner for input

public class SumFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int sum = 0; // accumulator for the sum

        // loop 5 times to read 5 numbers
        for (int i = 1; i <= 5; i++) { // i goes from 1 to 5
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt(); // read the number
            sum += num; // add number to sum
        }

        System.out.println("Total sum: " + sum); // show result

        input.close(); // close Scanner
    }
}

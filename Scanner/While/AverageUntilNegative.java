import java.util.Scanner; // import Scanner for input

public class AverageUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int sum = 0; // accumulator for the sum
        int count = 0; // counter for the quantity
        int num; // input number

        System.out.print("Enter a positive number (negative to stop): ");
        num = input.nextInt(); // read first number

        while (num >= 0) { // loop while the number is positive
            sum += num; // add to total
            count++; // increment count
            System.out.print("Enter a positive number (negative to stop): ");
            num = input.nextInt(); // read next number
        }

        if (count > 0) { // only divide if at least one number was entered
            double average = (double) sum / count; // calculate average
            System.out.println("Average: " + average); // show result
        } else {
            System.out.println("No positive numbers entered."); // no valid input
        }

        input.close(); // close Scanner
    }
}

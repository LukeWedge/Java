import java.util.Scanner; // import Scanner for input

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int sum = 0; // accumulator to store the total
        int num; // variable to hold each number

        System.out.print("Enter a number (0 to stop): ");
        num = input.nextInt(); // read the first number

        while (num != 0) { // repeat while number is not 0
            sum += num; // add to the total
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextInt(); // read the next number
        }

        System.out.println("The total sum is: " + sum); // show the result

        input.close(); // close Scanner
    }
}

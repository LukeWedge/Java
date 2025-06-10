import java.util.Scanner; // import Scanner for input

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int max = Integer.MIN_VALUE; // initialize with the smallest possible number

        for (int i = 1; i <= 10; i++) { // loop to read 10 numbers
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt(); // read a number

            if (num > max) { // check if the number is greater than the current max
                max = num; // update max
            }
        }

        System.out.println("The largest number is: " + max); // print the result

        input.close(); // close Scanner
    }
}

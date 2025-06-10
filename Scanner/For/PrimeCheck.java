import java.util.Scanner; // import Scanner for input

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        System.out.print("Enter a number: ");
        int num = input.nextInt(); // read the number

        int divisorCount = 0; // count how many divisors the number has

        for (int i = 1; i <= num; i++) { // test all numbers from 1 to num
            if (num % i == 0) { // if divisible, increase count
                divisorCount++;
            }
        }

        // a prime number has exactly 2 divisors: 1 and itself
        if (divisorCount == 2) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }

        input.close(); // close Scanner
    }
}

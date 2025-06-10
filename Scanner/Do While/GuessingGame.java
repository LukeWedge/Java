import java.util.Scanner; // for input
import java.util.Random;  // to generate random number

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner
        Random rand = new Random(); // create Random

        int secret = rand.nextInt(100) + 1; // random number between 1 and 100
        int guess; // user's guess

        System.out.println("Guess the secret number (1 to 100)!");

        do {
            System.out.print("Your guess: ");
            guess = input.nextInt(); // read guess

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            }

        } while (guess != secret); // repeat until guess is correct

        System.out.println("Correct! The secret number was " + secret);

        input.close(); // close Scanner
    }
}

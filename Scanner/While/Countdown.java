import java.util.Scanner; // import Scanner for input

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        System.out.print("Enter starting number: ");
        int i = input.nextInt(); // read starting number

        while (i >= 0) { // count down until 0
            System.out.println(i); // show current number
            i--; // decrease by 1
        }

        System.out.println("Countdown finished!"); // final message

        input.close(); // close Scanner
    }
}

import java.util.Scanner; // for input

public class PasswordCheckDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        final String correctPassword = "1234"; // correct password
        String enteredPassword; // user input
        int attempts = 0; // attempt counter

        do {
            System.out.print("Enter your password: ");
            enteredPassword = input.nextLine(); // read password

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access granted!"); // correct
                break; // exit loop
            } else {
                System.out.println("Incorrect password.");
                attempts++; // count failed attempt
            }

        } while (attempts < 3); // allow up to 3 attempts

        if (!enteredPassword.equals(correctPassword)) {
            System.out.println("Access blocked. Too many attempts."); // failed all tries
        }

        input.close(); // close Scanner
    }
}

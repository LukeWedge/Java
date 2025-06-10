import java.util.Scanner; // import Scanner for input

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        String password = ""; // store the typed password

        while (!password.equals("1234")) { // repeat while password is incorrect
            System.out.print("Enter password: ");
            password = input.nextLine(); // read user input
        }

        System.out.println("Access granted!"); // correct password

        input.close(); // close Scanner
    }
}

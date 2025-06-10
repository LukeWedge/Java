import java.util.Scanner; // import Scanner for input

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        String login, password; // variables for input

        // loop until correct login AND password
        do {
            System.out.print("Enter login: ");
            login = input.nextLine(); // read login

            System.out.print("Enter password: ");
            password = input.nextLine(); // read password

            if (!login.equals("admin") || !password.equals("1234")) {
                System.out.println("Invalid login or password. Try again.");
            }

        } while (!login.equals("admin") || !password.equals("1234")); // condition to continue

        System.out.println("Access granted."); // success message

        input.close(); // close Scanner
    }
}

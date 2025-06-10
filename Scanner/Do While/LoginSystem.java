import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String correctLogin = "admin";
        final String correctPassword = "1234";

        String login, password;
        int attempts = 0;

        do {
            System.out.print("Login: ");
            login = input.nextLine().trim();

            System.out.print("Password: ");
            password = input.nextLine().trim();

            if (login.equals(correctLogin) && password.equals(correctPassword)) {
                System.out.println("Access granted!");
                break; // success — exit loop
            } else {
                attempts++; // failed try
                if (attempts < 3) {
                    System.out.println("Invalid login or password. Try again.");
                } else {
                    System.out.println("Access denied. Too many attempts.");
                }
            }

        } while (attempts < 3); // loop ends after 3 tries

        input.close();
    }
}

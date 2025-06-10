import java.util.Scanner; // for input

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner
        String option; // user response to continue

        do {
            System.out.print("Enter student name: ");
            String name = input.nextLine(); // read student name

            System.out.print("Enter first grade: ");
            double grade1 = input.nextDouble(); // read first grade

            System.out.print("Enter second grade: ");
            double grade2 = input.nextDouble(); // read second grade

            double average = (grade1 + grade2) / 2; // calculate average
            System.out.println("Average of " + name + ": " + average); // show result

            input.nextLine(); // consume leftover newline
            System.out.print("Do you want to enter another student? (yes/no): ");
            option = input.nextLine(); // read user decision

        } while (!option.equalsIgnoreCase("no")); // repeat unless user says "no"

        input.close(); // close Scanner
    }
}

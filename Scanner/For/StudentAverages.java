import java.util.Scanner; // import Scanner for input

public class StudentAverages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        String[] names = new String[5]; // array to store student names
        double[] averages = new double[5]; // array to store averages

        // input loop
        for (int i = 0; i < 5; i++) { // repeat for 5 students
            System.out.print("Enter student name " + (i + 1) + ": ");
            names[i] = input.nextLine(); // read name

            System.out.print("Enter grade 1 for " + names[i] + ": ");
            double grade1 = input.nextDouble(); // read first grade

            System.out.print("Enter grade 2 for " + names[i] + ": ");
            double grade2 = input.nextDouble(); // read second grade

            averages[i] = (grade1 + grade2) / 2; // calculate average

            input.nextLine(); // clear input buffer
        }

        // output loop
        System.out.println("\nStudent Averages:");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " - Average: " + averages[i]);
        }

        input.close(); // close Scanner
    }
}

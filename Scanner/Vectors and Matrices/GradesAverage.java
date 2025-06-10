import java.util.Scanner; // import Scanner for input

public class GradesAverage {
    public static void main(String[] args) {
        double[] grades = new double[10]; // array to store 10 grades
        Scanner input = new Scanner(System.in); // Scanner object for input

        double sum = 0; // variable to accumulate total grades

        for (int i = 0; i < 10; i++) { // loop to read 10 grades
            System.out.print("Enter grade " + (i + 1) + ": "); // prompt user
            grades[i] = input.nextDouble(); // read grade
            sum += grades[i]; // add to total
        }

        double average = sum / 10; // calculate average (sum divided by 10)

        System.out.println("Average grade: " + average); // show result

        input.close(); // close Scanner
    }
}

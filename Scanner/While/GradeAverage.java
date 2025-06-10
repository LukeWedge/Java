import java.util.Scanner; // import Scanner for input

public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        double grade; // variable to store each grade
        double sum = 0; // accumulator for total grades
        int count = 0; // counter for number of valid grades

        System.out.print("Enter a grade (0 to 10, invalid to stop): ");
        grade = input.nextDouble(); // read first grade

        while (grade >= 0 && grade <= 10) { // valid range is 0 to 10
            sum += grade; // add to total
            count++; // increment valid count
            System.out.print("Enter a grade (0 to 10, invalid to stop): ");
            grade = input.nextDouble(); // read next grade
        }

        if (count > 0) { // avoid division by zero
            double average = sum / count; // calculate average
            System.out.println("Average grade: " + average); // show result
        } else {
            System.out.println("No valid grades entered."); // if no grades
        }

        input.close(); // close Scanner
    }
}

import java.util.Scanner; // import Scanner for input

public class AverageAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        int age; // variable to hold age input
        int sum = 0; // sum of ages
        int count = 0; // number of people

        System.out.print("Enter age (-1 to stop): ");
        age = input.nextInt(); // read the first age

        while (age != -1) { // loop until user types -1
            sum += age; // add age to total
            count++; // count the person
            System.out.print("Enter age (-1 to stop): ");
            age = input.nextInt(); // read next age
        }

        if (count > 0) { // avoid division by zero
            double average = (double) sum / count; // calculate average
            System.out.println("Average age: " + average); // show result
        } else {
            System.out.println("No ages entered."); // if nothing was entered
        }

        input.close(); // close Scanner
    }
}

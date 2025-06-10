import java.util.Scanner; // import Scanner for input

public class SumVectors {
    public static void main(String[] args) {
        int[] a = new int[5]; // first vector
        int[] b = new int[5]; // second vector
        int[] sum = new int[5]; // vector to store the sum
        Scanner input = new Scanner(System.in); // Scanner object

        // read values for vector a
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value " + (i + 1) + " for vector A: ");
            a[i] = input.nextInt(); // store input in vector a
        }

        // read values for vector b
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value " + (i + 1) + " for vector B: ");
            b[i] = input.nextInt(); // store input in vector b
        }

        // calculate sum of corresponding elements
        for (int i = 0; i < 5; i++) {
            sum[i] = a[i] + b[i]; // sum elements from a and b
        }

        // display the resulting sum vector
        System.out.println("Sum vector:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Position " + i + ": " + sum[i]); // show each value
        }

        input.close(); // close Scanner
    }
}

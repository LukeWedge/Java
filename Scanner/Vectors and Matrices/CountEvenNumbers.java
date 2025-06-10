import java.util.Scanner; // import Scanner for user input

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4]; // create a 4x4 matrix
        Scanner input = new Scanner(System.in); // Scanner for input
        int evenCount = 0; // counter for even numbers

        // fill the matrix
        for (int i = 0; i < 4; i++) { // loop through rows
            for (int j = 0; j < 4; j++) { // loop through columns
                System.out.print("Enter value for [" + i + "][" + j + "]: "); // ask user
                matrix[i][j] = input.nextInt(); // store value

                if (matrix[i][j] % 2 == 0) evenCount++; // check if even and count
            }
        }

        System.out.println("Total even numbers: " + evenCount); // show result

        input.close(); // close Scanner
    }
}

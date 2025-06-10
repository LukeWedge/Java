import java.util.Scanner; // import Scanner for input

public class CountGreaterThan10 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; // create a 3x3 integer matrix
        Scanner input = new Scanner(System.in); // Scanner for user input
        int count = 0; // counter for values greater than 10

        // fill the matrix
        for (int i = 0; i < 3; i++) { // loop through rows
            for (int j = 0; j < 3; j++) { // loop through columns
                System.out.print("Enter value for [" + i + "][" + j + "]: "); // prompt
                matrix[i][j] = input.nextInt(); // read value
                if (matrix[i][j] > 10) count++; // increment if value > 10
            }
        }

        System.out.println("Number of elements greater than 10: " + count); // show result

        input.close(); // close Scanner
    }
}

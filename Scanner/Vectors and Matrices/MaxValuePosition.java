import java.util.Scanner; // import Scanner for input

public class MaxValuePosition {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5]; // create a 5x5 matrix
        Scanner input = new Scanner(System.in); // Scanner for user input

        int max = Integer.MIN_VALUE; // store the largest value, start with the smallest possible
        int maxRow = 0, maxCol = 0; // to store the position of the largest value

        // fill the matrix and find the max value
        for (int i = 0; i < 5; i++) { // loop rows
            for (int j = 0; j < 5; j++) { // loop columns
                System.out.print("Enter value for [" + i + "][" + j + "]: "); // ask input
                matrix[i][j] = input.nextInt(); // store input

                if (matrix[i][j] > max) { // check if current value is greater than current max
                    max = matrix[i][j]; // update max value
                    maxRow = i; // update row index
                    maxCol = j; // update column index
                }
            }
        }

        // display the result
        System.out.println("Maximum value is: " + max);
        System.out.println("Position: Row " + maxRow + ", Column " + maxCol);

        input.close(); // close Scanner
    }
}

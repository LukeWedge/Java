import java.util.Scanner; // import Scanner for user input

public class MatrixInput { // class name
    public static void main(String[] args) { // main method
        int[][] matrix = new int[2][2]; // declare 2x2 matrix of integers
        Scanner input = new Scanner(System.in); // create Scanner object

        // fill the matrix with user input
        for (int i = 0; i < 2; i++) { // loop through rows
            for (int j = 0; j < 2; j++) { // loop through columns
                System.out.print("Enter value for position [" + i + "][" + j + "]: "); // prompt
                matrix[i][j] = input.nextInt(); // read and store the value
            }
        }

        System.out.println("Matrix:"); // message before displaying matrix

        // display the matrix in 2x2 format
        for (int i = 0; i < 2; i++) { // loop through rows again
            for (int j = 0; j < 2; j++) { // loop through columns again
                System.out.print(matrix[i][j] + "\t"); // print value with tab for formatting
            }
            System.out.println(); // new line after each row
        }

        input.close(); // close Scanner to free resources
    }
}

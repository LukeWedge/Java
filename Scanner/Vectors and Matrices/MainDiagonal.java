import java.util.Scanner; // import Scanner for input

public class MainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; // declare 3x3 matrix
        Scanner input = new Scanner(System.in); // create Scanner object

        // fill the matrix with user input
        for (int i = 0; i < 3; i++) { // loop through rows
            for (int j = 0; j < 3; j++) { // loop through columns
                System.out.print("Enter value for [" + i + "][" + j + "]: "); // prompt
                matrix[i][j] = input.nextInt(); // store value
            }
        }

        System.out.println("Main diagonal:"); // message before output

        for (int i = 0; i < 3; i++) { // loop through diagonal elements
            System.out.println(matrix[i][i]); // print elements where row == column
        }

        input.close(); // close Scanner
    }
}

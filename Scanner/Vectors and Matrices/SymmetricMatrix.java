import java.util.Scanner; // import Scanner for input

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; // create 3x3 matrix
        Scanner input = new Scanner(System.in); // Scanner for input
        boolean isSymmetric = true; // assume it's symmetric unless proven otherwise

        // fill the matrix
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                System.out.print("Enter value for [" + i + "][" + j + "]: "); // prompt
                matrix[i][j] = input.nextInt(); // store input
            }
        }

        // check symmetry by comparing matrix[i][j] and matrix[j][i]
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                if (matrix[i][j] != matrix[j][i]) { // if not equal, it's not symmetric
                    isSymmetric = false; // set flag to false
                    break; // break inner loop
                }
            }
            if (!isSymmetric) break; // break outer loop if already false
        }

        // show result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is NOT symmetric.");
        }

        input.close(); // close Scanner
    }
}

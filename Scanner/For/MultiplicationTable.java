import java.util.Scanner; // import Scanner for input

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        System.out.print("Enter a number: ");
        int num = input.nextInt(); // read the number for the table

        // loop to multiply from 1 to 10
        for (int i = 1; i <= 10; i++) { // i goes from 1 to 10
            int result = num * i; // calculate multiplication
            System.out.println(num + " x " + i + " = " + result); // print line
        }

        input.close(); // close Scanner
    }
}

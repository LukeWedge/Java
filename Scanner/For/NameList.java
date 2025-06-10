import java.util.Scanner; // import Scanner for input

public class NameList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner

        String[] names = new String[10]; // array to store 10 names

        // input loop
        for (int i = 0; i < 10; i++) { // i from 0 to 9 (10 items)
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine(); // store name in array
        }

        // output loop
        System.out.println("\nNames entered:");
        for (int i = 0; i < 10; i++) { // print each name on a new line
            System.out.println(names[i]);
        }

        input.close(); // close Scanner
    }
}

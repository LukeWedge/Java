import java.util.Scanner; // import Scanner class to read user input

public class VectorInput { // class name
    public static void main(String[] args) { // main method: program starts here
        int[] numbers = new int[5]; // create an integer array with 5 positions
        Scanner input = new Scanner(System.in); // create Scanner object to read input

        for (int i = 0; i < 5; i++) { // loop 5 times (i from 0 to 4)
            System.out.print("Enter number " + (i + 1) + ": "); // ask user for input
            numbers[i] = input.nextInt(); // store input into array at position i
        }

        System.out.println("You entered:"); // display message before showing numbers
        for (int i = 0; i < 5; i++) { // loop through the array again
            System.out.println(numbers[i]); // print each number
        }

        input.close(); // close Scanner to free system resources
    }
}

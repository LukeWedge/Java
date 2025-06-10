public class EvenVector { // class name
    public static void main(String[] args) { // main method
        int[] evens = new int[10]; // create an array with 10 positions

        int number = 2; // start from the first even number

        for (int i = 0; i < 10; i++) { // loop 10 times (for 10 elements)
            evens[i] = number; // store the current even number in array
            number += 2; // move to the next even number
        }

        System.out.println("Even numbers from 2 to 20:"); // message before output

        for (int i = 0; i < 10; i++) { // loop through array
            System.out.print(evens[i] + " "); // print each value with a space
        }
    }
}

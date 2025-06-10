public class CountEvens {
    public static void main(String[] args) {
        int count = 0; // counter for even numbers

        for (int i = 1; i <= 50; i++) { // loop from 1 to 50
            if (i % 2 == 0) { // if number is divisible by 2, it's even
                count++; // increase the count
            }
        }

        System.out.println("Total even numbers between 1 and 50: " + count); // show result
    }
}

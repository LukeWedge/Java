import java.util.Scanner; // import Scanner for input

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        System.out.print("Enter a letter: "); // prompt
        char letter = input.next().toLowerCase().charAt(0); // read and convert to lowercase

        switch (letter) { // check the letter
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel."); // vowels
                break;
            default:
                if (Character.isLetter(letter)) // check if it's a valid alphabet letter
                    System.out.println("It's a consonant.");
                else
                    System.out.println("Not a letter!"); // for symbols or numbers
        }

        input.close(); // close Scanner
    }
}

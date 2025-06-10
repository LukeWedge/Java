import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Read one letter from the user
        String input = JOptionPane.showInputDialog("Enter a single letter:");
        
        // Convert to lowercase and get the first character
        char letter = input.toLowerCase().charAt(0);

        String message;

        // Check if the character is a letter
        if (Character.isLetter(letter)) {
            // Use switch to check if it's a vowel
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    message = "It's a vowel.";
                    break;
                default:
                    message = "It's a consonant.";
            }
        } else {
            message = "Invalid input! Please enter a letter.";
        }

        // Show result
        JOptionPane.showMessageDialog(null, message);
    }
}

import javax.swing.JOptionPane;  // Import for dialogs

public class GuessGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int secret = (int)(Math.random() * 100) + 1;

        int guess;  // User's guess

        // Repeat until the guess is correct
        do {
            // Ask user to guess the number
            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number (1 to 100):"));

            // Check the guess
            if (guess < secret) {
                JOptionPane.showMessageDialog(null, "Too low!");
            } else if (guess > secret) {
                JOptionPane.showMessageDialog(null, "Too high!");
            } else {
                JOptionPane.showMessageDialog(null, "Correct! The number was " + secret);
            }

        } while (guess != secret);  // Keep asking until guessed right
    }
}

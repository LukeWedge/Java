import javax.swing.JOptionPane;  // Import for dialogs

public class ReadAndShowNames {
    public static void main(String[] args) {
        String[] names = new String[10];  // Array to store 10 names

        // Loop to read 10 names
        for (int i = 0; i < 10; i++) {
            names[i] = JOptionPane.showInputDialog("Enter name " + (i + 1) + ":");
        }

        // Build output string with one name per line
        String output = "Names entered:\n";
        for (int i = 0; i < 10; i++) {
            output += names[i] + "\n";
        }

        // Show all names in a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}

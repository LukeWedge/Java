import javax.swing.JOptionPane;  // Import for dialog boxes

public class NameList {
    public static void main(String[] args) {
        String name;          // To store each name
        String allNames = ""; // To store all names
       
        // Repeat at least once
        do {
            // Ask the user to enter a name
            name = JOptionPane.showInputDialog("Enter a name (type 'fim' to stop):");

            // If the name is not "fim", add it to the list
            if (!name.equalsIgnoreCase("fim")) {
                allNames += name + "\n";  // Add name with newline
            }

        } while (!name.equalsIgnoreCase("fim"));  // Stop when "fim" is typed

        // Show all entered names
        JOptionPane.showMessageDialog(null, "Names entered:\n" + allNames);
    }
}

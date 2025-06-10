import javax.swing.JOptionPane;  // Import for dialogs

public class StudentAverages {
    public static void main(String[] args) {
        String[] names = new String[5];     // Array to store student names
        double[] averages = new double[5];  // Array to store average grades

        // Loop to read names and grades
        for (int i = 0; i < 5; i++) {
            names[i] = JOptionPane.showInputDialog("Enter name of student " + (i + 1) + ":");

            // Read first grade
            String g1 = JOptionPane.showInputDialog("Enter first grade for " + names[i] + ":");
            double grade1 = Double.parseDouble(g1);

            // Read second grade
            String g2 = JOptionPane.showInputDialog("Enter second grade for " + names[i] + ":");
            double grade2 = Double.parseDouble(g2);

            // Calculate average
            averages[i] = (grade1 + grade2) / 2;
        }

        // Build output string
        String result = "Student Averages:\n";
        for (int i = 0; i < 5; i++) {
            result += names[i] + ": " + averages[i] + "\n";
        }

        // Show all averages
        JOptionPane.showMessageDialog(null, result);
    }
}

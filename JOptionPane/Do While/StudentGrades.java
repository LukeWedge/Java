import javax.swing.JOptionPane;  // Import for dialog boxes

public class StudentGrades {
    public static void main(String[] args) {
        String name;       // To store student's name
        double grade1;     // First grade
        double grade2;     // Second grade
        double average;    // Average of two grades
        int option;        // User choice to continue

        // Repeat until user chooses to stop
        do {
            // Read student name
            name = JOptionPane.showInputDialog("Enter student name:");

            // Read two grades
            grade1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first grade:"));
            grade2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second grade:"));

            // Calculate average
            average = (grade1 + grade2) / 2;

            // Show the result
            JOptionPane.showMessageDialog(null, "Student: " + name + "\nAverage: " + average);

            // Ask if user wants to continue (1 = yes, 0 = no)
            option = Integer.parseInt(JOptionPane.showInputDialog("Do you want to enter another student?\n1 - Yes\n0 - No"));

        } while (option != 0);  // Repeat if option is not 0
    }
}

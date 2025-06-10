package While;

import javax.swing.JOptionPane;  // Import for dialog boxes

public class AverageGrades {
    public static void main(String[] args) {
        double sum = 0;     // To accumulate valid grades
        int count = 0;      // To count valid grades

        // Read the first grade
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter a grade (0-10). Invalid to stop:"));

        // Loop while the grade is valid
        while (grade >= 0 && grade <= 10) {
            sum += grade;    // Add to total
            count++;         // Count this grade

            // Read the next grade
            grade = Double.parseDouble(JOptionPane.showInputDialog("Enter another grade (0-10). Invalid to stop:"));
        }

        // If at least one grade was entered
        if (count > 0) {
            double average = sum / count;  // Calculate the average
            JOptionPane.showMessageDialog(null, "Average grade: " + average);
        } else {
            JOptionPane.showMessageDialog(null, "No valid grades entered.");
        }
    }
}

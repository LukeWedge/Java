import javax.swing.JOptionPane;  // Import JOptionPane for input/output

public class GradesAverage {
    public static void main(String[] args) {
        double[] grades = new double[10];  // Create a vector to store 10 grades
        double sum = 0;  // Variable to store the sum of all grades

        // Loop to read 10 grades from the user
        for (int i = 0; i < grades.length; i++) {
            // Ask for grade and convert to double
            grades[i] = Double.parseDouble(
                JOptionPane.showInputDialog("Enter grade " + (i + 1) + ":")
            );
            sum += grades[i];  // Add the grade to the total sum
        }

        double average = sum / grades.length;  // Calculate the average

        // Show the average grade
        JOptionPane.showMessageDialog(null, "Average grade: " + average);  // Display the result
    }
}

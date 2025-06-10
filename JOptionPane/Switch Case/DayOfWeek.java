import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class DayOfWeek {
    public static void main(String[] args) {
        // Ask user to enter a number between 1 and 7
        int day = Integer.parseInt(
            JOptionPane.showInputDialog("Enter a number (1 to 7):")
        );

        String message;  // Message to show the day

        // Map number to day using switch
        switch (day) {
            case 1:
                message = "Sunday";
                break;
            case 2:
                message = "Monday";
                break;
            case 3:
                message = "Tuesday";
                break;
            case 4:
                message = "Wednesday";
                break;
            case 5:
                message = "Thursday";
                break;
            case 6:
                message = "Friday";
                break;
            case 7:
                message = "Saturday";
                break;
            default:
                message = "Invalid number! Please enter 1 to 7.";
        }

        // Show result to user
        JOptionPane.showMessageDialog(null, message);
    }
}

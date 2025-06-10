import javax.swing.JOptionPane;  // Import JOptionPane for dialogs

public class MonthName {
    public static void main(String[] args) {
        // Ask user to enter a number between 1 and 12
        int month = Integer.parseInt(
            JOptionPane.showInputDialog("Enter a month number (1 to 12):")
        );

        String message;  // Message to store the month name

        // Map number to month name using switch
        switch (month) {
            case 1:  message = "January";   break;
            case 2:  message = "February";  break;
            case 3:  message = "March";     break;
            case 4:  message = "April";     break;
            case 5:  message = "May";       break;
            case 6:  message = "June";      break;
            case 7:  message = "July";      break;
            case 8:  message = "August";    break;
            case 9:  message = "September"; break;
            case 10: message = "October";   break;
            case 11: message = "November";  break;
            case 12: message = "December";  break;
            default: message = "Invalid month! Enter a number from 1 to 12.";
        }

        // Show the result to the user
        JOptionPane.showMessageDialog(null, message);
    }
}

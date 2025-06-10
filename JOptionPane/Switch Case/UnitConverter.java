import javax.swing.JOptionPane;  // Import for dialogs

public class UnitConverter {
    public static void main(String[] args) {
        // Show menu and read option
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "Choose a conversion:\n" +
            "1 - Kilometers to Meters\n" +
            "2 - Meters to Centimeters\n" +
            "3 - Centimeters to Millimeters\n" +
            "4 - Meters to Kilometers"
        ));

        // Ask for the value to convert
        double value = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the value to convert:")
        );

        double result;
        String message;

        // Use switch to perform the correct conversion
        switch (option) {
            case 1:
                result = value * 1000;  // Km to m
                message = value + " km = " + result + " meters";
                break;
            case 2:
                result = value * 100;   // m to cm
                message = value + " m = " + result + " centimeters";
                break;
            case 3:
                result = value * 10;    // cm to mm
                message = value + " cm = " + result + " millimeters";
                break;
            case 4:
                result = value / 1000;  // m to km
                message = value + " m = " + result + " kilometers";
                break;
            default:
                message = "Invalid option!";
        }

        // Show result
        JOptionPane.showMessageDialog(null, message);
    }
}

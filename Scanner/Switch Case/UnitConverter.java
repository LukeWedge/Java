import java.util.Scanner; // import Scanner for input

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        // show the conversion menu
        System.out.println("CONVERSION MENU:");
        System.out.println("1 - Kilometers to Meters");
        System.out.println("2 - Meters to Centimeters");
        System.out.println("3 - Centimeters to Millimeters");

        System.out.print("Choose an option (1-3): ");
        int option = input.nextInt(); // read menu option

        System.out.print("Enter the value to convert: ");
        double value = input.nextDouble(); // read the input value

        double result = 0; // result of conversion

        switch (option) {
            case 1:
                result = value * 1000; // km to m
                System.out.println(value + " km = " + result + " m");
                break;
            case 2:
                result = value * 100; // m to cm
                System.out.println(value + " m = " + result + " cm");
                break;
            case 3:
                result = value * 10; // cm to mm
                System.out.println(value + " cm = " + result + " mm");
                break;
            default:
                System.out.println("Invalid option.");
        }

        input.close(); // close Scanner
    }
}

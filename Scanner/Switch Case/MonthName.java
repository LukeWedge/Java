import java.util.Scanner; // import Scanner for input

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a month number (1-12): "); // prompt
        int month = input.nextInt(); // read user input

        switch (month) { // check month number
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number! Please enter 1 to 12."); // validation
        }

        input.close(); // close Scanner
    }
}

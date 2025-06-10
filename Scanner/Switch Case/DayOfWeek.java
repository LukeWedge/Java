import java.util.Scanner; // import Scanner for input

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        System.out.print("Enter a number (1 to 7): "); // prompt
        int day = input.nextInt(); // read user input

        switch (day) { // use switch to match the day number
            case 1:
                System.out.println("Sunday"); // 1 → Sunday
                break;
            case 2:
                System.out.println("Monday"); // 2 → Monday
                break;
            case 3:
                System.out.println("Tuesday"); // 3 → Tuesday
                break;
            case 4:
                System.out.println("Wednesday"); // 4 → Wednesday
                break;
            case 5:
                System.out.println("Thursday"); // 5 → Thursday
                break;
            case 6:
                System.out.println("Friday"); // 6 → Friday
                break;
            case 7:
                System.out.println("Saturday"); // 7 → Saturday
                break;
            default:
                System.out.println("Invalid number! Please enter 1 to 7."); // input not valid
        }

        input.close(); // close Scanner
    }
}

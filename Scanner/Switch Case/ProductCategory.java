import java.util.Scanner; // import Scanner for input

public class ProductCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        System.out.print("Enter the product name: "); // prompt
        String product = input.nextLine().toLowerCase(); // read product name, lowercase for matching

        switch (product) {
            case "apple":
            case "banana":
            case "orange":
                System.out.println("Category: Fruit"); // group of fruits
                break;

            case "carrot":
            case "lettuce":
            case "broccoli":
                System.out.println("Category: Vegetable"); // group of vegetables
                break;

            case "milk":
            case "cheese":
            case "yogurt":
                System.out.println("Category: Dairy"); // group of dairy products
                break;

            default:
                System.out.println("Unknown category."); // not found
        }

        input.close(); // close Scanner
    }
}

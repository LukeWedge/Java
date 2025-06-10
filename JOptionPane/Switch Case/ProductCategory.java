import javax.swing.JOptionPane;  // Import for dialog boxes

public class ProductCategory {
    public static void main(String[] args) {
        // Read the product name from the user
        String product = JOptionPane.showInputDialog("Enter the product name:");

        String category;  // Store the category result

        // Use switch to match product name (in lowercase)
        switch (product.toLowerCase()) {
            case "apple":
            case "banana":
            case "orange":
                category = "Fruit";
                break;

            case "carrot":
            case "lettuce":
            case "broccoli":
                category = "Vegetable";
                break;

            case "milk":
            case "cheese":
            case "yogurt":
                category = "Dairy";
                break;

            default:
                category = "Unknown category";
        }

        // Show the result
        JOptionPane.showMessageDialog(null, "Category: " + category);
    }
}

import java.util.Scanner; // Import Scanner for input

public class ClientSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] clients = new String[5]; // Array to store up to 5 clients
        int count = 0; // Number of registered clients

        int option;
        do {
            // Show menu options
            System.out.println("\nClient Menu:");
            System.out.println("1 - Add client");
            System.out.println("2 - List clients");
            System.out.println("3 - Edit client");
            System.out.println("4 - Delete client");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt();
            input.nextLine(); // Consume newline

            switch (option) {
                case 1: // Add client
                    if (count < clients.length) {
                        System.out.print("Enter client name: ");
                        clients[count] = input.nextLine();
                        count++;
                        System.out.println("Client added.");
                    } else {
                        System.out.println("Client list is full!");
                    }
                    break;

                case 2: // List clients
                    System.out.println("Client list:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + " - " + clients[i]);
                    }
                    break;

                case 3: // Edit client
                    System.out.print("Enter client index to edit: ");
                    int edit = input.nextInt();
                    input.nextLine(); // Consume newline
                    if (edit >= 0 && edit < count) {
                        System.out.print("Enter new name: ");
                        clients[edit] = input.nextLine();
                        System.out.println("Client updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4: // Delete client
                    System.out.print("Enter client index to delete: ");
                    int del = input.nextInt();
                    if (del >= 0 && del < count) {
                        // Shift elements to remove the client
                        for (int i = del; i < count - 1; i++) {
                            clients[i] = clients[i + 1];
                        }
                        clients[count - 1] = null;
                        count--;
                        System.out.println("Client removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);

        input.close(); // Close Scanner
    }
}

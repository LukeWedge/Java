import java.util.Scanner; // import Scanner for input

public class ClientSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        String[] clients = new String[5]; // array to store up to 5 client names
        int count = 0; // current number of clients

        int option;

        do {
            // menu
            System.out.println("\nCLIENT MENU");
            System.out.println("1 - Add client");
            System.out.println("2 - List clients");
            System.out.println("3 - Edit client");
            System.out.println("4 - Delete client");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt(); // read option
            input.nextLine(); // consume leftover newline

            switch (option) {
                case 1: // add
                    if (count < clients.length) {
                        System.out.print("Enter client name: ");
                        clients[count] = input.nextLine(); // store name
                        count++;
                        System.out.println("Client added.");
                    } else {
                        System.out.println("Client list is full.");
                    }
                    break;

                case 2: // list
                    System.out.println("Client List:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + " - " + clients[i]);
                    }
                    break;

                case 3: // edit
                    System.out.print("Enter client number to edit (1-" + count + "): ");
                    int editIndex = input.nextInt() - 1;
                    input.nextLine(); // consume newline
                    if (editIndex >= 0 && editIndex < count) {
                        System.out.print("Enter new name: ");
                        clients[editIndex] = input.nextLine(); // replace name
                        System.out.println("Client updated.");
                    } else {
                        System.out.println("Invalid client number.");
                    }
                    break;

                case 4: // delete
                    System.out.print("Enter client number to delete (1-" + count + "): ");
                    int deleteIndex = input.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < count) {
                        // shift elements left
                        for (int i = deleteIndex; i < count - 1; i++) {
                            clients[i] = clients[i + 1];
                        }
                        count--;
                        System.out.println("Client deleted.");
                    } else {
                        System.out.println("Invalid client number.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0); // loop until exit

        input.close(); // close Scanner
    }
}

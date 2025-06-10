import java.util.Scanner; // import Scanner for input

public class VotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for input

        // Candidates
        String[] candidates = { "Alice", "Bob", "Charlie" }; // 3 candidates
        int[] votes = new int[3]; // votes[i] stores votes for candidates[i]

        int option;

        do {
            // voting menu
            System.out.println("\nVOTE FOR YOUR CANDIDATE:");
            System.out.println("1 - " + candidates[0]);
            System.out.println("2 - " + candidates[1]);
            System.out.println("3 - " + candidates[2]);
            System.out.println("0 - End voting and show results");

            System.out.print("Your vote: ");
            option = input.nextInt(); // read vote

            switch (option) {
                case 1:
                case 2:
                case 3:
                    votes[option - 1]++; // increment vote count
                    System.out.println("Vote registered for " + candidates[option - 1]);
                    break;
                case 0:
                    System.out.println("Voting ended.");
                    break;
                default:
                    System.out.println("Invalid vote.");
            }

        } while (option != 0); // repeat until voting ends

        // Show results
        System.out.println("\nRESULTS:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + ": " + votes[i] + " votes");
        }

        // Find winner
        int maxVotes = votes[0];
        int winnerIndex = 0;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winnerIndex = i;
            }
        }

        System.out.println("Winner: " + candidates[winnerIndex]);

        input.close(); // close Scanner
    }
}

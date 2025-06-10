import javax.swing.JOptionPane;  // Import for dialog boxes

public class VotingSystemGUI {
    public static void main(String[] args) {
        int[] votes = new int[4];  // Index 0: C1, 1: C2, 2: C3, 3: null/blank
        int option;

        do {
            // Show voting menu
            String input = JOptionPane.showInputDialog(
                "Vote for a candidate:\n" +
                "1 - Candidate 1\n" +
                "2 - Candidate 2\n" +
                "3 - Candidate 3\n" +
                "4 - Null/Blank Vote\n" +
                "0 - End Voting and Show Results"
            );

            option = Integer.parseInt(input);  // Convert input to integer

            // Use switch to count votes
            switch (option) {
                case 1:
                    votes[0]++;
                    break;
                case 2:
                    votes[1]++;
                    break;
                case 3:
                    votes[2]++;
                    break;
                case 4:
                    votes[3]++;
                    break;
                case 0:
                    // Show results when user ends voting
                    String result = "Voting Results:\n" +
                                    "Candidate 1: " + votes[0] + " votes\n" +
                                    "Candidate 2: " + votes[1] + " votes\n" +
                                    "Candidate 3: " + votes[2] + " votes\n" +
                                    "Null/Blank:  " + votes[3] + " votes";
                    JOptionPane.showMessageDialog(null, result);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option!");
            }
        } while (option != 0);  // Repeat until user enters 0
    }
}

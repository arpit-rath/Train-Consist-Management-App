import java.util.Scanner;

public class TrainAppUC18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIDs = {"B101", "B205", "B309", "B412", "B550"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {

            // Compare using equals()
            if (bogieIDs[i].equals(key)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // Early termination
            }
        }

        // Result if not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        sc.close();

        // Program continues...
    }
}
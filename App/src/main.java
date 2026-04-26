import java.util.Arrays;
import java.util.Scanner;

public class TrainAppUC19 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
        String[] bogieIDs = {"B101", "B205", "B309", "B412", "B550"};

        // (Safety step) Ensure sorted order
        Arrays.sort(bogieIDs);

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIDs[mid]);

            if (comparison == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            }
            else if (comparison > 0) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        sc.close();

        // Program continues...
    }
}
import java.util.HashSet;

public class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101"); // Duplicate (will be ignored)

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}
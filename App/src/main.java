import java.util.ArrayList;
import java.util.List;

public class TrainAppUC20 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Train bogie list (empty scenario)
        List<String> bogies = new ArrayList<>();

        try {
            // Attempt search
            searchBogie(bogies, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }

    // Search method with defensive check
    public static void searchBogie(List<String> bogies, String key) {

        // Fail-fast validation
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        // Linear search logic (example)
        for (String b : bogies) {
            if (b.equals(key)) {
                System.out.println("Bogie found: " + key);
                return;
            }
        }

        System.out.println("Bogie not found.");
    }
}
import java.util.Arrays;

public class TrainAppUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Before sorting
        System.out.println("Before Sorting: " + Arrays.toString(bogieTypes));

        // Sort using built-in method
        Arrays.sort(bogieTypes);

        // After sorting
        System.out.println("After Sorting: " + Arrays.toString(bogieTypes));

        // Program continues...
    }
}
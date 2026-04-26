import java.util.*;
import java.util.function.Predicate;

// Goods Bogie class
class GoodsBogie {
    String type;   // e.g., Cylindrical, Box
    String cargo;  // e.g., Petroleum, Coal

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " → " + cargo;
    }
}

public class TrainAppUC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Functional rule: Cylindrical → only Petroleum allowed
        Predicate<GoodsBogie> safetyRule = b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum");

        // Validate all bogies
        boolean isSafe = bogies.stream().allMatch(safetyRule);

        // Display result
        System.out.println("Bogie Details:");
        bogies.forEach(System.out::println);

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Program continues...
    }
}
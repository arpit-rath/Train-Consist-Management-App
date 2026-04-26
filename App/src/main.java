// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo with validation
    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for bogie (" + shape + ")");
        }
    }
}

public class TrainAppUC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe assignment (will be caught)
        b2.assignCargo("Petroleum");

        System.out.println("\nProgram continues safely...");
    }
}
public class TrainAppUC16 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of passenger bogie capacities
        int[] capacities = {72, 60, 24, 80, 50};

        System.out.print("Before Sorting: ");
        printArray(capacities);

        // Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            // Optimization: track if swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) break;
        }

        System.out.print("After Sorting: ");
        printArray(capacities);

        // Program continues...
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
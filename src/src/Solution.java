import java.util.HashSet;
import java.util.Set;

class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // Duplicate
        bogieIds.add("B102"); // Duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        System.out.println("Program continues...");
    }
}
import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        System.out.println("\nAdding bogie IDs...");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG102"); // Duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        System.out.println("\nTotal unique bogies: " + bogieIDs.size());

        System.out.println("\nProgram continues...");
    }
}
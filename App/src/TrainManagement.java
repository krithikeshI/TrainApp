import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie → capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding bogie capacities (key-value pairs)
        System.out.println("\nAdding bogie capacity details...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Iterating and displaying details
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}
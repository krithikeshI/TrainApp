import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for ordered & unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        System.out.println("\nAttaching bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate bogie (Sleeper)...");
        trainFormation.add("Sleeper"); // ignored automatically

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        System.out.println("\nProgram continues...");
    }
}
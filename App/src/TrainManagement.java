import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies (CREATE operation)
        System.out.println("\nAdding passenger bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies (READ operation)
        System.out.println("Current Passenger Bogies: " + passengerBogies);

        // Remove a bogie (DELETE operation)
        System.out.println("\nRemoving AC Chair bogie...");
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After Removal: " + passengerBogies);

        // Check existence (SEARCH operation)
        System.out.println("\nChecking if Sleeper bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogies: " + passengerBogies);

        System.out.println("\nProgram continues...");
    }
}
import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies (order matters)
        System.out.println("\nAdding bogies to train...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry Car at position 2 (index 1)
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(1, "Pantry Car");

        System.out.println("After Insertion: " + trainConsist);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("Final Train Consist: " + trainConsist);

        System.out.println("\nProgram continues...");
    }
}
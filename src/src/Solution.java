import java.util.LinkedList;
class TrainAppUC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies (initial setup)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After removing first and last bogie: " + train);

        // Final state
        System.out.println("Final Train Consist: " + train);

        System.out.println("Program continues...");
    }
}
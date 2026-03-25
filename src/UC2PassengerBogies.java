import java.util.ArrayList;

public class UC2PassengerBogies {
    public static void main(String[] args) {
        System.out.println("=== UC2: Add Passenger Bogies ===");

        ArrayList<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After insertion: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removal: " + passengerBogies);

        System.out.println("Sleeper exists: " + passengerBogies.contains("Sleeper"));
        System.out.println("Final list state: " + passengerBogies);
    }
}

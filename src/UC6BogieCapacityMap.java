import java.util.HashMap;
import java.util.Map;

public class UC6BogieCapacityMap {
    public static void main(String[] args) {
        System.out.println("=== UC6: Map Bogie to Capacity ===");

        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}

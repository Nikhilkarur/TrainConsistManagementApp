import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UC9GroupBogiesByType {

    static class Bogie {
        private final String type;
        private final int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return type + " -> Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC9: Group Bogies by Type ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 68));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("AC Chair", 80));
        bogies.add(new Bogie("First Class", 24));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + ":");
            for (Bogie bogie : bogieList) {
                System.out.println("  " + bogie);
            }
        });
    }
}

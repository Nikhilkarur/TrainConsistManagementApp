import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC8FilterPassengerBogiesUsingStreams {

    static class Bogie {
        private final String name;
        private final int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " -> Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC8: Filter Passenger Bogies Using Streams ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7SortBogiesByCapacity {

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
        System.out.println("=== UC7: Sort Bogies by Capacity (Comparator) ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Sorted Bogies (Ascending by Capacity):");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }
    }
}

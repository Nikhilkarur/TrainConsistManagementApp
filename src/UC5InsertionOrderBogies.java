import java.util.LinkedHashSet;
import java.util.Set;

public class UC5InsertionOrderBogies {
    public static void main(String[] args) {
        System.out.println("=== UC5: Preserve Insertion Order of Bogies ===");

        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("Final formation order: " + formation);
    }
}

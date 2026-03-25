import java.util.HashSet;
import java.util.Set;

public class UC3UniqueBogieIds {
    public static void main(String[] args) {
        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG-101");
        bogieIds.add("BG-102");
        bogieIds.add("BG-103");
        bogieIds.add("BG-102");

        System.out.println("Unique bogie IDs: " + bogieIds);
    }
}

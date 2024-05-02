import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Kashi", 100);
        map.put("Kapil", 101);
        map.put("Anish", 102);
        
        System.out.println(map);
        
        // Trying to get values for non-existent keys
        System.out.println(map.get("Samir")); // This will print null
        System.out.println(map.containsKey("sob raj")); // This will print null
        
        // Checking if the key "102" exists in the map
        System.out.println(map.containsKey("102")); // This will print false
        
        // Printing all entries in the map
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

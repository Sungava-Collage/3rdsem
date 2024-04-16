package unit9;
import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> s =new TreeSet<>();
        s.add("Anish");
        s.add("Bindu");
        s.add("Hari");
        s.add("Binayak");
        s.add("Soba Raj");
        s.add("Binayak");
        System.out.println(s);
        s.remove("Soba Raj");
        System.out.println(s);
        System.out.println("\n Iterating over List");
        Iterator<String> its = s.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
            
        }
    }
}

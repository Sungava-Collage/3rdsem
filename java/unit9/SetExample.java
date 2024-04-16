package unit9;
import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Kashi");
        s.add("Anish");
        s.add("Kapil");
        s.add("Kapil");
        s.add("Ram");
        s.add("Ram");
        System.out.println(s);

    }
}

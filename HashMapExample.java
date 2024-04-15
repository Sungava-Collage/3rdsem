import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
    HashMap<Integer, String > map = new HashMap<Integer,String>();
    map.put(1,"Kashi");
    map.put(2,"Sanvi");
    map.put(3,"Sonu");
    map.put(4,"Laxmi");
    System.out.println("itering Hashmap...");
    for(Map.Entry i: map.entrySet())
    {
        System.out.println(i.getKey()+" "+i.getValue());
    }

    }
}

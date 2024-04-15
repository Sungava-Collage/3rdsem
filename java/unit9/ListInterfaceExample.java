package unit9;
import java.util.*;

public class ListInterfaceExample {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<Integer>();
        ll.add(0, 5);
        ll.add(1, 7);
        System.out.println(ll);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(6);
        l2.add(9);
        l2.add(15);
        ll.addAll(l2);
        System.out.println(ll);

        ll.remove(1);
        System.out.println(ll);
        
        ll.set(0, 15);
        System.out.println(ll);
    }
}

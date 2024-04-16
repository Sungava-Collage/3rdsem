package unit9;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<String>();
        s.add("D");
        s.add("C");
        s.addLast("G");
        s.addFirst("A");
        s.add("E");
        System.out.println(s);
        s.add(1,"B");
        System.out.println(s);
        boolean status=s.contains("G");
        if (status) {
            System.out.println("List contains Element 'G'");
        }
        else
        {
            System.out.println("List Does not contains Element 'G'");
            s.remove(1);
            System.out.println(s);
            s.remove("D");
            System.out.println(s);
            s.remove();
            System.out.println(s);
            s.removeFirst();
            System.out.println(s);
            s.removeLast();
            System.out.println(s);
        }



    }
}

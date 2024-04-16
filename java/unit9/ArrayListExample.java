package unit9;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("Kahis");
        s.add("Kahis");
        s.add("Anish");
        s.add("Sadish");
        s.add("Sob Raj");
        s.add("Hari");
        ListIterator litr=s.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
            
        }
    }
}

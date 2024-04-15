package unit9;
    import java.util.*;
public class ListIteratiorExample {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Mahima");
        name.add("Nilita");
        name.add("kashi");
        ListIterator litr = name.listIterator();
        System.out.println("Traversimg list in forward direction");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Traversimg list in bavkward direction");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}

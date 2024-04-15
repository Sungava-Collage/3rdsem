package unit9;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
    List<String>name=new ArrayList<String>();
    name.add("C");
    name.add("C++");
    name.add("Java");
    name.add("Python");
    name.add("PHP");
    name.add("Ruby");
    name.add("C#");
    List<String>range = new ArrayList<String>();
    range=name.subList(2,5);
    System.out.println(range);
    }
}

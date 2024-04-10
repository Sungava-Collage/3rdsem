package unit9;

public class AutoboxingExample {
    public static void main(String[] args) {
        // converting int into Integer
        int a=20;
        Integer i = Integer.valueOf(a); 
        Integer j = a;
        System.out.println(a+" "+i+" "+j);
    }
}

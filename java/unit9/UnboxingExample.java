package unit9;

public class UnboxingExample {
    public static void main(String[] args) {
        // Converting Integer to int
        Integer a = new Integer(3);
        int i = a.intValue();
        int j = a; // unboxing

        System.out.println(a + " " + i + " " + j);

    }
}

package unit9;

public class EqualsExample {
    public static void main(String[] args) {
        Short s = new Short("15");
        Short x= 10;
        Integer y= 15;
        Short z = 15;
        System.out.println(s.equals(x));
        System.out.println(s.equals(y));
        System.out.println(s.equals(z));
    }
}

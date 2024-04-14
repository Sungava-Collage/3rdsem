public class ValueOfExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating valueOf(int i) methord");
        Integer i = Integer.valueOf(50);
        Double d = Double.valueOf(9.36);
        System.out.println("i = " + i);
        System.out.println("d = "+d);
        System.out.println("Demonstrating valueOf(String i) methord");
        Integer n = Integer.valueOf("333");
        Integer m = Integer.valueOf("-255");
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("demonstrting (String s, int red x) methord");
        Integer x = Integer.valueOf("333", 8);
        Integer y = Integer.valueOf("-255", 16);
        Long l = Long.valueOf("51688245",16);
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        System.out.println("l = "+l);


    }
}

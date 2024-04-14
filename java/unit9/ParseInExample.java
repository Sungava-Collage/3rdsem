package unit9;
/**
 * ParseInExample
 */
public class ParseInExample {

    public static void main(String[] args)
    {
        // Prasing differnt satring 
        int z = Integer.parseInt("15",8);
        int a = Integer.parseInt("A",16);
        long l = Long.parseLong("2158611234",10);
        System.out.println(z);
        System.out.println(a);
        System.out.println(l);
    }
}
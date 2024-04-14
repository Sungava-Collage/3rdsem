package unit9;
import java.util.Random;

/**
 * RandomNumberGeneration
 */
public class RandomNumberGeneration {

    public static void main(String[] args) {
        Random x = new Random();

        
        System.out.println(x.nextInt(10));
        System.out.println(x.nextBoolean());
        System.out.println(x.nextDouble());
        System.out.println(x.nextFloat());
    }
}
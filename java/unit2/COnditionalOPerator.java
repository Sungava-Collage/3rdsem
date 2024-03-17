package unit2;
import java.util.Scanner;
public class COnditionalOPerator {
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a,b,large;
        System.out.print("Enter two numbers: ");
        a=sc.nextInt ();
        b=sc.nextInt ();
        large=a>b?a:b;
        System.out.println("largest value :" +large);
    }
    
}

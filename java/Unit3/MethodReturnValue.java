import java.util.Scanner;
/**
 * MethodReturnValue
 */
public class MethodReturnValue {

    int sum(int a,int b)
    {
        return (a+b);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        MethodReturnValue obj=new MethodReturnValue();
        System.out.println("Enter two number:");
        x=sc.nextInt();
        y=sc.nextInt();
System.out.println("Sum= "+obj.sum(x,y));
    }
}
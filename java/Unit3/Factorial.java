import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    Recursive obj=new Recursive();
    sc.close();
    System.out.println("Factorial of "+n+"="+obj.fact(n));
}
}
class Recursive{
    int fact(int n)
    {
        if (n==0)
        return 1;
        else
        return(n*fact(n-1));
    }
}

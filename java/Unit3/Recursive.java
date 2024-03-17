import java.util.Scanner;
 class Fibonacci {
    int fibo(int n)
    {
        if(n<=1)
        return n;
        else
        return(fibo(n-1)+fibo(n-2));
    }
}
public class Recursive {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacci obj=new Fibonacci();
        int nterm,i;
        System.out.println("No of terms:");
        nterm=sc.nextInt();
        for(i=0;i<nterm;i++)
        {
            System.out.print(obj.fibo(i)+"\t");
        }
        System.out.println();
    }
}
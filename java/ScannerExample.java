
import java.util.Scanner;
public class ScannerExample
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("Gender :");
        char Gender=sc.next().charAt(0);
        System.out.println(" Age: ");
        int age=sc.nextInt();
        System.out.println("mobile no: ");
        long mobile=sc.nextLong();
        System.out.println("GPA: ");
        double gpa=sc.nextDouble();
        System.out.println("Name :"+name);
        System.out.println("Gender :"+Gender);
        System.out.println("Age :"+age);
        System.out.println("GPA: "+gpa);

        
        
    }
}
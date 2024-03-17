package Unit4;
import java.util.Scanner;
class A{
    int roll;
    String name,address;
    Scanner sc=new Scanner(System.in);
}
class B class A{
    void get(){
        System.out.println( "Enter Roll Number ,Name,Address : ");
        roll=sc.nextInt();
        name = sc.next();
        address = sc.next();

    }
}
class C class B
{
    void display() {
        System.out.println("\nRollno: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
public class Multilevellnheritence {
    public static void main(String[] args) {
        c obj = new c();
        obj.get();
        obj.display();
    }
    
}

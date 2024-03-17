package Unit4;

import java.util.Scanner;

class A {
    int rollno;
    String name, address;
    Scanner sc = new Scanner(System.in);

    void get() {
        System.out.println("Enter Rollno, Name, Address: ");
        rollno = sc.nextInt();
        name = sc.next();
        address = sc.next();
    }
}

class B extends A {
    void display() {
        System.out.println("\nRollno: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.get();
        obj.display();
    }
}

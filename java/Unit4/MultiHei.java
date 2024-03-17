import java.util.Scanner;

class A {
    int roll;
    String name;
    String address;
    Scanner in = new Scanner(System.in);
}

class  E extends A {
    void getRoll() {
        System.out.println("Enter a rollno:  ");
        roll = in.nextInt();
    }

    void displayRoll() {
        System.out.println("ROLLNO: " + roll);
    }
}

class C extends A {
    void getName() {
        System.out.println("Enter a name :  ");
        name = in.next();
    }

    void displayName() {
        System.out.println("NAME: " + name);
    }
}

class D extends A {
    void getAddress() {
        System.out.println("Enter an Address:  ");
        address = in.next();
    }

    void displayAddress() {
        System.out.println("Address : " + address);
    }
}

public class MultiHei {
    public static void main(String[] args) {
        E obj2 = new E();
        C obj1 = new C();
        D obj3 = new D();
        obj2.getRoll();
        obj2.displayRoll();
        obj1.getName();
        obj1.displayName();
        obj3.getAddress();
        obj3.displayAddress();
    }
}
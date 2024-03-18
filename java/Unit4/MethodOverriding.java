class A2 {
    void display() {
        System.out.println("method in A2");
    }
}

class B2 extends A2 {
    void display() {
        System.out.println("Method in B2");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A2 obj1 = new A2();
        A2 obj2 = new B2();
        obj1.display();
        obj2.display();
    }
}

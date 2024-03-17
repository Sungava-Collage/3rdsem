class Base{
    void display()
    {
        System.out.println("Display Function in class A");

    }
}
public class  Derived extends Base
{
    System.out.println("Display Function in class D");
}
void show() {
    super.display();
    display();
}
public static void main(String[] args) {
    
}
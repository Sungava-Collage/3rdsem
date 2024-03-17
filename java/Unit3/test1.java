public class test1 {
 int a;
 int b;
 test1(int a, int b)       
 {
    this.a=a;
    this.b=b;
 }
 void display()
 {
    System.out.println("a = "+ a +" b = "+b);
 }
 public static void main(String args[])
 {
    test1 obj = new test1(10,20);
    obj.display();
 }
}

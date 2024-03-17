class parent
{
    int num=5;

}
public class Child extends parent {
int num=10;
void  display() 
{
    System.out.println("Value of num = "+super.num);
    System.out.println("Value of num = "+num);
}
public static void main(String[] args) {
    Child obj = new Child();
    obj.display();
}
    
}
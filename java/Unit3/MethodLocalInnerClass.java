
public class MethodLocalInnerClass {
    void show()
    {
        int x=5;
        class Inner{
            void display()
            {
                System.out.println("Value of x= "+x);
            }
            
        }
        Inner ob=new Inner();
        ob.display();
    }
    public static void main(String args[])
    {
        MethodLocalInnerClass obj =new MethodLocalInnerClass();
        obj.show();
    }
}

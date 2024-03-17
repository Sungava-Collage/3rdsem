public class Test4 {
    int a;
    int b;
    // Defaule Constructor
    Test4()
    {
        a=10;
        b=20;
    }
    void dislay(Test4 obj)
    {
        System.out.println("a= "+obj.a+" b= "+obj.b);
    }
    //Methord that returns current class instance
    void get()
    {
        dislay(this);
    }
    public static void main(String[] args) {
        Test4 object=new Test4();
            object.get();
    }
}

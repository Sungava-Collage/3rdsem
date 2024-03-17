public class test3 {
    int a;
    int b;
    test3()
    {
        a=10;
        b=20;
    }
    test3 get()
    { 
        return this;
    }
    void display()
    {
        System.out.println("a = "+ a +" b = "+b);
    }
    public static void main(String[] args)
    {
        test3 object = new test3();
        object.get().display();
    }
}

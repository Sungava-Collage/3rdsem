public class PassingReferenceToMethod {
    int a=5,b=10;
    void add(PassingReferenceToMethod ob)
    {
        ob.a=ob.a+3;
        ob.b=ob.b+3;
    }
    public static void main(String args[])
    {
        PassingReferenceToMethod obj=new PassingReferenceToMethod();
        System.out.println("Before function call a= "+obj.a+" b=" +obj.b);
        obj.add(obj);
        System.out.println("After function call a= "+obj.a+" b=" +obj.b);
    }
}

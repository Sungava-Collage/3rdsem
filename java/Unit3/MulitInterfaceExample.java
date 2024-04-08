interface A
{
    void circle();

}
interface B
{
    void rectangle();

}
class CC implements A,B
{
    public void circle()
    {
        System.out.println("Draw circle");

    }
    public void  rectangle()
    {
        System.out.println("Draw Rectangle");

    }
    public static void main(String[] args) {
        CC obj=new CC();
        obj.circle();
        obj.rectangle();
    }
}
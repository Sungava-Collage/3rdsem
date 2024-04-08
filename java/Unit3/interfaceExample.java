interface Bank
{
    int getRetOfInterest();
}
class NBL implements Bank{
    public int getRetOfInterest()
    {
        return 7;
    }
}
class EBL implements Bank
{
    public int getRetOfInterest()
    {
        return 8;
        
    }
}
class Abstraction
{
    public static void main(String[] args) {
        Bank obj1 = new NBL();
        System.out.println("Interest rate of Nepal Bank Limited is: " +obj1.getRetOfInterest());
        Bank obj2 = new EBL();
        System.out.println("Interest rate of Everest Bank Limited is: "+obj2.getRetOfInterest());
    }
}
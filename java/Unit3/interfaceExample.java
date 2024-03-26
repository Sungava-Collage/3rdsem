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
    
}
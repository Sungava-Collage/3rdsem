import java.util.Scanner;
 class MyDistance
{
   
    public static void main(String[] args) 
    {
        int choice;
        Distance d1= new Distance(5,6);
        Distance d2=new Distance(3,2);
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Press 1 for sum and 2 for Difference:");
        choice=sc.nextInt();
        if (choice==1) 
        {
            d1.addDistance(d2);
            System.out.println("After Addition: ");            
            d1.diplay();
        }
        if (choice==2) 
        {
            d1.subDistance(d2);
            System.out.println("After Subtrction: ");            
            d1.diplay();

    }
}
}
public class Distance 
{
    private int feet;
    private int inches;
    public Distance(int feet,int inches)
    {
        this.feet=feet;
        this.inches=inches;
    }
    public void addDistance(Distance d)
    {
        this.feet+=d.feet;
        this.inches+=d.inches;
        if (this.inches>=12) 
        {
            this.inches%=12;
        }
    }
    public void subDistance(Distance d)
    {
        int totalinches1=this.feet*12+this.inches;
        int totalinches2=d.feet*12+d.inches;
        int result = Math.abs(totalinches1-totalinches2);
        this.feet=result/12;
    }
    public void diplay()
    {
        System.out.println("Distance: " +feet+"feet "+inches+" inches");
    }
}

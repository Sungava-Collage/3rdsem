

import java.util.Scanner;
public class Area {
    
    Area(int r)
    {
     System.out.println("Area of circle: "+3.14*r*r);
    }
    Area(int length, int breadth)
    {
       
        System.out.println("Area of rectangle: "+length*breadth);

    }
    public static void main(String args[]) {
        int l,b,rad;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breath of rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
        Area obj=new Area(l, b);
        System.out.println("Enter redius of circle: ");
        rad=sc.nextInt();
        Area obj2=new Area(rad);
    }
    
}
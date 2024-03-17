/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author BCA user-30
 */
import java.util.Scanner;
public class Area {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,A;
        System.out.println("Enter length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        A=l*b;
        System.out.println("Area of rectangle= "+A);
    }
    
}

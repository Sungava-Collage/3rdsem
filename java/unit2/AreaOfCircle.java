/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author BCA user-30
 */ import java.util.Scanner;
public class AreaOfCircle {
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float A;
        System.out.println("Enter radius");
        r=sc.nextInt();
        A=(float)3.14*r*r;
        System.out.println("Area of circle= "+A);
    }
    
}
    

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
public class BitwiseOperater {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a&b  = "+(a&b));
        System.out.println("a|b  = "+(a|b));
        System.out.println("a<<2 = "+(a<<2));
        System.out.println("b>>1 = "+(b>>1));
    }
}

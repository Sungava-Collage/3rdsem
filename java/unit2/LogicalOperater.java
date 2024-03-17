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
public class LogicalOperater {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three number: ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                System.out.println("a>b&a>c is "+(a>b&&a>c));
                System.out.println("a>b||a>c is "+(a>b||a>c));
                System.out.println("!(a>b) is "+!(a>b));
                sc.close();
    }
}

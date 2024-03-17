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
public class RelationalOperator {
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
                int a,b;
                System.out.println("Enter two number");
                a=sc.nextInt();
                b=sc.nextInt();
                if(a>b)
                    System.out.println(a+" is greater then "+b);
                else if(a<b)
                    System.out.println(b+" is greater then "+a);
                else
                    System.out.println(a+" both number are the same "+b);
    }
}

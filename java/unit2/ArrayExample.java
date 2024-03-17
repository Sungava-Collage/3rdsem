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
public class ArrayExample {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Size of an array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter array element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("\nDisplaying array element");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

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
public class MultiDimensionalArrayExample {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter order of matrix");
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println("Enter matrix element");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nDisplaying element of matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

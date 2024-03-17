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
public class JaggedArray {
    public static void main(String args[])
    {
        int array[][]=new int[3][];
        array[0]=new int[]{1,2,3};
        array[1]=new int[]{4,5};
        array[2]=new int[]{6,7,8,9,10};
        System.out.println("\n Displaying element of matrix");
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
            System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
            
    
}

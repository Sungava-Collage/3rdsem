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
public class ImplictConvarrsion {
   public static void main (String args[])
   {
       byte b=5;
       short s=b;
       int i=s;
       long l=i;
       System.out.println("byte value b= "+b);
       System.out.println("short value b= "+s);
       System.out.println("int value b= "+i);
       System.out.println("long value b= "+l);
   }
}

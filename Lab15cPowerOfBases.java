//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/7/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 15c PowerOfBases
//
//***************************************************//
  // Insert a scanner
import java.util.Scanner;

public class Lab15cPowerOfBases
{
   public static void main(String[] args)
   {
     
     // Declare your integers
      int base; 
      int power; 
      int total = 1 ;
      int power2 = 0;
      int base2 = 1;
   
      Scanner input = new Scanner ( System.in );
   
     // Ask for a base number 
      System.out.print ( " Enter in a base number from 2-12: ");
      base = input.nextInt();
   
     // Ask for a power number
      System.out.print( " Enter a power number from 2-10: ");
      power = input.nextInt();
   
     // Create your nested for loops 
      for ( int i = 1; i > 0; i-- ) { 
         i = base;
         for ( int j = 1; j >= power2; ) { 
            j = power;
            System.out.print(base2 + "^" + power2 + "=" + total + "\t  ");
            power2++;
            total = total * base2;
         }
         base = base - 1; 
         base2 = base2 + 1;
         power2 = 0;
         total = 1; 
         System.out.println();
      }
   } 
}
//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/7/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 15b PowerOfBases
//
//***************************************************//
 // Insert Scanner
import java.util.Scanner;
public class Lab15bPowersOfBases
{
   public static void main(String[] args)
   {
     // Declare your integers
      int base; 
      int power; 
      int total;
      int power2 = 1;
   
      Scanner input = new Scanner ( System.in );
   
      // Ask for a base number  
      System.out.println ( " Enter in a base number from 2-12: ");
      base = input.nextInt();
      
      // Set total equal to base
      total = base;
      
      // Ask for a power number
      System.out.println ( " Enter a power number from 2-10: ");
      power = input.nextInt();
      
      // Print the base number to the 0 power
      System.out.println ( base + "^0 = 1" );
      for ( power2 = 1; power >= power2; power2++ ) {
         
         // Print the rest of your answers
         System.out.println (base + "^" + power2 + " = " + total);
         
         
         total = total * base;
      }
   }
}
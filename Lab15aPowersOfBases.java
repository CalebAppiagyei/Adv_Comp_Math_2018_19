//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/7/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 15a PowerOfBases
//
//***************************************************//
  // Insert Scanner
import java.util.Scanner;
public class Lab15aPowersOfBases
{
   public static void main(String[] args)
   {
     // Declare your integers
      int base; 
      int power; 
      int total ;
   
      Scanner input = new Scanner ( System.in );
   
        // Ask for a base number
      System.out.println ( " Enter in a base number from 2-12: ");
      base = input.nextInt();
      total = base;
      
      //  Ask for a power number from 2 - 10
      System.out.println ( " Enter a power number from 2-10: ");
      power = input.nextInt();
      //  Create your for loop
      for (int counterbase = 1; counterbase < power;  counterbase++ ) {
          total = total * base;
               
      }
        // Print your result
      System.out.print (base + "^" + power + " = " + total);
   
   }
}
//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:11/20/18
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 10c Factors
//
//***************************************************//
  // Import your scanner
import java.util.Scanner;

public class Lab10cFactors
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner ( System.in );
      
        // Declare your Integers
      int number;
      int factors = 1; 
      int factors2 = 0;
      
        // Ask for an Integer and print its factors
      System.out.print (" Give me an integer number larger than 1: ");
      number = input.nextInt();
      
      System.out.print ("\nThe factors of " + number + " are the following {");
       
        // Insert while loop
      while ( factors < number ) {
      
           // Insert if statement
         if ( number % factors ==0 ) {
            System.out.print ( factors + ", " );
            factors2++;
         
         }
      
         factors++;
      
      }
      
      System.out.print ( number + "}");
        // Insert a second if statement
      if ( factors2 == 1 ){
         System.out.print ("\n\n" + number + " is a prime number.");
      }
        // Insert an else if
      else if ( factors2 > 1)  {
         System.out.print ("\n\n" + number + " is a composite number.");
      }
   }
}
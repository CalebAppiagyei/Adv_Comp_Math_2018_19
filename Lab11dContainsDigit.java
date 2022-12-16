//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:12/12/18
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 11d ContainsDigit
//
//***************************************************//
  // Import your scanner
import java.util.Scanner;

public class Lab11dContainsDigit
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner ( System.in );
      
        // Declare your integers
      int num;
      int digit;
      int amount = 0;
      int divisor = 1;
      int remainder;
      
        // Ask the user for a number
      System.out.print ( " Please type in a number : " );
      num = input.nextInt();
        // Ask the user for a digit
      System.out.print ( " Please type in a digit (0-9) : ");
      digit = input.nextInt();
      
      System.out.print ( " The number " + num );
        // Insert if Statements
      if ( num > 0 ) {
         while ( num > 0 ){
            remainder = num % 10;
            num /=10;
            divisor *= 10;
            if ( remainder == digit )  
               amount++; 
         }
         if ( amount > 0 ) {
            System.out.print (  " contains " + amount );
            System.out.print ( " digits that are " + digit);
         }
         if ( amount == 0 ) 
            System.out.print ( " does NOT contain the digit " + digit );
         
      }   
        // Insert else if statement 
      else if ( num < 0 ) {
         num = num * -1;
         while ( num > 0 ){
            
            remainder = num % 10;
            num /=10;
            divisor *= 10;
            if ( remainder == digit )  
               amount++;     
         } 
         if ( amount > 0 ) {
            System.out.print ( " contains " + amount + " digits that are " + digit);
         }
         if ( amount == 0 ) 
            System.out.print ( " does NOT contain the digit " + digit );
         
      
      }
   }
}

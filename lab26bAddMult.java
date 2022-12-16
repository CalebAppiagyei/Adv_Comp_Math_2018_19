//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 26b AddMult
//
//***************************************************//

// This program will use two methods 
// One method will take to numbers and give you the sum
// The other method will take those same numbers and give you the product

  // Create your Scanner class
import java.util.Scanner;

public class lab26bAddMult
{
   public static void main(String[] args)
   {
        // Name your Scanner
      Scanner input = new Scanner ( System.in );
      
        // Create your integers
      int num1, num2;
      
        // Ask the user for 2 numbers
      System.out.print( " Please enter a number: " );
      num1 = input.nextInt();
      System.out.print ( " Please enter another number " );
      num2 = input.nextInt();
        // Call your methods
      sum( num1, num2 );
      product(num1, num2);
   }
     // Create your methods
   public static void sum ( int num1, int num2 ){
      int total = num1 + num2;
      System.out.print ( " The sum of " + num1 + " and " + num2 + " is " + total ); 
   }
   public static void product ( int num1, int num2 ) {
      int product = num1 * num2;
      System.out.print ( " \n The sum of " + num1 + " and " + num2 + " is " + product);
   }
}
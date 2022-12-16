//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:2/22/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 22a RandomArray
//
//***************************************************//

// This program generates a certain amount of random numbers and determines:
// What numbers are in the Even & Odd indices
// What numbers are Even and Odd
// how many numbers are divisible by a certain number chosen by the user

  // Insert your Scanner 
import java.util.Scanner;
  // Insert your Random 
import java.util.Random;

public class Lab22aRandomArray
{
   public static void main(String[] args)
   {
     // Name your Scanner
      Scanner input = new Scanner ( System.in );
      
     // Name your Random
      Random generator = new Random();
      
        // Create your variables
      final int MANY; 
      int low, high, diff, remainder;
      
        // Ask the user how many numbers they want generated & ask for the highest and lowest value that can be generated
      System.out.print ( " How many numbers do your want me to generate? " );
      MANY = input.nextInt();
      System.out.print ( " What is the lowest value (inclusive) from which I can generate number? ");
      low = input.nextInt();
      System.out.print ( " What is the highest value (inclusive) from which I can generate number? ");
      high = input.nextInt();
      diff = high - low;
        // Create your Array
      int[] nums = new int[MANY];
        // Generate your numbers
      for( int i = 0; i < MANY; i++ ){
         nums[i] = generator.nextInt(diff + 1)+low;
      }
        // Print the generated numbers
      System.out.print ( " \n The random array generated is: \n" );
      for ( int i = 0; i < MANY; i++ ) { 
         System.out.print ( " " + nums[i] + " " );  
      }   
        // Print the generated numbers in the EVEN indices
      System.out.print ( " \n\n The random array generated EVEN indices are: \n" );
      for ( int i = 0; i < MANY; i++ ) { 
         System.out.print ( " " + nums[i] + " " );
         i++;
      }
        // Print the generated numbers in the ODD indices
      System.out.print ( " \n\n The random array generated ODD indices are: \n" );
      for ( int i = 1; i < MANY; i++ ) { 
         System.out.print ( " " + nums[i] + " " );
         i++;
      }
        // Print the random numbers that are ODD
      System.out.print ( " \n\n The random array generated has EVEN values at the indices: \n" );
      for ( int i = 0; i < MANY; i++ ) {
         remainder = nums[i] % 2;
         if ( remainder == 0 ) {
            System.out.print ( " " + i + " " );
         }
      }
        // Print the random numbers that are ODD
      System.out.print ( " \n\n The random array generated has ODD values at the indices: \n" );
      for ( int i = 0; i < MANY; i++ ) {
         remainder = nums[i] % 2;
         if ( remainder != 0 ) {
            System.out.print ( " " + i + " " );
         }
      }
        // Create a divisor and counter variable to be used in the final for loop
      int divisor;
      int counter = 0;
        // Ask the user for a divisor
      System.out.print ( " \n\n Give me a divisor from 2-9: ");
      divisor = input.nextInt();
        // Check which numbers are divisible by that number
      for ( int i = 0; i < MANY; i++ ) {
         remainder = nums[i] % divisor;
         if ( remainder == 0 ) {
            counter++;
         }
      }
        // Print how many variables can be divisible by the users divisor
      System.out.print ( " \n\n There are " + counter + " values in the array that are divisible by " + divisor + ".");
   }
}  

//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:2/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 21c ReverseArray
//
//***************************************************//

// This program asks for the user to enter values they want stored in an array and prints them in reverse order
//(they swap places) 

  // Insert your Scanner 
import java.util.Scanner;
  
public class Lab21cReverseArray 
{
   public static void main (String[] args) 
   {
        // Name your scanner
      Scanner input = new Scanner ( System.in );
        // Create your Integers
      int temp;
      final int INTEGER;
      int save;
        // Ask for an integer between 1-20
      System.out.print ( " Enter an integer from 1-20: " );
      INTEGER = input.nextInt();
        // Create your array
      int[] values = new int [INTEGER];
        // Ask the user to enter the integers they would like stored in the array
      System.out.print ( " Enter " + INTEGER + " values to store in the array. " );
      for ( int i = 0; i < INTEGER; i++ ) {
         values[i] = input.nextInt();
      }
        // Print those Integers
      for ( int i = 0; i < INTEGER; i++ ) {
         System.out.print ( values[i] + " " );
      }
        // Set the value of your temporary variable to the last stored number
      temp = INTEGER - 1;
      System.out.print ( "\n" );
        // Create your for loop to make the numbers stored in the array swap places
      for ( int i = 0; i < INTEGER/2; i++ ){
         save = values[i];
         values[i] = values[temp];
         values[temp] = save;
         temp--;
      }
        // Print the numbers in their swapped places
      for ( int i = 0; i < INTEGER; i++ ) {
         System.out.print ( values [i] + " " );
      }
   }
}
 


  

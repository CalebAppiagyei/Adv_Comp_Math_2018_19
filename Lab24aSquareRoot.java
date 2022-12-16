 //********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/26/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 24a Square Root
//
//***************************************************//

// This program will give estimates of the square root of a number
// It will also give you the actual square root

  // Create your Scanner Class
import java.util.Scanner;

public class Lab24aSquareRoot 
{
   public static void main(String[] args)
   {
     // Name your Scanner class 
      Scanner input = new Scanner( System.in ); 
      
        // Create your variables
      double want, think, estimate, root = 0, x;
      int counter = 1, counter2 = 0;
        // Create your arrays
      double[] approx = new double[20];
        // Ask the user for a squared number
      System.out.print ( " What number do you want to take the square root of ? " );
      want = input.nextDouble();
        // Ask the user what they think the root of the squared number is
      System.out.print ( " \n What do you think is the square root of " + want + " ? ");
      think = input.nextDouble();
      
      x = think;
        // Create a for loop that will use your square root equation
      for ( int i = 0; i < 20; i++) {
         if ( root != Math.sqrt( want ) ){
            root = ((think * think) + want);
            root = root / (2 * think);
            approx[i] = root;
            x = root;
            think = x;
            counter2++;
         }
      }
        // Print the square root of your squared number and how many times it took to get to that number
      System.out.println ( " \n The square root of " + want + " is " + root + "." ); 
      System.out.println ( " \n It took the loop " + counter2 + " times to determine the square root. " );
      System.out.println ();
        // Print each square root estimate
      for ( int i = 0; i < 20; i++ ) {
         if ( approx[i] != 0 ) {
            System.out.println ( " Approximation " + (i + 1) + " :: " + approx[i]);
         }
      }
   }
}
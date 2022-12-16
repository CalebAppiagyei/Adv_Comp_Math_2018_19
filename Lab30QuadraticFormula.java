//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:4/3/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 30 Quadratic Formula
//
//***************************************************//

// This program will use the Quadratic Formula
// It will use a method to return the Discriminant, the 1st root, the 2nd root
// and determine and print the x and y value of the vertex and return.
// It will also determine whether the vertex is minimum or maximum.  

  // Create your Scanner class
import java.util.Scanner;  

public class Lab30QuadraticFormula
{
   public static void main(String[] args) 
   {
        // Name your Scanner
      Scanner input = new Scanner ( System.in );
   
        // Create your variables
      double a, b, c, y;
   
        // Tell the user the form of the Quadratic Formula being used
      System.out.println ( " Given a quadratic equatuion in the form of :: y = a*x^2 + b*x + c " );
   
       // Ask the user for the a, b, and c values
      System.out.print ( " \n What is the value of the coefficient \"a\" ? " );
      a = input.nextDouble();
      System.out.print ( " What is the value of the coefficient \"b\" ? " );
      b = input.nextDouble();
      System.out.print ( " What is the value of the coefficient \"c\" ? " );
      c = input.nextDouble();
      double d = dis(a, b, c);      
      
        // Create conditionals based on the sum of the discriminant
      if ( d < 0 ) {
         System.out.println ( " The roots (zeros) of the quadratic function y = " + a + "*x^2 + " + b + "*x + " + c );
         System.out.println ( " are real but not imaginary. ");
      }
      else if ( d == 0 ) {
         System.out.println ( " The quadratic function y = " + a + "*x^2 + " + b + "*x + " + c ); 
         System.out.println ( " has only one root, it is :: x = " + posroot(a, b, c, d));
      }
      else {
         System.out.println ( " The quadratic function y = " + a + "*x^2 + " + b + "*x + " + c ); 
         System.out.println ( " has two roots, they are ");
         System.out.println ( " x = " + posroot(a, b, c, d));
         System.out.println ( " x = " + negroot(a, b, c, d));
         System.out.println();
      }
        // Print the vertex and whether it is a minimum or maximum and the vertex
      System.out.print(minormax(a, b, c, d));
        
      
   }
     // Find and return the discriminant
   public static double dis( double a, double b, double c ) {
      double x;
      x = ( b * b ) - ( 4 * a * c );
      return x; 
   }
     // Find and return the positive root
   public static double posroot ( double a, double b, double c, double d ){
      double x;
      double w = 2 * a;
      x = (( b * -1 ) + Math.sqrt( d )) / w;
      return x;
   }
     // Find and return the negative root 
   public static double negroot ( double a, double b, double c, double d ){
      double x;
      double w = 2 * a;
      x = (( b * -1 ) - Math.sqrt( d )) / w;
      return x;
   }
     // Determine the vertex and whether the vertex is a maximum or minimum
   public static String minormax( double a, double b, double c, double d ) {
      double x = -b / (2 * a);
      double y = a*(x*x) + b*x + c;
      System.out.print ( " The vertex is :: (" + x + " , " + y + ")");
      String z = "minormax";
      System.out.print(" \n The vertex is of the quadratic is a ");
      if ( a < 0 ) {
         z = "maximum";
         return z;
      }
      if ( a > 0 ) {
         z = "minimuum";
         return z;
      }
      return z;
   } 
}
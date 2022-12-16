//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date: 4/9/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 32 FractionPart2(Operating) 
//
//***************************************************//

// This class file will contain methods that reduce a fraction by its GCF,
// Multiply a fraction by a single integer, change the fraction by division,
// change the fraction to a String, and put the negative symbol on the numerator
  
  // Create your Scanner class 
import java.util.Scanner;

public class Lab32Fraction
{
   public static void main(String[] args)
   {
       // Name your Scanner class
      Scanner input = new Scanner( System.in );
     
        // Create your variables
      int x,y,divide = 0, multiply = 0,x2 = 0,y2 = 0;
      
        // Create a name for your fractions object
      Fraction fract, fract2;
      
        // Ask the user for the fraction they want to use 
      System.out.print ( " Please enter a numerator for your fraction " );
      x = input.nextInt();
      System.out.print ( " Please enter a denominator for your fraction ");
      y = input.nextInt(); 
      
        // Ask the user for what they would like their fraction to be multiplied by
      if ( y != 0 ) {  
         System.out.print ( " Please enter a number you would like to multiply your fraction by: ");   
         multiply = input.nextInt();
        // Ask the user for a divisor for their fraction
         System.out.print ( " Please enter a number you would like to divide your fraction by: " );
         divide = input.nextInt();
         // Ask the user for a fraction they would like to multiply their original fraction by
         System.out.print ( " Please enter a SECOND numerator " );
         x2 = input.nextInt();
         System.out.print ( " Please enter a SECOND denominator ");
         y2 = input.nextInt(); 
      }
        // Give a value for the fractions object
      fract = new Fraction(x, y);
      fract2 = new Fraction(x2,y2);
        // Print your methods
      if ( y != 0 ) {
         System.out.print ( " \n Your original fraction is");
         System.out.print (fract);  
         System.out.println ( " \n Your reduced fraction is" + fract.reduce());
         System.out.print ( " Your adjusted fraction is" + fract.negativeFraction());
         System.out.println ( " \n Your multiplied fraction is" + fract.multiply(multiply));
         System.out.println ( " Your divided fraction is" + fract.divide(divide));
         System.out.println ( " \n Your fraction when multiplied by " + fract2 + " is " + fract2.multiply(fract));
         System.out.println ( " Your fraction when divided by " + fract2 + " is " + fract2.divide(fract));
         System.out.println ( " Your fraction when added to " + fract2 + " is " + fract2.add(fract));
         System.out.println ( " Your fraction subtracted by " + fract2 + " is " + fract2.subtract(fract));
         System.out.print( " Your fraction in decimal form is " + fract.getValue());
      }
   }
}
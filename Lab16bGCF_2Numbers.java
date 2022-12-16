 //********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/7/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 16bGCF_2Numbers 
//
//***************************************************//
// Import your scanner
import java.util.Scanner;

public class Lab16bGCF_2Numbers
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner ( System.in );
         // Declare your Integers
      int number1;
      int number2;
      //int factor = 1;
      int GCF = 0;
        // Ask for the numbers
      System.out.print ("What is your first number? ");
      number1 = input.nextInt();
         
      System.out.print ("What is your second number? ");
      number2 = input.nextInt();
        // The factors must be less than the selected numbers
      for ( int factor = 1; factor < number1 || factor < number2; factor++){
      
        // The number divided by the factor is equal to 0          
         if ( number1 % factor == 0 && number2 % factor == 0) 
            GCF = factor;
         
      }
        // Print the greatest common factor
      System.out.print ("The greatest common factor of " + number1 + " and " + number2 + " is " + GCF);
   
   }
}
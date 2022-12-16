//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/7/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 16a FactorsComposite
//
//***************************************************//
  // Insert a Scanner
import java.util.Scanner;

   public class Lab16aFactorsComposite
   {
      public static void main(String[] args)
      {
        
      Scanner input = new Scanner ( System.in );
      
        // Declare your integers
      int number;
      int factors2 = 0;
      
        // Ask for a number larger than 1
      System.out.print (" Give me an integer number larger than 1: ");
      number = input.nextInt();
      
        // Print the factors
      System.out.print ("\nThe factors of " + number + " are the following {"); 
      
        // Insert your for loop
      for ( int factors = 1; factors < number; factors++) {
        
          // Create your if statement
        if ( number % factors == 0 ) {
          System.out.print ( factors + ", " );
          factors2++;
        }
    
      }
      
      // Determine whether the number is even or odd and print it
       System.out.print ( number + "}." );
       if ( factors2 ==1 )
       {
         System.out.print ("\n\n" + number + " is a prime number.");
       }
        else if ( factors2 > 1)  {
          System.out.print ("\n\n" + number + " is a composite number.");
        }
      }
    }
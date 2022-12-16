import java.util.Scanner;

   public class Lab10bFactors
   {
      public static void main(String[] args)
      {
      Scanner input = new Scanner ( System.in );
      
      int number;
      int factors = 1; 
      int factors2 = 0;
      
      System.out.print (" Give me an integer number larger than 1: ");
      number = input.nextInt();
      
      System.out.print ("\nThe factors of " + number + " are the following {"); 
      
      while ( factors < number ) {
      
      if ( number % factors ==0 ) {
      System.out.print ( factors + ", " );
      factors2++;
      }
      
      factors++;
      }
      
      System.out.print ( number + "}");
      
      if ( factors2 == 1 ){
      System.out.print ("\n\n" + number + " is a prime number.");
      }
      }
    }
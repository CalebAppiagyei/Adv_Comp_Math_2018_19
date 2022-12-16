//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/8/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 17a Guess my number
//
//***************************************************//
  // Create your random class
import java.util.Random;

  // Create your scanner class
import java.util.Scanner;
  
public class Lab17aGuessmyNumber
{
   public static void main (String[] args) 
   {
    
      // Name your scanner object
      Random generator = new Random();
      // Name your scanner object
      Scanner input = new Scanner( System.in );
   
      // Create your integers
      int num; 
      int guess;
      int attempt = 1;
   
     // Choose a random number
      num = generator.nextInt(1000);
   
     // Introduce the guessing game and ask for a guess
      System.out.print ( " Welcome to Guess my Number " );
      System.out.print ( " \n\nI am thinking of a number between 1 and 1000 " ); 
      System.out.print ( " What is your first guess? " );
      guess = input.nextInt();
   
     // If the guess is not right run one of these two if statements
      while ( guess != num) {
         if ( guess > num ) {
            System.out.println ( " Too High " );
            System.out.print ( " \nWhat is your next guess? " ); 
            guess = input.nextInt();
            attempt++;
         }
      
         if ( guess < num ) { 
            System.out.println ( " Too Small " );
            System.out.print ( " \nWhat is your next guess? " );
            guess = input.nextInt();
            attempt++;
         }
      }
        // If the guess is right run this if statement
      if ( guess == num ) {
         System.out.println ( " Congratulations! You guessed my number, " + num + "." );
         if ( attempt == 1 ) { 
            System.out.print ( " It took you 1 guess. You are the G.O.A.T. at guessing! " );
         }
         else if ( attempt > 1 && attempt < 50 ) {
         
            System.out.print ( " It took you " + attempt + " guesses." );
         }
         else {
            System.out.print ( " It took you " + attempt + " guesses. You are bad at guessing!! " );
         }                    
       
      }
   }
}
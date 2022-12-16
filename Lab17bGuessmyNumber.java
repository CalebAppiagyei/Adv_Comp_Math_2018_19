//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/8/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 17b Guess my number
//
//***************************************************//
  // Create your random class
import java.util.Random;

  // Create your scanner class
import java.util.Scanner;
  
public class Lab17bGuessmyNumber
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
      System.out.println ( " \n\nI am thinking of a number between 1 and 1000 " ); 
      System.out.println ( "Can you guess my number in 10 or fewer guesses? " );
      System.out.print ( " \nWhat is your first guess? " );
      guess = input.nextInt();
   
     // If the guess is not right run one of these two if statements
      for (int amount = 9; amount > 0 && guess != num; amount-- ) {
         if ( guess > num && attempt != 10 ) {
            System.out.println ( " Too High " );
            System.out.print ( " \nWhat is your next guess? " ); 
            guess = input.nextInt();
            attempt++;
         }
      
         if ( guess < num && attempt != 10 ) { 
            System.out.println ( " Too Small " );
            System.out.print ( " \nWhat is your next guess? " );
            guess = input.nextInt();
            attempt++;
         }
      
        // If the guess is right run this if statement
      if ( guess == num && attempt != 0) {
         System.out.println ( " Congratulations! You guessed my number, " + num + "." );
         if ( attempt == 1 ) { 
            System.out.print ( " It took you 1 guess. You are the G.O.A.T. at guessing! " );
         }
      }
            // If the user reaches his 11th guess run either one of these if statements
          if ( attempt == 10 && guess != num && guess < num ) {
              System.out.print ( " Too Small " );
            System.out.print ( " \n\nSorry, you lose... You did not guess my number, " + num + ". Better luck next time!! " );
         }
           if ( attempt == 10 && guess != num && guess > num  ) {
              System.out.print ( " Too High " );
            System.out.print ( " \n\nSorry, you lose... You did not guess my number, " + num + ". Better luck next time!! " );
         }
      }
   }
}
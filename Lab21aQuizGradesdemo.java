import java.util.Scanner;

public class Lab21aQuizGradesdemo
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner ( System.in );
      final int QUESTIONS;
      System.out.print ( " How many questions are in the quiz? ");
      QUESTIONS = input.nextInt();
      
      int answers;
      int correct = 0;
      int[] key = new int [QUESTIONS];
       for ( int i = 0; i < 1; i++ ) {
         System.out.print ( " Enter the key for the quiz: "); 
         key[i] = input.nextInt();
       } 
      System.out.print ( " Enter the student answers: ");
      answers = input.nextInt();
      for ( int i = 0; i < 1; i++ ) { 
        while ( answers == key [i] ) {
          correct++;
        }
      }
      System.out.print( " \n The student got " + correct );
   
   }
}
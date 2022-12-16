//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/12/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 19 GameOf21
//
//***************************************************//

// This Program Recreates the game of Blackjack (to 21)
  // Create your Random class
import java.util.Random;
  // Create your Scanner class
import java.util.Scanner;
  
public class Lab19GameOf21
{
   public static void main(String[] args)
   {
      // Name your Random 
      Random generator = new Random();
    
      // Name your scanner
      Scanner input = new Scanner ( System.in );
    
      int card1, card2, total, ctotal, comcard1, comcard2, choice, newcard;
      int cnewcard, comchoice, cresult, result;
   
    
      // Welcome the user to the game
      System.out.println (" Welcome to Caleb's 21 (BlackJack) Game ");
      
      // Generate a random number for each card and create the totals
      card1 = generator.nextInt(9)+2;
      card2 = generator.nextInt(9)+2;
      comcard1 = generator.nextInt(9)+2;
      comcard2 = generator.nextInt(9)+2;
      newcard = generator.nextInt(9)+2;
      cnewcard = generator.nextInt(9)+2;
      comchoice = generator.nextInt(2);
      total = card1 + card2;
      ctotal = comcard1 + comcard2;
    
      // If the totals of the cards are greater than 21 run this if statement
      if ( total > 21 || ctotal > 21 ) {
         card1 = generator.nextInt(9)+2;
         card2 = generator.nextInt(9)+2;
         comcard1 = generator.nextInt(9)+2;
         comcard2 = generator.nextInt(9)+2;
         total = card1 + card2;
         ctotal = comcard1 + comcard2;
      }
      // Tell the user what card they got and their total also tell the user the computer's card that is showing
      System.out.println (" \n You get a " + card1 + " and a " + card2 + ".");
      System.out.println (" Your total is " + total + ".");
      System.out.println (" \n The computer has a " + comcard1 + " showing, and a hidden card.");
      System.out.println (" The computer total is hidden, too. ");
    
      // Ask the user whether they would like to HIT or STAY
      System.out.print (" \n Would you like to \"1\" HIT or \"2\" STAY? ");
      choice = input.nextInt();
    
      // If the user chooses to Hit deal them their new card
      while ( choice == 1 && total < 22 ) {
         if ( choice == 1 ) { 
            System.out.println (" You were dealt a " + newcard + "." );
            total = total + newcard;
         }
       // If their total is greater than 21 tell the user that they lost
         if ( total > 21 ){
            System.out.println (" Your total is now " + total + ".");
            System.out.println (" \n You busted, you lose. ");
            System.out.println (" \n The computer's hidden card was a " + comcard2 + ".");
            System.out.print (" The computer's total was " + ctotal + ".");
         }
          // If their total is less than 21 they can choose to Hit or Miss again
         else if ( choice == 1 && total < 21 ) {
            System.out.println (" \n Your total is now " + total + ".");
            System.out.print (" \n Would you like to \"1\" HIT or \"2\" STAY? ");
            choice = input.nextInt();
            newcard = generator.nextInt(9)+2;
         } 
         
         // If the user's total is equal to 21 tell the user that they won
         else if ( choice == 1 && total == 21 ){
            System.out.print (" YOU WIN!! You beat " + ctotal + " with " + total + ".");
            choice = 2;
         }
      
      }
      // If the user chooses to Stay run this If statement
      if ( choice == 2 ) { 
      
        // Tell the user what the computer's hidden card was and its total
         System.out.println (" The computer's hidden card was a " + comcard2 + ".");
         System.out.println (" The computer's total was " + ctotal + ".");
      
        // If the computer chooses to hit tell the user the computer's new card
         while ( comchoice == 0 && ctotal < 22 ) {
            if (comchoice == 0 ) { 
               System.out.println (" The computer was dealt a " + cnewcard + ".");
            
            // Print the computers new total
               if ( comchoice == 0 && choice == 2 ) {
                  ctotal = ctotal + cnewcard;
                  System.out.println (" \n The computer's total is now " + ctotal + ".");
                  comchoice = generator.nextInt(2);
                  cnewcard = generator.nextInt(9)+2;
               }
            
            // If the computer's total is equal to 21 tell the user that the computer won
               if ( ctotal == 21 ) { 
                  System.out.print (" The computer wins!! It beats " + total + " with " + ctotal + "."); 
               }
            
            // Tell the user that the computer busts if its total is greater than 21
               if ( ctotal > 21) { 
                  System.out.print (" The computer busts. You win !!! ");
               }
            }
         }
           // If the computer's total is less than or equal too 16 it should always hit
         if ( ctotal <= 16 ){
            comchoice = 0;
            while ( comchoice == 0 && ctotal < 22 ) {
               if (comchoice == 0 ) { 
                  System.out.println (" The computer was dealt a " + cnewcard + ".");
               
               // Print the computers new total
                  if ( comchoice == 0 && choice == 2 ) {
                     ctotal = ctotal + cnewcard;
                     System.out.println (" \n The computer's total is now " + ctotal + ".");
                     comchoice = generator.nextInt(2);
                     cnewcard = generator.nextInt(9)+2;
                  }
               
               // If the computer's total is equal to 21 tell the user that the computer won
                  if ( ctotal == 21 ) { 
                     System.out.print (" The computer wins!! It beats " + total + " with " + ctotal + "."); 
                  }
               
               // Tell the user that the computer busts if its total is greater than 21
                  if ( ctotal > 21) { 
                     System.out.print (" The computer busts. You win !!! ");
                  }
               }
            }
         }
      
        // If the computer chooses to stay and the user picked to stay and the computers total is less than 22 run this if statement
         if ( comchoice == 1 && choice == 2 && total < 22 && ctotal < 22 ) {
         
          // Calculate who is closer to 21
            result = 21 - total;
            cresult = 21 - ctotal;
         
          // If the computer is closer tell the user
            if ( ctotal > total && comchoice == 1 )
               System.out.print (" The computer wins!! It beats " + total + " with " + ctotal + ".");
         
          // If the user is closer tell the user
            if ( ctotal < total && comchoice == 1 ) 
               System.out.print (" YOU WIN!! You beat " + ctotal + " with " + total + ".");
               
            // If it is tied tell the user that they lost
            else if ( result == cresult && comchoice == 1 ) 
               System.out.print (" The computer wins!! It was a tie, you had " + total + " and the computer had " + ctotal+ ".");
         } 
      }
   }
}
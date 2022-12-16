//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/11/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 18b Fortune Cookie
//
//***************************************************//

// This Program creates a Java Fortune Cookie that gives you a quote and lucky numbers.

  // Create your random class
import java.util.Random;
  // Create your scanner class
import java.util.Scanner;

public class Lab18bFortuneCookie 
{
   public static void main (String[] args) 
   {
   
        // Name your scanner
      Scanner input = new Scanner ( System.in );
        // Name your random
      Random generator = new Random ();
        //  Create your integers
      int powerball1;
      int powerball2;
      int powerball3;
      int powerball4;
      int powerball5;
      int powerball6;
      int fortune;
        // Generate a random number
      fortune = generator.nextInt(11);
      powerball1 = generator.nextInt(68)+1;
      powerball2 = generator.nextInt(68)+1;
      powerball3 = generator.nextInt(68)+1;
      powerball4 = generator.nextInt(68)+1;
      powerball5 = generator.nextInt(68)+1;
      powerball6 = generator.nextInt(25)+1; 
   
      System.out.print ( " Fortune Cookie Says: " );
        // Print what the fortune cookie says
      if ( fortune == 0 ) {
         System.out.println ("We write our own destiny, we become what we do. ");
      }
      if ( fortune == 1 ) {
         System.out.println ("You can do anything... BELIEVE THAT!. ");
      }
      if ( fortune == 2 ) {
         System.out.println ("Its not about the certain amount of friends you have, its about the amount of friends you can be certain of. ");
      }
      if ( fortune == 3 ) {
         System.out.println ("There is nothing to FEAR but FEAR itself. ");
      }
      if ( fortune == 4 ) {
         System.out.println ("Keep your goals away from trolls. ");
      }
      if ( fortune == 5 ) {
         System.out.println ("He who gets the credit also gets the blame. ");
      }
      if ( fortune == 6 ) {
         System.out.println ("The early bird gets the worm. ");
      }
      if ( fortune == 7 ) {
         System.out.println ("The usefulness of a cup is its emptiness. ");
      }
      if ( fortune == 8 ) {
         System.out.println ("Some pursue happiness, others create it. ");
      }
      if ( fortune == 9 ) {
         System.out.println ("Keep grinding. ");
      }
      if ( fortune == 10 ) {
         System.out.println ("Chance favors those in motion. ");
      }   
      System.out.print ( " Lucky numbers are: " + powerball1 + ", " + powerball2 + ", " + powerball3 + ", " + powerball4 + ", " + powerball5 + ", " + powerball6 + "." );
   }
}
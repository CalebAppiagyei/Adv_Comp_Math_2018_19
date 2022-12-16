//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/13/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 23a SortedSidesArray
//
//***************************************************//

// This program sorts an array from least to greatest 
// Determines what type of triangle it is.

  // Create your Scanner class
import java.util.Scanner;

public class lab23aSortedSidesArray {

   public static void main(String[] args){
   
     // Name your scanner class
      Scanner input = new Scanner ( System.in );
   
      int[] sides = new int[3];
      int temp, aor, aor1, aor2, counter = 0;
      
     // Ask for three sides for the triangle
      System.out.print ( " Please enter 3 sides for your triangle " );
      for ( int i = 0; i < 3; i++ ) {
         sides[i] = input.nextInt();
      }
        // Sort the sides from least to greatest
      for ( int i = 0; i < 3; i++ ) {
         if ( sides[0] > sides[1] ) {
            temp = sides[0];
            sides[0] = sides[1];
            sides[1] = temp;
         }
         if ( sides[1] > sides[2] ) {
            temp = sides[1];
            sides[1] = sides[2];
            sides[2] = temp;
         }
      
      }
        // Print the sides from least to greatest
      for ( int i = 0; i < 3; i++ ) {
         System.out.print ( " " + sides[i] + " " );
      }
        // Tell the user the three sizes they selected are not a triangle
      if ( sides[2] >= sides[1] + sides[0] ){
         System.out.print ( " \n\n Sorry, your three sides do not make a triangle =( " );
      }
      if ( sides[2] < sides[1] + sides[0] ){
           // Print whether the triangle is obtuse, right, or acute
         aor = sides[2] * sides[2];
         aor1 = sides[0] * sides[0];
         aor2 = sides[1] * sides[1];
         if ( aor > aor1 + aor2 ) { 
            System.out.println ( " \n You have an obtuse triangle. " );
         }
         if ( aor == aor1 + aor2 ) { 
            System.out.println ( " \n You have a right triangle. " );
         }
         if ( aor < aor1 + aor2 ) { 
            System.out.println ( " \n You have an acute triangle. " );
         }
           // Check how many sides of the triangle are equal to each other
         for ( int i = 0; i < 3; i++ ) {
            for ( int j = 2; j > -1; j-- ) {
               if ( sides[i] == sides[j] && i != j ) {
                  counter++;
               }
            }
         }
           // Determine whether the triangle is Scalene, Isosceles, or Equilateral
         if ( counter == 0 ) {
            System.out.print( "\n You have a scalene triangle. " );
         }
         else if ( counter == 2 ) {
            System.out.print( "\n You have an isosceles triangle. " );
         }
         else  {
            System.out.print( "\n You have an equilateral triangle. " );
         }
      }
   }
}

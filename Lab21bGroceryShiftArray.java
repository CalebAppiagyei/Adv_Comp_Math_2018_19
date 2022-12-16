//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:2/11/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 21b GroceryShiftArray
//
//***************************************************//

// This program uses a shifted array to make a grocery list and add thing too it.

 // Insert your scanner 
import java.util.Scanner;

public class Lab21bGroceryShiftArray
{
   public static void main (String[] args) 
   {
        // Name your Scanner object
      Scanner input = new Scanner ( System.in );
        
        // Create your integers
      final int ITEMNUM;
      int numitem;
      int add;
      int num = 1;
      
        // Ask for how many items are on the list
      System.out.print ( " How many items on the grocery list? " );
      numitem = input.nextInt();
        // Ask how many items the userr plans on adding
      System.out.print ( " How many items to add to the list? ");
      add = input.nextInt();
        // Create the value of your final int and make your array
      ITEMNUM = numitem + add;
      String[] item = new String [ITEMNUM];
        // Type in each item for the list
      for ( int i = 0; i < numitem; i++ ) {
         System.out.print ( " Item " + (i+1) + " to add to grocery list: " );
         item[i] = input.next();   
      }
        // Print the first grocery list
      System.out.print ( " \n ***Grocery List*** \n" );
      for ( int i = 0; i < item.length; i++ ) {
         System.out.print ( item[i] + "\n" );
      }
      // System.out.print ( "\n" );
//       for ( int i = 0; i < item.length; i++ ) {
//          System.out.print ( item[i] + "\n" );
//       }
   
   
         // Ask the user for the new items
          for ( int i = 0; i < numitem; i++ ) {
             System.out.print ( " New item to add to existing grocery list: " );
             item[i] = input.next();
          }
            // Print the final grocery list
          System.out.print ( " \n ***Grocery List*** \n" );
          for ( int i = 0; i < ITEMNUM; i++ ) {
             System.out.print ( item[i] + "\n" );
          }
   }
}
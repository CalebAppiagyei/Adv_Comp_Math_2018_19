//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 26c NameStretch
//
//***************************************************//

// This program will ask the user to enter a name
// It will then print each letter of their name on seperate lines
  
  // Create your Scanner class
import java.util.Scanner;

public class lab26cNameStretch
{
   public static void main(String[] args) 
   {
     // Name your scanner
      Scanner input = new Scanner ( System.in );
     
     // Create a string
      String name;
     // Ask the user to enter a name
      System.out.print ( " Please enter your name: " );
      name = input.nextLine();
     // Call your method
      stretch(name);
     // Tell the user goodbye
      System.out.print ( " Goodbye, " + name + "!");
   }
     // Create your METHODS
   public static void stretch ( String name ) {
    int length = name.length();
    for ( int i = 0; i < length; i++ ){
      System.out.print ( " " + name.charAt(i) + "\n" ); 
    }
   }
}

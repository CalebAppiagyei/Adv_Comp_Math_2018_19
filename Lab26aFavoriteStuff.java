//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 26a Favorite Stuff
//
//***************************************************//

// This program will ask the user to enter a name and their favorite number
// It will then print that name horizontally the number of times the user typed

  // Create your scanner class
import java.util.Scanner;

public class Lab26aFavoriteStuff 
{
  public static void main(String[] args) 
  {
  
      // Name your scanner class
    Scanner input = new Scanner ( System.in );
    
      // Create a string and integer
    String name;
    int number;
    
      // Ask the user to enter their name and a number
    System.out.print ( " Please enter your name: " );
    name = input.nextLine();
    System.out.print ( " Please enter your favorite number: " );
    number = input.nextInt(); 
    print( name, number);
  }
    // Create your method
  public static void print (String name, int number) {
    System.out.print(" ");
    for ( int i = 0; i < number; i++ ) {
        System.out.print ( name + " \n " );
    }
  }
}
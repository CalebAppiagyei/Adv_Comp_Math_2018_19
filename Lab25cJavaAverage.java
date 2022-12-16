//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 25c Java Average
//
//***************************************************//

// This Program will ask the user their class average
// and print a message based on their average

  // Create your scanner class
import java.util.Scanner;
  
public class Lab25cJavaAverage 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner ( System.in );
    
      // Create an integer
    int average;
      // Ask the user what their mid-year average is
    System.out.print ( " What is your mid-year average? ") ;
    average = input.nextInt();
    
      // Create an if-else statement that determines which METHOD to print 
    if ( average >= 65 ) {
      passing(); 
    }
    
    else {
      failing(); 
    }
  }
    // Create your METHODS 
  public static void passing() {
    System.out.print ( " Good Job =), you are passing. " );
  }
  public static void failing() {
    System.out.print ( " Hook up with a smart classmate and STUDY! " );
  }
}
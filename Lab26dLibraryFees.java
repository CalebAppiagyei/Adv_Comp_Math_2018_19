//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/21/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 26d Library Fees
//
//***************************************************//

// This program will use a METHOD to calculate a late fee
// It will also tell the user if the book is WAY overdue

  // Create your Scanner class
import java.util.Scanner;
  // Create your Decimal format class
import java.text.*;

public class Lab26dLibraryFees 
{
  public static void main(String[] args)
  {
     // Name your scanner
   Scanner input = new Scanner ( System.in );
     
     // Create a double
   double days;
     // Ask the user how many days is their book overdue
   System.out.print( " How many days is your library book overdue? " );
   days = input.nextDouble();
   overdue( days );
  }
    // Create your Method
  public static void overdue ( double days ) {
    double fifteen = 0.15;
    double fee = fifteen * days;
    DecimalFormat decFor = new DecimalFormat("0.00");
    System.out.println( " Your late fee is $" + decFor.format( fee ));
      // Create a message to print if the book is WAY OVERDUE
    if ( days > 10 ) {
      System.out.print ( " WAY OVERDUE " );
    }
  }
}
  
  

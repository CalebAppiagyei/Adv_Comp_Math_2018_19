//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date: 5/14/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 33 ChangeReturn(Operating) 
//
//***************************************************//

// This lab will create a program that uses a class file that determines
// the change given to a customer after a purchase, it will use the leat amount of coins
// to return the change

  // Create your Scanner class
import java.util.Scanner;

public class Lab33ChangeReturn {

   public static void main(String[] args){
   
       // Name your scanner class
      Scanner input = new Scanner ( System.in );
       // Create your variables
      int change;
   
       // Create your Change objects
      ChangeReturn cents;
      
       // Ask the user for the amount of change needed
      System.out.print( " What is the amount of cents to return? " );
      change = input.nextInt();
      
       // Give a value for your object
      cents = new ChangeReturn(change);
      
       // Call your methods  
      System.out.print(cents.toString());
      cents.getChange();
      
      
   }
}
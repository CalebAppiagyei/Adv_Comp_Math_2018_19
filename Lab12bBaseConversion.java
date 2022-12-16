//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/6/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 12b BaseConversion
//
//***************************************************//
  // Insert your Scanner
import java.util.Scanner;

public class Lab12bBaseConversion
{
  public static void main ( String[] args )
  {
    
    Scanner input = new Scanner ( System.in );
    
      // Create your integers
    int dec;
    int base;
    int pow = 1;
    int ans;
    
      // Ask for a Decimal number
    System.out.print ( " Enter a decimal number between 1 and 100,000: " );
    dec = input.nextInt();
    
      // Ask for a base system
    System.out.print ( " Enter a base from 2-16: " );
    base = input.nextInt();
    
      // Insert your while loop
    while ( pow <= dec ) {
      pow = pow * base;
    }
      pow = pow / base;
      // Print the decimal numberin its new base 
    System.out.print ( " The decimal number " + dec + " in " + base + " is: " );
    while ( pow > 0 ) { 
     ans = dec / pow;
     dec = dec  - (ans * (pow));
     pow = pow / base;
    if ( ans == 10 ) {
       System.out.print ( "A" );
     }
     else if ( ans == 11 ) {
       System.out.print ( "B" );
    }
     else if ( ans == 12 ) { 
       System.out.print ( "C" );
     }
     else if ( ans == 13 ) { 
       System.out.print ( "D" );
     }
     else if ( ans == 14 ) {
       System.out.print ( "E" );
     }
     else if ( ans == 15 ) { 
       System.out.print ( "F" );
     }
     else if ( ans == 16 ) {
       System.out.print ( "G" );
     }
     else {
       System.out.print ( ans );
     }
    }
  }
}
    
  
  
//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/6/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 12a HexNumbers
//
//***************************************************//
  // Insert your scanner
import java.util.Scanner;

public class Lab12aHexNumbers 
{
  public static void main ( String[] args ) 
  {
    Scanner input = new Scanner ( System.in );
    
    // Create your integers
    int dec;
    int hex;
    int pow = 1;
    
    
    System.out.print ( " Enter a decimal number between 1 and 50,000: " );
    dec = input.nextInt(); 
    
    // Create your while loop
    while ( pow <= dec ) {
      
      pow = pow * 16;
     
    }
    pow = pow / 16;
    // Print the decimal number in Hexadecimal
   System.out.print ( " The decimal number " + dec + " in hexadecimal is: " );
    while ( pow > 0 ) { 
     hex = dec / pow;
     dec = dec  - (hex * (pow));
     pow = pow / 16; 
     if ( hex == 10 ) {
       System.out.print ( "A" );
     }
     else if ( hex == 11 ) {
       System.out.print ( "B" );
    }
     else if ( hex == 12 ) { 
       System.out.print ( "C" );
     }
     else if ( hex == 13 ) { 
       System.out.print ( "D" );
     }
     else if ( hex == 14 ) {
       System.out.print ( "E" );
     }
     else if ( hex == 15 ) { 
       System.out.print ( "F" );
     }
     else {
       System.out.print ( hex );
     }
    
  }
  
  }
}
    
import java.util.Scanner;

 public class Lab11bDigits
 {
   public static void main (String[] args)
   {
   
   Scanner input = new Scanner ( System.in );
   
   int num;
   int divisor = 1;
   int remainder;
   
   System.out.print (" Please type in a number : ");
   num = input.nextInt();
   
   if ( num > 0 ) {
   
   while ( num > 0 ) {
   
   remainder = num % 10;
   System.out.println ( " The number in the " + divisor + "'s place is " + remainder );
   num /=10;
   divisor *= 10;
   }
   }
   else {
   num *= -1;
   
   while ( num > 0 ) {
   
   remainder = num % 10;
   System.out.println ( " The number in the " + divisor + "'s place is " + remainder );
   num /=10;
   divisor *= 10;
   
   }
   }
  } 
} 
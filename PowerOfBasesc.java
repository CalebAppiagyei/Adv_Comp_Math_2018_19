import java.util.Scanner;

public class PowerOfBasesc
{
   public static void main(String[] args)
   {
   int base; 
   int power; 
   int total = 1 ;
   int power2 = 0;
   int base2 = 1;
   
   Scanner input = new Scanner ( System.in );
   
   System.out.print ( " Enter in a base number from 2-12: ");
   base = input.nextInt();
   System.out.print( " Enter a power number from 2-10: ");
   power = input.nextInt();
   
      while ( base > 0 ){
   while ( power >= power2 ) {
   System.out.print(base2 + "^" + power2 + " = " + total + "\t  ");
   power2++;
   total = total * base2;
   }
   base = base - 1; 
   base2 = base2 + 1;
   power2 = 0;
   total = 1; 
   System.out.println();
     
   }  
   
   }
}
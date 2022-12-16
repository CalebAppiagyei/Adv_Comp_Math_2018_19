import java.util.Scanner;
public class Lab06DecOctal
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner( System.in );
   int dec;
   int oct; 
   int pow = 8*8*8*8*8*8*8*8*8*8;
   int x = 0;
    System.out.println ("Type in a number in the decimal base system:"); 
    dec = input.nextInt();
    System.out.print ("Your number in octal is " ); 
    while ( x < 11 )
    {
    //System.out.print ( dec / z );
     oct = dec / pow;
     dec = dec  - (oct * (pow));
     System.out.print(oct);
     pow = pow / 8;
     
    //System.out.print (" Your number in binary is: " + result +);
   
    x++;
     }
    
     }
}
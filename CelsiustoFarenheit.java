public class CelsiustoFarenheit
{
   public static void main(String[] args)
   {
   double Celsius; 
   double Farenheit; 
   Celsius = 0;
   //System.out.println ("   -40.0C is -40.OF  -30.0C is -22.0F  -20.OC is -4.0F  -10.OC is 14.0F");
   while ( Celsius < 10 )
   { 
   Farenheit = ( Celsius * 9 + 160) / 5;
   System.out.print("\t" + Celsius+"C" + "\tis\t " +Farenheit+"F" + "\t\t");
   Celsius = Celsius + 10;
   
   Farenheit = ( (Celsius ) * 9 + 160) / 5;
   System.out.print("\t" + Celsius+"C" + "\tis\t " + Farenheit+"F" + "\t\t");
   Celsius = Celsius + 10;
   
   Farenheit = ((Celsius ) * 9 + 160) / 5;
   System.out.print("\t" + Celsius+"C" + "\tis\t " + Farenheit+"F" + "\t\t");
   Celsius = Celsius + 10;
   
   Farenheit = (( Celsius ) * 9 + 160) / 5;
   System.out.println("\t" + Celsius+"C" + "\tis\t " + Farenheit+"F" + "\t\t");
   Celsius = Celsius - 29; 
     }
   }
}   
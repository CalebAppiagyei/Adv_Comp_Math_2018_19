//********************479017*************************//
//
//4   Name:Caleb Appiagyei
//7
//9   Date:1/3/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 14a1 CelsiustoFarenheit
//
//***************************************************//
public class Lab14a1CelsiustoFarenheit
{
   public static void main(String[] args)
   { 
     
     // Declare your Doubles
      double Celsius; 
      double Farenheit = 32; 
   
   // Set Celsius = to 0
      Celsius = -40;
   
     // Insert your nested FOR loops
      for ( double i = -40; i < -31; )
      { 
         i = Celsius;
         for ( double j = -40; j < 16.3; ) 
         {
            j = Farenheit;
              // Calculate and print each number
            Farenheit = ( Celsius * 9 + 160) / 5;
            System.out.print("\t" + Celsius+"C" + "\tis\t " +Farenheit+"F" + "\t ");
            Celsius = Celsius + 10;
         
            Farenheit = ( (Celsius ) * 9 + 160) / 5;
            System.out.print("\t" + Celsius+"C" + "\tis\t " + Farenheit+"F" + "\t ");
            Celsius = Celsius + 10;
         
            Farenheit = ((Celsius ) * 9 + 160) / 5;
            System.out.print("\t" + Celsius+"C" + "\tis\t " + Farenheit+"F" + "\t ");
            Celsius = Celsius + 10;
         
            Farenheit = (( Celsius ) * 9 + 160) / 5;
            System.out.println("\t" + Celsius+"C" + "\tis\t " + Farenheit+"F" + "\t ");
            Celsius = Celsius - 29; 
         }
      }
   }
}
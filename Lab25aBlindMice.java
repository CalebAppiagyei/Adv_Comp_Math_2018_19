//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 25a BlindMice
//
//***************************************************//

// This program will use 2 METHODS to print 2 statements twice
// It will also print another line that is not inside the method

public class Lab25aBlindMice 
{
  public static void main(String[] args) 
  {
     // Invoke your METHODS 
   mice();
   mice();
   run();
   run();
     // Print Your final line
   System.out.print ( " They all run after the farmer's wife. " );
  }
  // Create your METHODS
   public static void mice() {
     System.out.println( " Three blind mice " );
   }
    public static void run() {
      System.out.println( " See how they run " );
   }
}
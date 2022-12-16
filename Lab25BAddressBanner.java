//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:3/20/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 25b Address Banner
//
//***************************************************//

// This program uses two METHODS two create an address banner

public class Lab25BAddressBanner 
{
  public static void main(String[] args) 
  {
      // Invoke your METHODS 
    money();
    System.out.println();
    money();
    address();
    money();
    System.out.println();
    money();
    System.out.println();
    money();
  }
    // Create your first Method
  public static void money (){
    for ( int i = 0; i < 30; i++ ) {
      System.out.print("$"); 
    }
  }
    // Create your second METHOD
  public static void address () {
    System.out.println ( " \nCaleb Appiagyei " );
    System.out.println ( "236 LebronJames Lane " );
    System.out.println ( "Akron, OH 44223 " );
  }
}
//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/5/19
//0   
//1   Period:Period 3
//7
//    Lab Title: Lab 14b MultiplicationTable
//
//***************************************************//

public class Lab14bMultiplicationTable
{
   public static void main(String[] args)
   {
       // Declare your integers
      int xtimes = 1;
      int ytimes = 1;
      int product = 1;
   
     // Insert your For loops 
      for ( int i = 1; i < 15;  )
      {
         i = xtimes;
         for (int j = 1; j < 15; ) 
         {
            j = ytimes;
         
         // Print the output
            product = ytimes*xtimes;
            System.out.print (product + "\t  ");
            ytimes++;
         
         }
      
         System.out.println();
         xtimes++;
         ytimes =1;
      
      
      
      }
   }
}
     

//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date:1/10/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 18a Magic 8Ball
//
//***************************************************//

// This program creates a Magic8Ball that can answer your Questions

  // Create your Random class 
import java.util.Random;
  // Create your Scanner class
import java.util.Scanner;

public class Lab18aMagic8Ball
{
   public static void main (String[] args)
   {
        // Name your Random class 
      Random generator = new Random();
        // Name your Scanner
      Scanner input = new Scanner ( System.in );
        // Create your integers
      int num;
      //int enter;
      
        // Generate a random number from 1-25
      num = generator.nextInt(25);
      
        // Tell the user to press enter to see their response
      System.out.println ( " Concentrate on your questions! " );
      System.out.println ( " Press enter to see Magic 8-Ball's Prediction " );
      input.nextLine();
      System.out.print ( " MAGIC 8-ball SAYS: ");
      
        // Create your if statements
      if ( num == 1 ) { 
         System.out.print ( " It is certain. " );
      }
      else if ( num == 2 ) { 
         System.out.print ( " It is decidedly so. " );
      }
      else if ( num == 3 ) { 
         System.out.print ( " Without a doubt. " );
      }
      else if ( num == 4 ) { 
         System.out.print ( " Yes - definitely. " );
      }
      else if ( num == 5 ) { 
         System.out.print ( " You may rely on it. " );
      }
      else if ( num == 6 ) { 
         System.out.print ( " As I see it, yes. " );
      }
      else if ( num == 7 ) { 
         System.out.print ( " Most likely. " );
      }
      else if ( num == 8 ) { 
         System.out.print ( " Outlook good. " );
      }
      else if ( num == 9 ) { 
         System.out.print ( " Yes. " );
      }
      else if ( num == 10 ) { 
         System.out.print ( " Signs point to yes. " );
      }
      else if ( num == 11 ) { 
         System.out.print ( " Reply hazy, try again. " );
      }
      else if ( num == 12 ) { 
         System.out.print ( " Ask me again later. " );
      }
      else if ( num == 13 ) { 
         System.out.print ( " Better not tell you now. " );
      }
      else if ( num == 14 ) { 
         System.out.print ( " Cannot predict now. " );
      }
      else if ( num == 15 ) { 
         System.out.print ( " Concentrate and ask again. " );
      }
      else if ( num == 16 ) { 
         System.out.print ( " Don't count on it. " );
      }
      else if ( num == 17 ) { 
         System.out.print ( " My reply is no. " );
      }
      else if ( num == 18 ) { 
         System.out.print ( " My sources say no. " );
      }
      else if ( num == 19 ) { 
         System.out.print ( " Outlook not so good. " );
      }
      else if ( num == 20 ) { 
         System.out.print ( " Very doubtful. " );
      }
      else if ( num == 21 ) { 
         System.out.print ( " You dont want to know. " );
      }
      else if ( num == 22 ) { 
         System.out.print ( " I plead the 5th. " );
      }
      else if ( num == 23 ) { 
         System.out.print ( " mmm... Next question. " );
      }
      else if ( num == 24 ) { 
         System.out.print ( " Absolutely... NOT. " );
      }
      else if ( num == 25 ) { 
         System.out.print ( " GO FOR IT!!!. " );
      } 
   }
}
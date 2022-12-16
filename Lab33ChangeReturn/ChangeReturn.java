//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date: 5/14/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 33 ChangeReturn(Class) 
//
//***************************************************//

// This lab will create a program that uses a class file that determines
// the change given to a customer after a purchase, it will use the leat amount of coins
// to return the change

public class ChangeReturn { 

   private int quarter = 25, dime = 10, nickel = 5, penny = 1,change, extrachange;
   
     // Create your constructors
   ChangeReturn(int cents){
      if ( cents > 99 ){
         extrachange = cents;
         System.out.println(" Give back more dollar bills, and then give back ");
         while ( cents > 99 ) {
            cents = cents - 100;
         }
         change = cents;
      }
      else {
         change = cents;
      }
   }
     // Create a method to deduct quarters
   public int quarters(){
      int counter = 0, cents = change;
      while ( cents >= quarter ){
         cents = cents - 25;
         counter++;
      }
      return counter;
   }
     // Create a method to deduct dimes
   public int dimes(){
      int cents = change - (quarter * quarters());
      int counter = 0;
      while ( cents >= dime ){
         cents = cents - 10;
         counter++;
      }
      return counter;
   }
     // Create a method to deduct nickels
   public int nickels(){
      int cents = change - (quarter * quarters()) - (dime * dimes());
      int counter = 0;
      while ( cents >= nickel ){
         cents = cents - 5;
         counter++;
      }
      return counter;
   }
     // Create a method to deduct pennies
   public int pennies(){
      int cents = change - (quarter * quarters()) - (dime * dimes()) - (nickel * nickels());
      int counter = 0;
      while ( cents >= penny ){
         cents = cents - 1;
         counter++;
      }
      return counter;
   }
     // Create your toString method
   public String toString(){
      if ( extrachange < 100 ){
         return " The cents entered was " + change + ".";
      }
      return "";
   }
     // Create your getChange method
   public void getChange() {
      if ( extrachange < 100 ){
         System.out.println (" The correct change given will be");
      }
      System.out.println (" Quarter(s) " + quarters());
      System.out.println (" Dime(s) " + dimes());
      System.out.println (" Nickel(s) " + nickels());
      System.out.println (" Pennies(s) " + pennies());
   }
}

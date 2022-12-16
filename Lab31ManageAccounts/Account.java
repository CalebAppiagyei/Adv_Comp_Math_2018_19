
//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date: 4/5/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 31 Manage Accounts
//
//***************************************************//

//*****************************************************
// Account.java
//
// A bank account class with methods to deposit, to withdraw from,
// change the name on, charge a fee to, and print the summary of the account.
//*****************************************************
public class Account
{
   private double balance;
   private String name;
   private long acctNum;
   
   //--------------------------------------------------
   // Constructor -- initializes balance, owner, and account number
   //--------------------------------------------------
   public Account(double initBal, String owner, long number)
   {
      balance = initBal;
      name = owner;
      acctNum = number;
   }
   
   // ------------------------------------------------
   // Checks to see if balance is sufficient for withdrawal.
   // If so, decrements balance by amount; if not, prints message.
   // ------------------------------------------------
   public void withdraw(double amount)
   {
      if(balance >= amount)
         balance -= amount;
      else
         System.out.println("Insufficient funds");
   } 
   
   // ------------------------------------------------
   // Adds deposit amount balance.
   // ------------------------------------------------
   public void deposit(double amount)
   {
      balance += amount;
   }
   
   // -----------------------------------------------
   // Returns balance.
   // -----------------------------------------------
   public double getBalance()
   {
      return balance;
   }
   
   // -----------------------------------------------
   // Returns a string containing name, account number, and balance.
   // -----------------------------------------------
   public String toString()
   {
      return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
   }
   
   // -----------------------------------------------
   // Deducts $10 service fee //
   // -----------------------------------------------
   public double chargeFee()
   {
     balance = balance - 10;
     return balance;
   }
   // -----------------------------------------------  
   // Charges the name on the account
   // -----------------------------------------------
      public void changeName(String newName)
      {
        name = newName;
      }
  } 
  
         
//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date: 4/6/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 31 Manage Accounts
//
//***************************************************//

//***************************************************
// ManageAccounts.java
//
// Use Account class to create and manage Sally and Joe's 
// bank accounts
// **************************************************

public class ManageAccounts
{
  public static void main (String[] args)
  {
    Account acct1, acct2;
      // Create account1 for Sally with $1000
    acct1 = new Account(1000, "Sally", 1111);
    acct2 = new Account(500, "Joe", 12345);
      // Deposit $100 into Joe's account
    acct2.deposit(100);
    System.out.println ("Joe's new balance is $" + acct2.getBalance());
      // Withdraw $50 from Sally's account
    acct1.withdraw(50);
    System.out.println ("Sally's new balance is $" + acct1.getBalance());
     // Charge a fee to both of the accounts
    System.out.println ("Sally's balance after charging a fee is " + acct1.chargeFee());
    System.out.println ("Joe's balance after charging a fee is " + acct2.chargeFee());
      // Change Joe's name to Joseph
    acct2.changeName("Joseph");
      // Print the summary of each account
    System.out.println (acct1.toString());
    System.out.print (acct2.toString());
    
    
  }
}
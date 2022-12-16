import java.util.*;
public class Accountalist
{
   public static void main(String[] args)
   {
   
   ArrayList <Account> accountlist= new ArrayList <Account>();
   
   accountlist.add(new Account(1000, "Sally", 1111));
   accountlist.add(new Account(500, "Joe", 500));
   
   System.out.println(accountlist);
   
     // Accessing the method of a class from an object in the Arraylist
   System.out.println(accountlist.get(1).getBalance());
   }
}
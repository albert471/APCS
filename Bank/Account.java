
/**
 * The account class shows a more complicated use of object oriented programming with getters and setters
 *
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
import java.util.Scanner;
public class Account
{
private double balance;
final private int ACNT_NUM;
private static int last_acnt_num = 0;

public Account (double initial){
         balance = initial;
         ACNT_NUM = last_acnt_num;
         last_acnt_num ++;
        }
public double getBalance()
{
    return balance;
}
public void deposit(double amnt)
{
    balance += amnt;
}
public boolean withdraw(double amnt)
{
    if(balance >= amnt)
    {
        balance -= amnt;
        return true;
    }
    else
    {
        System.out.println("Insufficient funds for this transaction.");
        return false;
    }
}
public static void main (String[] args)
    {
     Scanner read = new Scanner(System.in);
     System.out.println("How much money will you start with in your account?  ");
     double input = read.nextDouble();
     Account a = new Account(input);
     System.out.print("Do you want to withdraw or deposit (w or d)? ");
     String response = read.nextLine();
     if (response.equalsIgnoreCase("w")){
         System.out.print("How much money do you wish to withdraw?");
         double amnt = read.nextDouble();
         a.withdraw(amnt);
        }
     else if (response.equalsIgnoreCase("d")){
         System.out.print("How much money do you wish to deposit?");
         double amnt = read.nextDouble();
         a.deposit(amnt);
        }
    }    
}
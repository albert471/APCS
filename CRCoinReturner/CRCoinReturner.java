/**
 * A CRCoinReturner is a cash register that totals up sales, 
 * accepts Coin objects for payment, computes change due, and 
 * returns Coin objects for change.
 * @author Alberto Checcone
 * @version 1.0
*/
    
public class CRCoinReturner
{

   // instance variables here
   private double balance = 0;
   private int numberofcoins;
   /**
      Constructs a cash register with no money in it.
   */
   public CRCoinReturner()
   {
       balance = 0;
       // your code here
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
       balance = balance - amount;
       // your code here
       
   }

   /**
    * Enters the payment received from the customer; 
    * it should be called once for each coin type.
    * @param coinCount the number of coins
    * @param coinType the type of the coins in the payment
   */
   public void enterPayment(int coinCount, Coin coinType)
   {
       balance = balance + coinType.getValue() * coinCount;
       //  your code here
       
   }

   /**
      Returns the number of coins of a particular type to return.
      @param coinType the type of coin in which change will be returned
      @return the change due to the customer in the specified coinType
   */
   public int giveChange(Coin coinType)
   {
       numberofcoins = 0;
       while(balance> coinType.getValue()-1E-12){
           numberofcoins++;
           balance = balance - coinType.getValue();
       }
       System.out.println(balance);
       System.out.println(numberofcoins);
       return numberofcoins;
   }    
}
/**
   The Stock class holds data about a stock.
*/

public class Stock
{
   private String symbol;     // Trading symbol of stock
   private double sharePrice; // Current price per share

   /**
      Constructor
      @param sym The stock's trading symbol.
      @param price The stock's share price.
   */

   public Stock(String sym, double price)
   {
      symbol = sym;
      sharePrice = price;
   }
   
   /**
      getSymbol method
      @return The stock's trading sysmbol.
   */
   
   public String getSymbol()
   {
      return symbol;
   }
   
   /**
      getSharePrice method
      @return The stock's share price
   */
   
   public double getSharePrice()
   {
      return sharePrice;
   }

}
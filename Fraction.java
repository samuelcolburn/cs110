/** 
Fraction Class  to implement fractions (rational numbers)
*/

//public can be accessed by any client
// 
public class Fraction
{
   private int numerator;
   private int denominator;

   /** 
      Constructor
      Fraction = 0/1
   */
   public Fraction()
   {
      numerator = 0;
      denominator = 1;
   }

   /** 
      Constructor
      @param number The numerator, denominator = 1

   */
   public Fraction(int num)
   {
      numerator = num;
      denominator = 1;
   }
  
   /** 
      Constructor
      @param num The numerator
      @param den The denominator
   */
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
   }
   
   /**
      The setNumerator method stores a value in the 
      numerator field
      @param num The value to be stored in numerator
   */
   public void setNumerator(int num)
   {
      numerator = num;
   }
   /**
      The setNumerator method stores a value in the 
      numerator field
      @param num The value to be stored in numerator
   */
   public void setDenominator(int den)
   {
      denominator = den;
   }
   /** 
      The getNumerator method returns a Fraction object's numerator
      @return the value stored in the Fration's numerator field
   */
   public int getNumerator()
   {
      return numerator;
   }
   /** 
      The getDenominator method returns a Fraction object's denominator
      @return the value stored in the Fration's numerator field
   */
   public int getDenominator()
   {
      return denominator;
   }
   /** 
      The getDecimal method returns a decimal representation of
      the Fraction's numerator/denominator      
      @return the value numerator/denominator
   */
   public double getDecimal()
   {
      return (double)numerator/denominator;
   }
   


}

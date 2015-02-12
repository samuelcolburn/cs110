import java.util.Random;

public class FractionDemo{
   
   public static void main(String [] args){
   
      Fraction1 f1;
      f1 = new Fraction1();
      f1.setNumerator(4);
      f1.setDenominator(6);
      System.out.println(f1.getDecimal());
      
      Fraction1 gobble;
      gobble = new Fraction1(1,3);
      System.out.println(gobble.getFraction());
      
      Fraction1 f3;
      f3 = new Fraction1(5);
      System.out.println(f3.getDecimal());
      
   }
   }
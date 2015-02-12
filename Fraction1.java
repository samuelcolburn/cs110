import java.util.Random;

public class Fraction1{

   //data
   private int num;  //private == nobody can see it outside the class
   private int den;
   
   //Constructor
   public Fraction1(){}  //this is default constructor, it takes no data, does nothing. Made by default.
   
   public Fraction1(int n, int d){
      setNumerator(n);
      setDenominator(d);
   }
   
   public Fraction1(int n){
      setNumerator(n);
      setDenominator(1);
   }
   
   //methods   
   public void setNumerator(int n){
      num = n;
   }
   public void setDenominator(int d){
      
      if(d != 0)
         den = d;
      else
         den = 1;
   }
   
   
   // getters
   public int getNumerator(){
      return num;
   }
   
   public int getDenominator(){
   
      return den;
   }  
   
   public String getFraction(){
      return num+"/"+den;
   }
   
   public double getDecimal(){
      
      return (double)(num)/den;
   }
}
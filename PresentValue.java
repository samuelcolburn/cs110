/*
 Sam Colburn
 2-6-2015
 CS110

 5-16: Present Value 
 
   Write a program that asks the user  for:
      Future Value
      Annual interest Rate
      Years
   
   Given these values, the method presentValue should calculate the Present value of the investment.
   
   P = F / (1 + r)^ n
      
 

 NOTES:
   - User inputs true percentage (ex. 2.5 NOT 0.25)
   - Run at command prompt

*/ 

// import libraries
import java.util.Scanner;
import java.math.*;


//START CLASS PresentValue
public class PresentValue{

   //START METHOD main
   public static void main(String [] args){
      
      //initialize variables
      double futureValue;
      double annualInterest;
      double years;
      double presentValue;
      
      
      //GET user input
      Scanner keyboard = new Scanner(System.in);
      System.out.print("What is the desired future value? ");
      futureValue = keyboard.nextDouble();
      
      keyboard = new Scanner(System.in);
      System.out.print("What is the annual interst rate (%)? ");
      annualInterest = keyboard.nextDouble() / 100 ;
      
      keyboard = new Scanner(System.in);
      System.out.print("For hwo many years? ");
      years = keyboard.nextDouble();


      //Calculate presentValue
      presentValue = presentValue(futureValue,annualInterest,years);
      
      //Display presentValue
      System.out.printf("You need to invest $%,.2f",presentValue);
          
      
     }//END METHOD main
    

   //START METHOD presentValue
   public static double presentValue(double futureValue, double annualInterest, double years){
      
      double p;
      
      p = futureValue / Math.pow( 1+ annualInterest , years);
      
      return (double) p;
   }
   //END METHOD presentValue
   
         
}//END CLASS PresentValue
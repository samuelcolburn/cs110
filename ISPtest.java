
// Sam Colburn
// CS 110
// 1-28-2015
// Internet Service Provider
// ask for an ISP package letter, ask for hours used. Display cost based on hours used,
// If they would have saved money with another package display how much they would have saved.
// 

import java.util.Scanner;


public class ISPtest
{
   public static void main(String [] args){
  
      //initalize variables
      double monthlyA = 9.95;
      int hourMaxA = 10;
      double hourlyA = 2.00;
            
      double monthlyB = 13.95;
      int hourMaxB = 20;
      double hourlyB = 1.00;
      
      double monthlyC = 19.95;
      int hourMaxC = 0;
      double hourlyC = 0;
      
      double TOTALpackageA;
      double TOTALpackageB;
      double TOTALpackageC;
      
    	// initialize scanner object for package letter
		Scanner inputletter = new Scanner(System.in);
      
      //get package letter
      System.out.print("Package Letter: ");
		String letter = inputletter.nextLine();
      
      //verify valid letter
      while( !(letter.equals("A") || letter.equals("B") || letter.equals("C"))){
         System.out.println("That is not a valid package");  
         System.out.print("Package Letter: ");
		   letter = inputletter.nextLine();
      }

    
      //intialize scanner object for number of hours used
      Scanner inputhours = new Scanner(System.in);
      int hours;
      
      //get number of hours and verify positive integer
      do {
         System.out.print("Hours Used: ");
   	   
         while (!inputhours.hasNextInt()){
            System.out.println("That's not even a number!");
            System.out.print("Hours Used: ");
            inputhours.next();
         }
         
         hours = inputhours.nextInt();
      
      } while (hours <= 0);
      
         
      //calculate totals for each package
      
      //A
      TOTALpackageA = monthlyA;
      if (hours > hourMaxA) {
         TOTALpackageA += (hours - hourMaxA)*hourlyA;
      }
      
      //B
      TOTALpackageB = monthlyB;
      if (hours > hourMaxB) {
         TOTALpackageB += (hours - hourMaxB)*hourlyB;
      }      
      //C
      TOTALpackageC = monthlyC;
      
      
      
      // Display Results
      if (letter.equals("A")){
         System.out.printf("Your total charges this month: $%.2f%n" , TOTALpackageA);
         
         if(TOTALpackageA >= TOTALpackageB){
            System.out.printf("You could have saved $%.2f with Package B%n" , (TOTALpackageA - TOTALpackageB));
         }
         if(TOTALpackageA >= TOTALpackageC){
            System.out.printf("You could have saved $%.2f with Package C%n" , (TOTALpackageA - TOTALpackageC) );
         }   
      }
      
      if (letter.equals("B")){
         System.out.printf("Your total charges this month: $%.2f%n" , TOTALpackageB);   
         if(TOTALpackageB >= TOTALpackageA){
            System.out.printf("You could have saved $%.2f with Package A%n" , (TOTALpackageB - TOTALpackageA));
         }
         if(TOTALpackageB >= TOTALpackageC){
            System.out.printf("You could have saved $%.2f with Package C%n" ,(TOTALpackageB - TOTALpackageC));
         }       
      }
      
      if (letter.equals("C")){
         System.out.printf("Your total charges this month: $%.2f%n" , TOTALpackageC); 
         if(TOTALpackageC >= TOTALpackageB){
            System.out.printf("You could have saved $%.2f with Package B%n" ,(TOTALpackageC - TOTALpackageB));
         }
         if(TOTALpackageC >= TOTALpackageA){
            System.out.printf("You could have saved $%.2f with Package A%n" ,(TOTALpackageC - TOTALpackageA));
         }         
      }
            //	System.out.printf("%-15s%6.2f%n","Meal Charge:",mealCharge);
   } // end main
   
}//end class ISPtest 
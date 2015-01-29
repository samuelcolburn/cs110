import java.util.Scanner;

// Sam Colburn
// CS 110
// 1-28-2015
// Internet Service Provider

public class ISP
{
   public static void main(String [] args)
  
    	// initialize scanner object for package letter
		Scanner inputHours = new Scanner(System.in);
      
      //get package letter
      System.out.print("Number of hours used: ");
		int hours = input.nextInt();
      
		// initialize scanner object for number of hours used
		Scanner inputLetter = new Scanner(System.in);
      String packageLetter = scan.nextLine();
		
		// get amount of hours
		System.out.print("Number of hours used: ");
		hours = input.nextInt();
      
      System.out.println(packageLetter);
      System.out.println(hours);
		
		
		//System.out.printf("%-15s%6.2f%n","Meal Charge:",mealCharge);
		//System.out.printf("%-15s%6.2f%n","Tax:",tax);
		//System.out.printf("%-15s%6.2f%n","Tip:",tip);
		//System.out.printf("%-15s%6.2f%n","Total:",total);
   }
   

    //PACKAGE A METHOD
      public double calculateA( int hours){
         int maxHours; //max hours before additional charges
         double monthtlyChargeA; //base cost per month if not above max hours
         double additionalHourlyCostA; //additional cost per hour if above max hours
         double totalCostA; //total cost for option A
         
         if(hours <= maxHours){
            totalCost = monthlyCharge;
            
         }
         else{
            totalCost = monthlyCharge + (maxHours-hours)*additionalHourlyCost;
         }
         
         return totalCost; 
                         
      }//end package A
   }   
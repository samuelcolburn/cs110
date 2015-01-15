import java.util.Scanner;

// Sam Colburn
// CS 110
// Restaurant tip calculator

public class RestaurantBill
{
   public static void main(String [] args)
	{
		// constants
		double TAX_RATE = 6.75;
		double TIP_RATE = 15;
		
      // declare variables
		double mealCharge, tax, tip, total;
		
		//create scanner object for input from keyboard
		Scanner input = new Scanner(System.in);
		
		// get amount of meal
		System.out.print("Charge for meal: ");
		mealCharge = input.nextDouble();
		
		//calculate tax
		tax = mealCharge * (TAX_RATE/100);
		
		//calculate tip
		tip = (mealCharge + tax) * (TIP_RATE/100);
		
		//calculate total
		total = mealCharge + tax + tip;
		
		System.out.printf("%-15s%6.2f%n","Meal Charge:",mealCharge);
		System.out.printf("%-15s%6.2f%n","Tax:",tax);
		System.out.printf("%-15s%6.2f%n","Tip:",tip);
		System.out.printf("%-15s%6.2f%n","Total:",total);
   }
   
}

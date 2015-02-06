/*
 Sam Colburn
 1-30-2015
 CS110

 5-8: Conversion Program 
 
   Write a program that asks the user to enter a distance in meters
 Convert into Kilometers, inches, or feet. 
 Display Converted distance.
 
 REQUIRMENTS: 
   -validate: negative numbers, invalid menu choices
   -display menu until quit
   
   void method showKilometers
      kilometers = meters * 0.001
   
   void method showInches
      inches = meters * 39.37
   
   void method showFeet
      feet = meters * 3.281
   
   void method menu


 NOTES:
 -no 'magic numbers'
-input and output using command prompt

*/ 

// import libraries
import java.util.Scanner;


//START CLASS ConversionProgram
public class ConversionProgram{

   //START METHOD main
   public static void main(String [] args){
   
      //Initialize variables
      double distance;
      
      //GET distance in meters
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number for the guess
      System.out.print("Enter a distance in meters: ");
      distance = keyboard.nextDouble();
      
      while (distance < 0){
         System.out.println("Distance cannot be negative.");
         System.out.print("Enter a distance in meters: ");
         distance = keyboard.nextDouble();
      }
      
      
      //RUN menu
      menu(distance);
      
      
     }//END METHOD main
    
  //START METHOD menu
  public static void menu(double distance){
      
      //initialize variables and constants
      int sentinal = 0;
      String choice;
      
      //menu loop
      do {
         //DISPLAY options
         System.out.println("1. Convert to kilometers");
         System.out.println("2. Convert to inches");
         System.out.println("3. Convert to feet");
         System.out.println("4. Quit the program");
         
         //GET user menu choice
         Scanner keyboard = new Scanner(System.in);
         System.out.print("\nEnter your choice: ");
         choice = keyboard.next();
         
         if (choice.equals("1")){
            showKilometers(distance);
         }
         else if(choice.equals("2")){
            showInches(distance);
         }
         else if(choice.equals("3")){
            showFeet(distance);
         }
         else if(choice.equals("4")){
            System.out.println("Bye!");
            sentinal = -99;
         }
         else {
            System.out.println("invalid choice");
         }
      }
      while (sentinal != -99);
  
  }
  //END METHOD menu
  
  
  //START METHOD showKilometers
  public static void showKilometers(double distance){
      
      //initialize constants and variables
      final double KILO_CONVERSION = 0.001;
      double kilometers;
      
      //calculate
      kilometers = distance * KILO_CONVERSION;
      
      //display result
      System.out.printf("%,.2f meters is %,.2f kilometers%n%n" , distance, kilometers);
  }
  //END METHOD showKilometers
  
  
  //START METHOD showInches
  public static void showInches(double distance){
  
      //initialize constants and variables
      final double INCHES_CONVERSION = 39.37;
      double inches;
      
      //calculate
      inches = distance * INCHES_CONVERSION;
      
      //display result
      System.out.printf("%,.2f meters is %,.2f inches%n%n" , distance, inches);
   
  }  
  
  //END METHOD showInches
  
  
  //START METHOD showFeet
  public static void showFeet(double distance){
  
      //initialize constants and variables    
      final double FEET_CONVERSION = 3.281;
      double feet;
      
      //calculate
      feet = distance * FEET_CONVERSION;
      
      //display result
      System.out.printf("%,.2f meters is %,.2f feet%n%n" , distance, feet);
  }  
  //END METHOD showFeet  

  
  
  
}//END CLASS ConversionmProgram
// Sam Colburn
// 1-30-2015
// CS110

// Assignment 3:Random Number Guess 
//Write a program that generates a random number
//Ask the user to guess the number, tell them if too high or too low. Give them a set number of attempts.

// If they guess correctly, display message and how many attempts it took
// If they run out of guesses, display message and the number.
 
//The program should convert all characters in the input file to uppercase and store them in the output fil.
// NOTES:
// -input and output using command prompt



// import libraries
import java.util.Scanner;
import java.util.Random;


//START CLASS RandomNumberGuess
public class RandomNumberGuess{

   //START METHOD main
   public static void main(String [] args){
   
      //initialize variables
      // CONSTANTS
      final int ATTEMPTS = 5;
      final int RANDOM_MAX = 100;
      final int SENTINAL = -99;
      final int sent;
      
      // Variables
      int num;
      int guess;
      int attemptCount;
      
      //GENERATE random number      
      Random rand = new Random();
      num = rand.nextInt(RANDOM_MAX) + 1;
      

      //DISPLAY Start message
      System.out.println("I'm thinking of a number between 1 and "+RANDOM_MAX);
      System.out.println("You have "+ATTEMPTS+" tries to guess it");
      System.out.println("Number is:"+num);
      
      // GET first user guess
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number for the guess
      System.out.print("Guess 1: ");
      guess = keyboard.nextInt();

      // Consume the remaining newline character.
      keyboard.nextLine();
      
      attemptCount =1;
      
      // CHECK guess vs. number
      while ((attemptCount < ATTEMPTS) ){
      
         if ( guess == num ) {
            System.out.println("Congratulations! You guessed it!");
            
            if (attemptCount ==1){
               System.out.println("You got it right on your first try!");
            }
            else {
               System.out.println("You got it right in "+ attemptCount +" guesses.");
            }
            attemptCount = ATTEMPTS;
         }
         
         else if ( guess > RANDOM_MAX){
            System.out.println("They don't go that high! It only goes to " + RANDOM_MAX + ".");
            System.out.print("Guess again: ");
            keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            attemptCount++;
         }   
         else if (guess < 1){
            System.out.println("That's way too low! The lowest it goes is 1.");
            System.out.print("Guess again: ");
            keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            attemptCount++;         
         }   

         
         
         
         else if (guess < num ){
            System.out.println("No, that's too low.");
            System.out.print("Guess again: ");
            keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            attemptCount++;
         }
         else if (guess > num) {
            System.out.println("Sorry, that's too high.");
            System.out.print("Guess again: ");
            keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            attemptCount++;
         } 
         
      }
    
     //DISPLAY fail message
     if (guess == num) {
         System.out.println("Congratulations! You guessed it!");
         System.out.println("You got it right in "+ attemptCount +" guesses.");
     }
     else {
     System.out.println("You are out of guesses.");
     System.out.println("I was thinking of the number " + num + ".");
     }
     
   }//END METHOD main
    
}//END CLASS  RandomNumberGuess
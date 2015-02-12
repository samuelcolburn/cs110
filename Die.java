import java.util.Random;   

/**
   Represents one die with faces showing values between 1 and the 
   number of faces on the die.
*/

public class Die
{
   private static int MIN_SIDES = 4; // no less than 4 sides on a die
   private int sides   ;   // The number of sides
   private int value;            // The value of the die
   private Random rand;          // Random number generator
   
   /**
      The Default constructor calls the roll method
      creates the Random object, sets number of sides to 6 and
      sets       the intitial value of the die to a random
      number.
    */
   
   public Die()
   {
      // create Random object
      rand = new Random();
      // set number of side on die
      sides = 6;
      // Call the roll method to randomly 
      // set the value of the die.
      roll();
   }
   /**
      Alternate constructor calls the roll allows user to specify
      number of side son die.  The method creates the Random object, 
      sets number of sides to value user specified and sets the intitial 
      value of the die to a random number.
      @param numSides The number of sides on the die
   */

    public Die(int numSides)
    {
      // create Random object
      rand = new Random();
      // set number of side on die
      sides = numSides;
      // Call the roll method to randomly 
      // set the value of the die.
      roll();
    }
   
   
    /**
      The roll method sets the value of the die
      to a random number.
     */
   
   
    

    public void roll()
    {
     
      // Set the value to a random number.
      value = rand.nextInt(sides) + 1;
    }
   
    /**
       The getValue method returns the value
      of the die.
    */
   
    public int getValue()
    {
      return value;
    }
}


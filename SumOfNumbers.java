import java.util.Scanner;

public class SumOfNumbers {

   public static void main(String[]args){
      
      int maxNum; //hold the upper limit
      int num; //hold a number
      int total = 0; //accumulator
      
      
      //create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //get a number from the user
      System.out.print("Enter a positive nonzero number: ");
      maxNum = keyboard.nextInt();
      
      //validate
      while (maxNum <=0){
         System.out.print("Enter a positive nonzero number: ");
         maxNum = keyboard.nextInt();
      
      }//while validate
      
      num = 1;
      
      while (num <= maxNum){
         total += num;
         num++;
      }//while count
      
      System.out.println("The sum of all the integers " + "from 1 through " + maxNum + " is " + total);
   
   }//main
   
}//class
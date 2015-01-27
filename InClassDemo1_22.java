import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// do while / while loops good for input validation
// for loop counting loop

public class InClassDemo1_22{

   public static void main(String[]args){
      
      int month;
      
      
      do {
         System.out.println("Please enter month: ");
         month = keyboard.nextInt();
         
         if (month < 1 || month > 12) 
            System.out.println("Invalid, try again");
      
      }//do 
      while (month < 1 || month > 12 ) { } //while
      
      
      int i;
      
      i = 1;
      
      for (int i=1 ; int j=1 ;i<=5 && j<=5; i++; j++){ //can put all modifers in 1 line for easy documentation
         System.out.println(j);
         }
      System.out.println(j); //WILL NOT WORK, j is only within the scope of the for loop, and does not exist outside that.
         
         
   }//main
}//InClassDemo1_22
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class InClassDemo1_20{

   public static void main(String[]args){
   
      //get input from dialog box
      Scanner s = new Scanner(System.in);
      int n;
      n = s.nextInt();
      boolean crazy;
      
      
      if (n>3) {
         crazy = true;
         System.out.println("are you crazy?");
         }
      else {
         crazy = false;
         if (n < 1){
            System.out.println("none?really?");
            }
         else {
            System.out.println("else statement");
            }
      }
      System.out.println(crazy);
          }
   
}

// logical operators
// == (equal)
// != (not equal)
// && (and)
// || (or)
//  if (! (n<5))   not operator

// value1.equals(value2) is a strict comparison ouput true or false. With strings, compares ASCII values.
// value1.compareTO(value2) displays the difference. 
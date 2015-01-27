/* Sam Colburn
CS 110
My first JAVA program
*/

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class MyFirstClass2{

   public static void main(String [] args){
   
      //create formatting object
      // "0.00' = force data. IE .5 = 0.50
      // "#.##' = show data if availabel ie .5 = .5 , will round to final digit: 1.789 = 1.79
      // formatting will not remove significant digits ie 123.123 will never become 1.123
      DecimalFormat formatter;
      formatter = new DecimalFormat("0.00");
   
      //get input from dialog box
      String z;
      
      double num;
          
      num  = 12345.435;
      
      z = formatter.format(num);
      
     // s=JOptionPane.showInputDialog("How many pets do you have?");
      
      
      
      //num = Double.parseDouble(s);
      
      //num++;
      
      //echo it as a string
   
     //display output to message box
     //conccat strings if more needed "x = " + x
     JOptionPane.showMessageDialog(null,z);
     
     
     //dialog boxes make system not close properly, must manually close
     System.exit(0);
   }
}
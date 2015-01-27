import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class NestedLoop{

   public static void main(String[]args){
      for(int i =1; i<10 ; i+=3){
         for(int j =2 ; j <= 8 ; j +=2)
         System.out.println(i + ","+j);
      }

   }
   
}
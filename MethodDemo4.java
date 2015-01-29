// Jackie Horton
// CS110 Method examples
import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodDemo4
{
   // required main method, execution always begins in main
   public static void main(String [] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      
      DecimalFormat formatter = new DecimalFormat(".00");

      double length,width;
      System.out.print("Length? ");
      length = keyboard.nextDouble();
      System.out.print("Width? ");
      width = keyboard.nextDouble();
      
      double area;
      area = calcArea(length,width);
      System.out.println("The area is " + formatter.format(area));

    
   }
   // method caclArea calculates and returns area of a rectangle
   // given the length and width
   // @param length the length of the rectangle
   // @param width the width of the rectangle
   // @return the area of the rectangle
   
   public static double calcArea(double length, double width)
   {

      double area = length * width;
      return area;
            
   }
}


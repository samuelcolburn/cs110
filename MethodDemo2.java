// Jackie Horton
// CS110 Method examples
import java.util.Scanner;
import java.text.DecimalFormat;
public class MethodDemo2
{
   // required main method, execution always begins in main
   public static void main(String [] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      double radius;
      System.out.print("Radius? ");
      radius = keyboard.nextDouble();
      displayArea(radius);
    
   }
   // method displayArea calculates and displays area of a circle
   // given a radius
   // @param r the radius of the cirlce
   public static void displayArea(double r)
   {
      DecimalFormat formatter = new DecimalFormat(".00");

      double area = Math.PI * r * r;
      System.out.println("The area is " + formatter.format(area));
      
   }
}


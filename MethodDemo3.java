// Jackie Horton
// CS110 Method examples
import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodDemo3
{
   // required main method, execution always begins in main
   public static void main(String [] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      
      DecimalFormat formatter = new DecimalFormat(".00");

      double radius;
      System.out.print("Radius? ");
      radius = keyboard.nextDouble();
      double area;
      area = calcArea(radius);
      System.out.println("The area is " + formatter.format(area));

    
   }
   // method caclArea calculates and returns area of a circle
   // given a radius
   // @param r the radius of the circle
   // @return the area of the circle
   public static double calcArea(double r)
   {

      double area = Math.PI * r * r;
      return area;
            
   }
}


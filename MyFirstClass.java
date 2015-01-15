/* Sam Colburn
CS 110
My first JAVA program
*/

import java.util.Scanner;

public class MyFirstClass{

   public static void main(String [] args){
   
      int x;
      x = 5;
      Scanner s;
      s = new Scanner(System.in);
      x = s.nextInt();
      int y = s.nextInt();
      
      int z;
      z = 10;
      z += 2;
      
      x = ++z;
      
      System.out.println(x);
      
      z = 10;
      y = z++;
      System.out.println(x);
      //System.out.println(y);



   }
}
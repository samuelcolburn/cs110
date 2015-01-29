import java.util.Scanner;
import java.io.*;



/**
   This program demonstrates a solution to the
   Line Numbers programming challenge.
*/

public class ReadGrades
{
   public static void main(String[] args) throws IOException
   {
      String filename;     // The name of the file
      double input;        // To hold file input
      double total = 0;       // running total
      int count = 0;       // number of grades

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
             
      // Get the file name.
      System.out.print("Enter the file name: ");
      filename = keyboard.nextLine();
      
      // Open the file.
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      while (inFile.hasNext())
      {
         input = inFile.nextDouble();
         total += input;
         count++;
      }
      System.out.printf("There were %d grades and the average was %.2f\n",count,total/count);
      // Close the file.
      inFile.close();
   }
}
import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File class

/**
   This program reads the first line from a file.
*/

public class ReadAllLines
{
   public static void main(String[] args) throws IOException
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the file name.
      System.out.print("Enter the name of a file: ");
      String filename = keyboard.nextLine();

      // Open the file.
      //File file = new File(filename);
      //Scanner inputFile = new Scanner(file);
      
      Scanner inputFile = new Scanner(new File(filename));
      
      while (inputFile.hasNext( ) )
      {
      	String friendName = inputFile.nextLine();
      	System.out.println(friendName);
      }


      // Close the file.
      inputFile.close();
   }
}
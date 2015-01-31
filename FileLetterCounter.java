// Sam Colburn
// 1-30-2015
// CS110

// 4-6: File Letter Counter 
//Write a program that asks the user to enter the name of a file, 
//and then asks the user to enter a character. 
//The program should count and display the number of times that the specified character appears in the file.
// NOTES:
// -Character is case sensitive
// -input and output using JOptionPane



// import libraries
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.io.*;


//START CLASS FileLetterCounter
public class FileLetterCounter{

   //START METHOD MAIN
   public static void main(String [] args)throws IOException{
   
      //initialize variables
      String filename;  //filename input by user
      String input;     //input for each line of the file
      String character;    //character you are counting in the file
      int count;  //count of the character in the file
   
   
      //GET the file name 
      Scanner inputfilename = new Scanner(System.in);
      System.out.print("Enter the filename: ");
      filename = inputfilename.nextLine();
      
      //GET the character they want
      Scanner inputcharacter = new Scanner(System.in);
      System.out.print("Enter Character to count: ");
      character = inputcharacter.nextLine();
       
      
      //OPEN the file
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      count = 0;
      while (inFile.hasNext())
      {
         input = inFile.charAt();
         
         System.out.print(input+" ");
         
         if(input.equals(character)){
            
            count ++;
         }
         
      }
      
      
      System.out.println("~~~~~~~~~");
      System.out.println("Done.");
      System.out.println("Total number of character "+character+": "+count);
      // Close the file.
      inFile.close();
   
      
     
      
     
      
      //READ the file for the character, add to counter each time
      
      //DISPLAY count of that character
      
   
   
   }//END METHOD MAIN
    
}//END CLASS FileLetterCounter
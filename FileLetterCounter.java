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
import java.io.*;


//START CLASS FileLetterCounter
public class FileLetterCounter{

   //START METHOD main
   public static void main(String [] args)throws IOException{
   
      //initialize variables
      String filename;  //filename input by user
      String input;     //input for each line of the file
      String character;    //character you are counting in the file
      int count;  //count of the character in the file
   
   
      //GET the file name 
      filename = JOptionPane.showInputDialog ("Enter the filename: ");
      
      //GET the character they want
      character = JOptionPane.showInputDialog ("Enter the character to count: ");
      //Convert string input into char primitive
      char letter = character.charAt(0);

      
      //OPEN the file
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      //initialize the count to zero
      count = 0;
      
      //loop through the file until it ends
      while (inFile.hasNext()){
         input = inFile.nextLine();
         
         //for each line of the file, check the string at each index value. If its == to the input letter, up the count
         for(int i=0 ; i != input.length() ; i++) {
         
            char check = input.charAt(i);
            
            if (check == letter) {
               count ++;
            } //end if
         }// end for loop
      }//end while loop
      
      // Close the file.
      inFile.close();
   
      //DISPLAY count of that character
      //System.out.println("Total number of character "+character+": "+count);
      JOptionPane.showMessageDialog(null,"Total number of character '"+character+"': "+count);

   }//END METHOD main
    
}//END CLASS FileLetterCounter
// Sam Colburn
// 1-30-2015
// CS110

// 4-15:Upper Case File Converter 
//Write a program that asks the user to enter the name of an input file, 
//Write a program that asks the user to enter the name of an output file, 
 
//The program should convert all characters in the input file to uppercase and store them in the output fil.
// NOTES:
// -input and output using JOptionPane



// import libraries
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;


//START CLASS UpperCaseFileConverter
public class UpperCaseFileConverter{

   //START METHOD main
   public static void main(String [] args)throws IOException{
   
      //initialize variables
      String inFileName;
      String outFileName;
      String input;
      String output;

   
   
      //GET the file names 
      inFileName = JOptionPane.showInputDialog ("Enter the input file name: ");
      outFileName = JOptionPane.showInputDialog ("Enter the output file name: ");   
         


      
      //OPEN the input file
      File inputFile = new File(inFileName);
      Scanner inFile = new Scanner(inputFile);
      
      // Open output the file.
      PrintWriter outFile;
      outFile = new PrintWriter(outFileName);
      
      
      //loop through the file until it ends
      while (inFile.hasNext()){
      
         input = inFile.nextLine();
         
         output = input.toUpperCase();
         
         outFile.println(output);

      }//end while loop
      
      // Close the files.
      inFile.close();
      outFile.close();
      
   
      //DISPLAY message of completion.
      JOptionPane.showMessageDialog(null,"Done");

   }//END METHOD main
    
}//END CLASS UpperCaseFileConverter
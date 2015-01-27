import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


import java.io.*;

public class Files{
      //method
      // void = no output
      // inside () = things it needs
      // main(); calls a method
      // main is automatically invoked
      // 
      public static void main(String [] args) throws IOException {
         
         String filename; // file name
         String friendName; //friends name
         int numFriends;  //num friends
         
         // create scanner object for keyboard input
         Scanner keyboard = new Scanner(System.in);
         
         // get num of friends
         System.out.print("How many firneds?");
         numFriends = keyboard.nextInt();
         
         // consume renamining newline character
         keyboard.nextLine();
         
         
         // get the file anme
         System.out.print("filoename:");
         filename = keyboard.nextLine();
         
         
         // declare output file object
         PrintWriter outputFile;
         PrintWriter outputFile = new PrintWriter(filename);
         
         
         
         for (int i = 1; i <= numFriends; i++) {
            
            // ask for the name of each friend
            System.out.print("enter friend " + i +": ");
            
            friendName = keyboard.nextLine();
            
            // write the name to the file
            outputFile.println(friendName);
  
  
         }
  
  
         outputFile.close(); 
  
  
  
   }
} 
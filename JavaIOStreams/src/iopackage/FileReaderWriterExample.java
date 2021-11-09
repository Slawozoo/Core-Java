package iopackage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriterExample {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		String strs = "Enter the string to be added in the file: ";
		System.out.println(strs);
		String str = scn.nextLine();
		
		String string = strs.concat(str);
		
		 File file = new File("Examples.txt");
	      
	      // creates the file
	      file.createNewFile();
	      
	      // creates a FileWriter Object
	      FileWriter writer = new FileWriter(file); 
	      
	      // Writes the content to the file
	      writer.write(string); 
	      writer.flush();
	      writer.close();

	      // Creates a FileReader Object
	      FileReader fr = new FileReader(file); 
	      char [] a = new char[500];
	      fr.read(a);   // reads the content to the array
	      
	      for(char c : a)
	         System.out.print(c);   // prints the characters one by one
	      fr.close();

	}

}

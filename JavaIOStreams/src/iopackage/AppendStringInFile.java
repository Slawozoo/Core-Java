package iopackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendStringInFile {

	public static void write(String str, File file, String s) throws IOException{
		FileWriter fw = new FileWriter(file);	//creating filewriter object
		
		fw.write(str);	//writing string in the file
		
		//appending
		char ch[] = s.toCharArray();
		for(int i =0; i<ch.length;i++) {
			fw.append(ch[i]);
		}
		
		fw.close();
		System.out.println("sucess....!!!!!");
		
	}
	
	public static void main(String[] args) throws IOException {
		try{
			File file = new File("src\\iopackage\\Append.txt");
			String str = "Enter the elements to enter in the file: ";
			System.out.println(str);
			Scanner scn = new Scanner(System.in);
			String string = scn.nextLine();
			write(str,file, string);

		}
		catch(IOException e) {
			System.out.println("Exception: "+e);
		}
	}

}

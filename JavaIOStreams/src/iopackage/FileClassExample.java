package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileClassExample {

	public static void main(String[] args) {
			File f = null;
	      String[] strs = {"test1.txt", "test2.txt"};
//	      Scanner scn = new Scanner(System.in);
//	      int n;
//	      System.out.print("Enter the no. of file to be created: ");
//	      n = scn.nextInt();
	      try {
	         // for each string in string array 
	         for(String s:strs ) {
	            // create new file
	            f = new File(s);
	            FileOutputStream fout=new FileOutputStream(f);
	            
	            // true if the file is executable
	            boolean bool = f.canExecute();
	            
	            // find the absolute path
	            String a = f.getAbsolutePath(); 
	            
	            // prints absolute path
	            System.out.print(a);
	            
	            // prints
	            System.out.println(" is executable: "+ bool);
	            
	           
	         } 
	         FileOutputStream fout=new FileOutputStream("test1.txt");  //writing in the file
	         String s="Hello World from top of the world";    
	         byte b[]=s.getBytes();//converting string into byte array
	         fout.write(b);
	         
	         FileInputStream fin=new FileInputStream("test1.txt");    //reading from the file
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();   
	            fout.close();
	         
	      } catch (Exception e) {
	         // if any I/O error occurs
	         e.printStackTrace();
	      }
	}

}

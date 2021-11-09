package iopackage;
import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		try{    
            FileOutputStream fout=new FileOutputStream("src\\iopackage\\example.txt");    
            int data = 97;
            String s="Hello World from top of the world";    
            byte b[]=s.getBytes();//converting string into byte array
            
            fout.write(data);
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }
		catch(Exception e){
			System.out.println(e);
			}    
		
		
	}

}

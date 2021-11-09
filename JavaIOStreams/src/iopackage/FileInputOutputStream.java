package iopackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		try {
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the no of array: ");
			int n = scn.nextInt();
			int []bWrite = new int[n];
			System.out.println("Enter the elements of array: ");
			for(int i =0; i< n;i++) {
				//byte input = scn.nextByte();
				//if(input >= 65 && input < 90 && input>= 97 && input< 122) {	//for alphabets
					
					bWrite[i] = scn.nextInt();
//				}
//				else{
//					i = i-1;
//				}
			}
			OutputStream os = new FileOutputStream("src\\iopackage\\test.txt");
			for (int x = 0; x < n; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();

			InputStream is = new FileInputStream("src\\iopackage\\test.txt");
			int size = is.available();

			for (int i = 0; i < size; i++) {
				System.out.print((char) is.read() + "  ");
			}
			is.close();
		} catch (Exception e) {
			System.out.print("Exception");
		}

	}

}

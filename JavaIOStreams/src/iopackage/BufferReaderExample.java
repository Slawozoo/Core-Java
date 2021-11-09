package iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            //Bufferreader reads text from a character stream with efficiency (characters are buffered to avoid frequently reading from the underlying stream) 
            //and provides a convenient method for reading a line of text readLine()
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

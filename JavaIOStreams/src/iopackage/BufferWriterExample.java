package iopackage;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileOutputStream outputStream = new FileOutputStream("BufferStream.json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
             
            bufferedWriter.write("This includes BufferWriter example with first sentence");
            bufferedWriter.newLine();
            bufferedWriter.write("Hẹn gặp lại!\nThis is the second sentence for BufferWriter example.");
             
            bufferedWriter.close();
            System.out.println(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

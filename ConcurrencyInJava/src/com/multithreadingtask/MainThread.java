package com.multithreadingtask;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class MainThread {
	public static void main(String [] args) {
		File file = new File("authors.json");
		File file2 = new File("authors2.json");
		List <File> listFile = new ArrayList<>();
		listFile.add(file);
		listFile.add(file2);
		
		// loop list file
		//	i=0;i<listFile.size();i++
		//read one file from one thread
		//FileThread fileThread = new FileThread(listFile.get(0).getAbsoluteFile());
		
		//Use thread to run
		long multiThreadingStartTime = System.currentTimeMillis();
		for(int i =0; i< listFile.size();i++) {
			FileThread fileThread = new FileThread(listFile.get(i).getAbsoluteFile());
			fileThread.start();
		}
		long multiThreadingEndTime = System.currentTimeMillis();
		System.out.println("Total time taken by multi thread: "+(multiThreadingEndTime-multiThreadingStartTime));
		
		
		//Use to run loop
		long singleThreadingStartTime = System.currentTimeMillis();
		for(int i =0 ; i< listFile.size(); i++) {
			System.out.println("Reading from file: "+listFile.get(i).getAbsoluteFile());
			ReadJSONFile readFile = new ReadJSONFile();
			try {
				readFile.readFile(listFile.get(i).getAbsoluteFile());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long singleThreadingEndTime = System.currentTimeMillis();
		System.out.println("Total time taken by single thread: "+(singleThreadingEndTime-singleThreadingStartTime));
		
		
		
	}
}

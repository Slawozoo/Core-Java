package com.multithreadingtask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileThread implements Runnable {
	public Thread t;
	private File file;
	private List<File> fileList = new ArrayList<>();

	public FileThread(File file) {
		this.file = file;
	}

	@Override
	public void run() {
		// System.out.println("Running " + threadName);
		// for(int i =0; i< fileList.size(); i++) {
		// System.out.println("Thread- "+i);
		System.out.println("Reading from file: " + file.getName());
		ReadJSONFile readFile = new ReadJSONFile();
		try {
			long readFileStartTime = System.currentTimeMillis();
			readFile.readFile(file);
			long readFileEndTime = System.currentTimeMillis();
			System.out.println("Total time for single file: " + (readFileEndTime - readFileStartTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void start() {

		System.out.println("Starting " + file.getName());

		if (t == null) {
			t = new Thread(this, file.getName());
			t.start();
			try {
				t.sleep(0);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}

package com.mavenproject;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;

import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  

public class App {
	
	public String apps() {
		return "App Maven Project";
	}
	public int add(int n, int m) {
		return n+m;
	}
	private static final Logger logger = LogManager.getLogger(App.class);  
	public static void main(String[] args) {
		// basic log4j configurator  
		 BasicConfigurator.configure(); 
		App app = new App();
		int result;
		result = app.add(7, 8);
		String str = app.apps();
		System.out.println("Result : "+result);
		logger.info("Result :"+result);
		
		//setting levels in log4j
		logger.trace("Trace Message!");
		logger.warn("Warn Message!");
		
	}


}

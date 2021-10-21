package com.mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.util.logging.SimpleFormatter;


public class AppLoggerUsingUtil {
	    public static void main(String[] args)
	    {
	  
	        // Create a Logger
	        Logger logger
	            = Logger.getLogger(
	                AppLoggerUsingUtil.class.getName());
	  
	        // log messages using
	        // log(Level level, String msg, Object[] param1)
	        logger.log(Level.INFO, "logging: {0} {1}",
	                   new Object[] { "parameter1", "parameter2" });
	        logger.log(Level.WARNING, "logging: {0} {1} {2}",
	                   new Object[] { "p1", "p2", "p3" });
	    }

}

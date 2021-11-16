package com.regexexamples;
import java.util.regex.*;

public class RegexMatches {

	public static void main(String[] args) {
		
		// String to be scanned to find the pattern.
	      String line = "QT3000! 6545646595 sdasd  ddsasda s";
	      String pattern = "(.*)(\\d+)(.*)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	    	  int count =m.groupCount();
	    	  System.out.println(count);
	         System.out.println("Found value: " + m.group() );
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(2) );
	      }else {
	         System.out.println("NO MATCH");
	      }
	}

}

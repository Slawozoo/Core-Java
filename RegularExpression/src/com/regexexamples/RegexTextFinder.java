package com.regexexamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTextFinder {

	//Matches the word boundaries when outside the brackets. Matches the backspace (0x08) when inside the brackets.
	 private static final String REGEX = "\\bHello Java\\b";	
	 
	 private static final String LOOKINGREGEX = "foo";
	 private static final String INPUT = "ofooo fooooooooooooooooo";
	 private static Pattern patternLook;
	   
	   
	public static void main(String[] args){    
        Scanner sc=new Scanner(System.in);  
        while (true) {    
            System.out.println("Enter regex pattern:");  
            Pattern pattern = Pattern.compile(REGEX);    
            System.out.println("Enter text:");  
            Matcher matcher = pattern.matcher(sc.nextLine());    
            boolean found = false;    
            while (matcher.find()) {    
                System.out.println("I found the text "+matcher.group()+" starting at index "+    
                 matcher.start()+" and ending at index "+matcher.end());    
                found = true;    
            }    
            if(!found){    
                System.out.println("No match found.");    
            }    
        } 
//        RegexTextFinder.patternLook = Pattern.compile(LOOKINGREGEX);
//        Matcher matcherMatch = patternLook.matcher(INPUT);
//
//        System.out.println("Current REGEX is: "+LOOKINGREGEX);
//        System.out.println("Current INPUT is: "+INPUT);
//
//        System.out.println("lookingAt(): "+matcherMatch.lookingAt());
//        System.out.println("matches(): "+matcherMatch.matches());
    }    
}

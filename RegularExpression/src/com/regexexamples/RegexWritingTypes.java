package com.regexexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWritingTypes {

	public static void main(String args[]){  
		//1st way  
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile("..s").matcher("ads").matches();  //3 character with s ending
		  
		//3rd way  
		boolean b3 = Pattern.matches(".s", "as");  //two characters with s ending
		  
		System.out.println(b+" "+b2+" "+b3);  
		}
}

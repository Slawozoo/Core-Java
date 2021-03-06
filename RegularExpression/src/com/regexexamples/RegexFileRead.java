package com.regexexamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFileRead {
	private static Pattern emailNamePtrn = Pattern
			.compile("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	private static Pattern contactPtrn = Pattern.compile("^contact: [9][0-9]{9}$");
	
	private static Pattern namePattern = Pattern.compile("^Developer Name: ([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$");
//	private static Pattern namePattern = Pattern.compile("(?<=Developer Name: ).*");
	
	
	public static boolean validateEmailAddress(String userName) {

		Matcher mtch = emailNamePtrn.matcher(userName);
		if (mtch.matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean validateContact(String contact) {

		Matcher match = contactPtrn.matcher(contact);
		if (match.matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean validateName(String name) {

		Matcher match = namePattern.matcher(name);
		if (match.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		try {
			File myObj = new File("regex_read_file.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine() ) {
				String data = myReader.nextLine();
				//System.out.println(data);
				
				if(RegexFileRead.validateEmailAddress(data)) {
					//System.out.println("The email id are: "+data);
					System.out.println(data);
				}
				if(RegexFileRead.validateContact(data)) {
//					System.out.println("The contact numbers are: "+data);
					System.out.println(data);
				}
				if(RegexFileRead.validateName(data)) {
//					System.out.println("Name: "+data);
					System.out.println(data);
				}
				
				
			}
			myReader.close();
		}
	catch(FileNotFoundException e)
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
}
}

package com.regexexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPatternMatchCaseInsensitive {

	public boolean isPatternMatching(String line) {

		Pattern ptn = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher mtch = ptn.matcher(line);
		if (mtch.find()) {
			return true;
		}
		return false;
	}

	private static Pattern emailNamePtrn = Pattern
			.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	public static boolean validateEmailAddress(String userName) {

		Matcher mtch = emailNamePtrn.matcher(userName);
		if (mtch.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String a[]) {
		MyPatternMatchCaseInsensitive msp = new MyPatternMatchCaseInsensitive();
		System.out.println(msp.isPatternMatching("This line contains java, lets see")); // true
		System.out.println(msp.isPatternMatching("Here JAVA is in capital leters, lets see")); // true
		System.out.println(msp.isPatternMatching("Here C++ is in capital leters, lets see")); // false

		// For email id validation
		System.out.println(
				"Is 'javajava@gmail.com' a valid email address? " 
		+ validateEmailAddress("java2novice@gmail.com"));
		System.out.println(
				"Is 'cris*7*&@yahoo.com' a valid email address? " 
		+ validateEmailAddress("cric*7*&@yahoo.com"));
		System.out.println(
				"Is 'JAVA2NOVICE.gmail.com' a valid email address? " 
		+ validateEmailAddress("JAVA2NOVICE.gmail.com"));

	}

}

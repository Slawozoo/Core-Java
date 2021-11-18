package com.regextask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
	private static Pattern emailNamePtrn = Pattern
			.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	private static Pattern contactPtrn = Pattern.compile("(?<=contact: ).*");

	 private static Pattern namePattern = Pattern.compile("^Developer Name: ([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$");
//	private static Pattern namePattern = Pattern.compile("(?<=Developer Name: ).*");
	 // (?<=Developer Name: ) : except this inside the '()'

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File myObj = new File("regex_read_file.txt");
			Scanner myReader = new Scanner(myObj);

			// emp list
			List<Employee> listEmp = new ArrayList<>();
			Employee emp = new Employee();
			while (myReader.hasNext()) {
				String data = myReader.nextLine();
				

				Matcher matcherName = namePattern.matcher(data);
				Matcher matcherContact = contactPtrn.matcher(data);
				Matcher matcherEmail = emailNamePtrn.matcher(data);

				// if match set in emp

				// similarly match email pattern and contact pattern
				// if match set in emp

				// add name , contact ,email in emp
				// add employee in list

				// System.out.println(data);
				if (matcherName.find()) {

					String matchedName = matcherName.group();

					emp.setName(matchedName);
				}

				if (matcherEmail.find()) {
					String matchedEmail = matcherEmail.group();

					emp.setEmail(matchedEmail);
				}

				if (matcherContact.find()) {
					String matchedContact = matcherContact.group();

					emp.setContact(matchedContact);
				}
				// Employee emp = new Employee(matchedName, matchedEmail, matchedContact);
				
				if(emp.getName()!= null && emp.getContact()!= null && emp.getEmail()!=null) {
					listEmp.add(emp);
					emp = new Employee();
				}
				
			}
			

			Iterator itr = listEmp.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}

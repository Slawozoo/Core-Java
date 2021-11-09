package oopfiletask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainWriteJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. of list: ");
		int n = scn.nextInt();
		List<Author> authList = new ArrayList<Author>(n);
		File file = new File("author.json"); // Json file where all written output stored
		for (int i = 0; i < n; i++) {
			Author auth = new Author();
			System.out.print("Enter First name of author: ");
			auth.setfName(scn.next());
			System.out.print("Enter Last name of author: ");
			auth.setlName(scn.next());
			System.out.print("Enter Address of author: ");
			auth.setAddress(scn.next());
			System.out.print("Enter Email of author: ");
			auth.setEmail(scn.next());
			System.out.print("Enter Institution of author: ");
			auth.setInstitution(scn.next());

			// setting FUll name of author
			// System.out.print("Full name of author: ");
			auth.setName(auth.getfName(), auth.getlName());

			authList.add(auth);

		}

		// Json started from here
		JSONArray jsonList = new JSONArray();
		// Creating a JSONObject object
		for (int i = 0; i < n; i++) {
			JSONObject jsonObject = new JSONObject();
			// Inserting key-value pairs into the json object
			jsonObject.put("Name", authList.get(i).getName());
			jsonObject.put("FirstName", authList.get(i).getfName());
			jsonObject.put("LastName", authList.get(i).getlName());
			jsonObject.put("Address", authList.get(i).getAddress());
			jsonObject.put("Email", authList.get(i).getEmail());
			jsonObject.put("Institution", authList.get(i).getInstitution());

			JSONObject authorObject = new JSONObject();
			authorObject.put("Author", jsonObject);

			jsonList.add(authorObject);

		}

		try {
			FileWriter file1 = new FileWriter(file);
			file1.write(jsonList.toJSONString());
			file1.close();
			// System.out.println(jsonObject);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("JSON file created: " + jsonList);

	}

}

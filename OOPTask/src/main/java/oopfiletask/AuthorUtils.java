package oopfiletask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//For author
public class AuthorUtils {
	List<Author> authors = new ArrayList<Author>();
	//JSONArray authArray = new JSONArray();
	int m;
	
	Scanner scn = new Scanner(System.in);

	public int initM(int in) {
		int n = in;
		return n;
	}

	@SuppressWarnings("unchecked")
	public void addAuthor() {
		// Scanner scn = new Scanner(System.in);
		m = scn.nextInt();
		int in = initM(m);
		// List <Author> authors = new ArrayList<Author>();
		for (int j = 0; j < m; j++) {
			// for(Author auth: authors) {
			Author author = new Author();
			System.out.print("Enter first name of author: ");
			author.setfName(scn.next());
			System.out.print("\nEnter last name of author: ");
			author.setlName(scn.next());

			author.setName(author.getfName(), author.getlName());
			// author.setName(author.getfName().concat(author.getlName()));

			System.out.print("\nEnter address of author: ");
			author.setAddress(scn.next());
			System.out.print("\nEnter email of author: ");
			author.setEmail(scn.next());
			System.out.print("\nEnter institution of author: ");
			author.setInstitution(scn.next());

			authors.add(author); // authors : authorList
		}
	}
		
		
		public static JSONArray generateAuthorJson(List<Author> authors) {
			// Json starts from here
			JSONArray jsonList = new JSONArray();
			// Creating a JSONObject object
			for (int i = 0; i < authors.size(); i++) {
				JSONObject jsonObject = new JSONObject();
				// Inserting key-value pairs into the json object
				jsonObject.put("Name", authors.get(i).getName());
				jsonObject.put("FirstName", authors.get(i).getfName());
				jsonObject.put("LastName", authors.get(i).getlName());
				jsonObject.put("Address", authors.get(i).getAddress());
				jsonObject.put("Email", authors.get(i).getEmail());
				jsonObject.put("Institution", authors.get(i).getInstitution());

				//JSONObject authorObject = new JSONObject();
				
				//authorObject.add( jsonObject);
				
				jsonList.add(jsonObject);

			}
			
			return jsonList;
		}
		
//		System.out.println("JSON file created: " + jsonList);
		public static void writeJsonFile(JSONArray jsonList, File file) {
			try {
				FileWriter file1 = new FileWriter(file);
				file1.write(jsonList.toJSONString());
				file1.close();
				// System.out.println(jsonObject);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		


}

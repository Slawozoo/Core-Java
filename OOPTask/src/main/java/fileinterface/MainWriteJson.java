package fileinterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainWriteJson {

	
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. of list: ");
		int n = scn.nextInt();
		List<Author> authList = new ArrayList<Author>(n);
		File file = new File("AuthorInterface.json"); // Json file where all written output stored
		
		// user input for author {fnam, lname, ....}
		UserInput input = new UserInput();
		input.userFromUser(n,authList);


		// Writing on Json file started from here
		JSONArray jsonList = new JSONArray();
		SaveAuthor saveAuthor = new SaveAuthor();
		saveAuthor.doSaveAuthor(n, file,jsonList, authList);

	}

}

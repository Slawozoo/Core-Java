package ooptasklist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddAuthorList {
	List <Author> authors = new ArrayList<Author>();
	int m;
	
	Scanner scn = new Scanner(System.in);
	
	public int initM(int in){
		int n = in;
		return n;
	}
	
	
	public void addAuthor() {
		//Scanner scn = new Scanner(System.in);
		m = scn.nextInt();
		int in = initM(m);
		//List <Author> authors = new ArrayList<Author>();
		for(int j = 0; j < m;j++) {
		//for(Author auth: authors) {
			Author author = new Author();
			System.out.print("Enter first name of author: ");
			author.setfName(scn.next());
			System.out.print("\nEnter last name of author: ");
			author.setlName(scn.next());
			
			author.setName(author.getfName().concat(author.getlName()));
			
			System.out.print("\nEnter address of author: ");
			author.setAddress(scn.next());
			System.out.print("\nEnter email of author: ");
			author.setEmail(scn.next());
			System.out.print("\nEnter institution of author: ");
			author.setInstitution(scn.next());
		
			authors.add(author);
		}
	}
}

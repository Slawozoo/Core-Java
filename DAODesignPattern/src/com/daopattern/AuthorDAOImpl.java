package com.daopattern;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorDAOImpl implements IAuthorDAO {

	List<Author> authorList;
	Scanner scn = new Scanner(System.in);

	public AuthorDAOImpl() {
		
		}
	

	@Override
	public List<Author> getAllAuthor() {

		return authorList;
	}

	@Override
	public Author getAuthor(int id) {

		return authorList.get(id);
	}

	@Override
	public void updateAuthor(Author newAuthor, int index) {
		//Find exsiting author and its index
//		while()
		// user input name
		System.out.print("Enter first name to update:");
		String firstName = scn.next();
		newAuthor.setfName(firstName);
		System.out.print("Enter last name to update:");
		String lastName = scn.next();
		newAuthor.setlName(lastName);
		System.out.print("Enter address to update:");
		newAuthor.setAddress(scn.next());
		System.out.print("Enter email to update:");
		newAuthor.setEmail(scn.next());
		System.out.print("Enter institution to update:");
		newAuthor.setInstitution(scn.next());
		
		newAuthor.setName(firstName, lastName);
				
		authorList.set(index, newAuthor);
		System.out.println("Update sucessful...\nUpdate list is: ");
		//System.out.println(newAuthor.toString());
		authorList = getAllAuthor();
		Iterator itr = authorList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
					//loop and search author from authorList -> existing author
		//set new Author to the index
					//authorList.set(index, newAuthor);
		
		//print value of newAuthor
		

		
	}

	@Override
	public void deleteAuthor(int index) {
		
		authorList.remove(index-1);

		authorList = getAllAuthor();
		Iterator itr = authorList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//authorList.remove(author.getId());
		//Find exsiting author and its index
				// user input name
						//loop and search author from authorList -> existing author
		//remove from authorList

	}

	@Override
	public void getUserInput(int n) {
		authorList = new ArrayList<>(n);
//		Author author = new Author();
		for (int i = 0; i < n; i++) {
			Author author = new Author();
//			System.out.println("Enter id of author: ");
//			author.setId(scn.nextInt());
			System.out.print("Enter first name: ");
			String firstName = scn.next();
			author.setfName(firstName);
			System.out.print("Enter last name: ");
			String lastName = scn.next();
			author.setlName(lastName);
			System.out.print("Enter email : ");
			author.setEmail(scn.next());
			System.out.print("Enter address : ");
			author.setAddress(scn.next());
			System.out.print("Enter institution name: ");
			author.setInstitution(scn.next());
			
			author.setName(firstName, lastName);

			authorList.add(author);
		}
		
	}

}

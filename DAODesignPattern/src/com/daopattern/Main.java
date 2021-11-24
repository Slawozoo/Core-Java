package com.daopattern;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("The no. of elements in the list: ");
		int n = scn.nextInt();

		IAuthorDAO authorDAOImpl = new AuthorDAOImpl();

		authorDAOImpl.getUserInput(n);

		// for all author
		List<Author> listAuthor = authorDAOImpl.getAllAuthor();
		Iterator itr = listAuthor.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Enter operation you want to perform: Get | update | delete");
		String cases = scn.next();
		switch (cases) {
		case "get":
			// for author using id: no need of loop as search by index
//				authorDAOImpl.getAuthor(1);	//gives author in first index that is 2nd of list

			// for search using name or any other need loop
			System.out.println("Enter the name of author you want to search: ");
			String searchName = scn.next();
			for (int i = 0; i < listAuthor.size(); i++) {
				if (searchName.equalsIgnoreCase(listAuthor.get(i).getName())) {
					Author auth = authorDAOImpl.getAuthor(i);
					System.out.println("Name: " + auth.getName() + "\tEmail :" + auth.getEmail() + "\tAddress: "
							+ auth.getAddress() + "\tInstitution: " + auth.getInstitution());
				}

			}

			break;

		case "update":
			System.out.println("Enter the index of list to update: ");
			int update = scn.nextInt();
			for (int i = 1; i <= listAuthor.size(); i++) {
				if (i == update) {
					authorDAOImpl.updateAuthor(new Author(), i);
				}

			}

			break;

		case "delete":
			System.out.println("Enter the index of list to delete: ");
			int delete = scn.nextInt();
			if (listAuthor.get(delete) != null) {
				authorDAOImpl.deleteAuthor(delete);

			}

			break;

		default:
			System.out.println("Invalid case choosed.!!!!!\nPlease choose valid case.");

		}
	}
}

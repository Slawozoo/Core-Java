package ooptasklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SearchAndRemove {
	

	public void searchRemove(int size, List<Article> articleList) {	//size of article
		String input;
		System.out.print("Enter the name of author to search: ");
		Scanner scn = new Scanner(System.in);
		input = scn.next();
		for(int i = 0;i < size ;i++) {	//size : size of article list
			List<Author> authorList = articleList.get(i).getAuthorList();
			for(int j = 0; j < authorList.size(); j++) {
				if(authorList.get(j).getName().equalsIgnoreCase(input)) {
					System.out.println("Before removing authors using author name: "
							+articleList.get(i));	//before
					
					//Remove author by name
					authorList.remove(j);
					System.out.println("After Removing author using author name: "+articleList.get(i));	//after
				}
//				else {
//					System.out.println("Article and authors: "
//							+articleList.get(i));
//				}
					
			}
			
		}
			
		}

}

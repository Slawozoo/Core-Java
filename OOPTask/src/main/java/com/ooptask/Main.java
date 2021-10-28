package com.ooptask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the no. of article: ");
		n = sc.nextInt();
		int m;
		System.out.print("Enter the no. of author in the article: ");
		m = sc.nextInt();
		//Author[] author = new Author[m];
		
		
		Article[] article = new Article[n];
//		List<Article> article = new ArrayList<Article>(n);
		for(int i = 0; i < n; i++) {
			 article[i] = new Article(m);
			System.out.print("Title: ");
			//scn.nextLine();
			article[i].setTitle(sc.next());
			
			//Published Date
			System.out.print("Published Date: ");
			String date = sc.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date2=null;
			try {
			    //Parsing the String
			    date2 = dateFormat.parse(date);
			} catch (ParseException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			//System.out.println(date2);
			article[i].setPublishedDate(date2);
			
			//Author
			
			System.out.println("Author: ");
			for(int j =0; j < m;j++) {
				
				Author author1 = new Author();
				System.out.print("\nFirstName: ");
				author1.setfName(sc.next());
				System.out.print("Last Name: ");
				author1.setlName(sc.next());
				System.out.print("Address: ");
				author1.setAddress(sc.next());
				System.out.print("Email: ");
				author1.setEmail(sc.next());
				System.out.print("Institution: ");
				author1.setInstitution(sc.next());
				
				article[i].addAuthor(j, author1);
			}
			
		}
		 for(int i=0;i<n;i++){
		        System.out.print("Title: "+article[i].getTitle()+"\nPublished Date: "+article[i].getPublishedDate()+"\n"+"Author: \n");
		        
		        Author [] authors = article[i].getAuthor();
		        for(int j = 0; j< m ;j++) {
		        	System.out.print("\t->First Name: "+authors[j].getfName()+"\n\t->Last Name: "+ authors[j].getlName()+
		        			"\n\t->Address: "+authors[j].getAddress()+"\n\t->Email: "+authors[j].getEmail()+
		        			"\n\t->Institution: "+authors[j].getInstitution()+"\n\n");
		        }
		 }
		
		

	}

}

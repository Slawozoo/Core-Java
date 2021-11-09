package ooptasklist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n;
		int m;
		
		//user input
		//no of articles : n
		// List<article> articleList = new ArrayList<>(n);
		//loop n
			//Article article = new Article();
			//user input
			//title	article.setTitle();
			//date
			//article.setDate()
		
			//no of authors : m
				//List<Author> authoList = new ArrayList<Author>(m);
				//loop m
					//Author author = new Author();
					//user input
					//first name = author.setFName();
					//..........
					//.......
					//authoList.add(author);
				//
				//article.setAuthorList(authoList);
			//articleList.add(article);
		//end loop
		
		System.out.print("Enter the no. of article: ");
		n = scn.nextInt();
		List<Article> articleList = new ArrayList<Article>(n);
		for(int i = 0;i < n;i++) {
		//for(Article articles: articleList) {
			Article article = new Article();
			System.out.print("\nEnter title of article: ");
			article.setTitle(scn.next());
			
			System.out.print("\nEnter published date: ");
			String date = scn.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date2=null;
			try {
			    //Parsing the String
			    date2 = dateFormat.parse(date);
			} catch (ParseException e) {
			    
			    e.printStackTrace();
			}
			//System.out.println(date2);
			article.setPublishedDate(date2);
			
			//FOr no. of authors in article
//			
			System.out.print("Enter the no. of authors of the article: ");
//			m = scn.nextInt();
			AddAuthorList addAuthors = new AddAuthorList();
			addAuthors.addAuthor();
			
			
			article.setAuthorList(addAuthors.authors);
			
			articleList.add(article);
			
			//article.getAuthorList().indexOf("Abc");	returns object
			//remove
		
			//article.getAuthorList().contains("abc");	//search
		}
		
		
		
		//Searching and Removing using author name
		int sizeArticle = articleList.size();
		SearchAndRemove search = new SearchAndRemove();
		search.searchRemove(sizeArticle, articleList);

		//for object sorting {comparator} author
		sortObjectList sortObject = new sortObjectList();
		sortObject.sortObject(sizeArticle, articleList);
		
	
	}
	

}

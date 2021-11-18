package com.postgresql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Article{
	private String title;
	private Date publishedDate;
	//private Author author;

	private Author[] author;
	//private List <Author> auth = new ArrayList<Author>(); 

	public Article() {
	}
	
	public Article(int m) {
		this.author = new Author[m];
	}

	

	public Article(String title, Date publishedDate, Author[] author) {
		super();
		this.title = title;
		this.publishedDate = publishedDate;
		this.author = author;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date date2) {
		this.publishedDate = date2;
	}

	
	
	public Author[] getAuthor() {
		return author;
	}


	public void addAuthor(int n, Author author) {
		this.author[n] = author;
	}


	public void setAuthor(Author[] author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Article [title=" + title + ", publishedDate=" + publishedDate + ", author=" + Arrays.toString(author)
				+ "]";
	}

	

	

	
}

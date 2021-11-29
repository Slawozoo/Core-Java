package com.webscrappingtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Article {
	private String title;
	private String publishedDate;
	private String authorDescription;
	private String authorName;
	private String authorLink;

	public Article() {

	}

	public Article(String title, String publishedDate, String authorName, String authorLink, String authorDescription) {
		
		this.title = title;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.authorLink = authorLink;
		this.authorDescription = authorDescription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorLink() {
		return authorLink;
	}

	public void setAuthorLink(String authorLink) {
		this.authorLink = authorLink;
	}

	
	
	public String getAuthorDescription() {
		return authorDescription;
	}

	public void setAuthorDescription(String authorDescription) {
		this.authorDescription = authorDescription;
	}

	@Override
	public String toString() {
		return "Article [Title =" + title + ",\nPublishedDate =" + publishedDate + ", \nAuthorDescription ="
				+ authorDescription + ", \nAuthorName =" + authorName + ", \nAuthorLink =" + authorLink + "]\n";
	}

	
}

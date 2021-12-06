package com.finaltask.corejavafinaltask.domain;

import java.util.ArrayList;
import java.util.List;

public class Article {
	private String title;
	private String publishedDate;

	private List<Author> authorList = new ArrayList<Author>();

	public Article() {

	}

	public Article(String title, String publishedDate, List<Author> authorList) {
		super();
		this.title = title;
		this.publishedDate = publishedDate;
		this.authorList = authorList;
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

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", \tpublishedDate=" + publishedDate + ", \tauthorList=" + authorList + "]";
	}

}

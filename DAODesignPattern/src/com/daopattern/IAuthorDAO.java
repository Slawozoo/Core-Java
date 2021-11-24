package com.daopattern;

import java.util.List;

public interface IAuthorDAO {
	
	public void getUserInput(int n);
	public List<Author> getAllAuthor();
	public Author getAuthor(int id);
	public void updateAuthor(Author author, int index);
	public void deleteAuthor(int index);
	
}

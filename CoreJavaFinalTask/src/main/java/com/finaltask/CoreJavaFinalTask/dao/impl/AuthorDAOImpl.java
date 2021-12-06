package com.finaltask.corejavafinaltask.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.finaltask.corejavafinaltask.dao.IAuthorDAO;
import com.finaltask.corejavafinaltask.domain.Article;
import com.finaltask.corejavafinaltask.domain.Author;
import com.finaltask.corejavafinaltask.jdbc.SqlCommands;

public class AuthorDAOImpl implements IAuthorDAO {
	/**
	 *Create Author table
	 */
	public void createAuthorTable(Connection conn) {
		try {
			Statement statement = conn.createStatement();
			statement.execute(SqlCommands.getCreateauthortablesql());
			System.out.println("Author table created sucessfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Read from file and insert into DB  author table
	 */
	public void insertAuthorTable(Connection con, List<Author> authorList, int id, List<Article> articleList) {
		try {
			PreparedStatement authorStatement = con.prepareStatement(SqlCommands.getInsertintoauthortablesql());
			ArticleDaoImpl articleDao = new ArticleDaoImpl();
			int articleId = articleDao.selectIDConditionTitle(con, id, articleList);
			int row;
			for (int i = 0; i < authorList.size(); i++) {
				authorStatement.setString(1, authorList.get(i).getfName());
				authorStatement.setString(2, authorList.get(i).getlName());
				authorStatement.setString(3, authorList.get(i).getAddress());
				authorStatement.setString(4, authorList.get(i).getEmail());
				authorStatement.setString(5, authorList.get(i).getInstitution());
				authorStatement.setInt(6, articleId);

				row = authorStatement.executeUpdate();
				if (row > 0) {
					System.out.println("Inserted author sucessfully");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *Retrieve from author table
	 */
	public void retrieveAuthorTable(Connection con) {
		try {
			Statement statement = con.createStatement();
			// PreparedStatement statement = con.prepareStatement(retrieveAllSQL);
			ResultSet result = statement.executeQuery(SqlCommands.getRetrieveallauthor());
			System.out.println("ID\t\tFName\t\tLName\t\tEmail\t\tAddress\t\tInstitution");
			while (result.next()) {
				int id = result.getInt("id");
				String fName = result.getString("first_name");
				String lName = result.getString("last_name");
				String address = result.getString("address");
				String email = result.getString("email");
				String institution = result.getString("institution");

				System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", id, fName, lName, email, address, institution);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *User input and insert into Author table
	 */
	public void insertAuthorTableSql(Connection con, List<Author> authorList, Article article) {
		try {
			PreparedStatement authorStatement = con.prepareStatement(SqlCommands.getInsertintoauthortablesql());
			ArticleDaoImpl articleDao = new ArticleDaoImpl();
			int articleId = articleDao.selectIDConditionTitle(con, article);
			int row;
			for (int i = 0; i < authorList.size(); i++) {
				authorStatement.setString(1, authorList.get(i).getfName());
				authorStatement.setString(2, authorList.get(i).getlName());
				authorStatement.setString(3, authorList.get(i).getAddress());
				authorStatement.setString(4, authorList.get(i).getEmail());
				authorStatement.setString(5, authorList.get(i).getInstitution());
				authorStatement.setInt(6, articleId);
				row = authorStatement.executeUpdate();
				if (row > 0) {
					System.out.println("Inserted author sucessfully");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *Retrieve author by Article title
	 */
	public void retrieveAuthorTableByTitle(Connection con, int id) {
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(SqlCommands.getRetrieveauthorbyid());
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				int author_id = result.getInt(1);
				String first_name = result.getString(2);
				String last_name = result.getString(3);
				String address = result.getString(4);
				String institution = result.getString(5);
				String email = result.getString(6);
				int article_id = result.getInt(7);

				System.out.println("\n");
				System.out.println("Author ID: " + author_id);
				System.out.println("First Name: " + first_name);
				System.out.println("Last Name: " + last_name);
				System.out.println("Address: " + address);
				System.out.println("Institution: " + institution);
				System.out.println("Email: " + email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *Delete Author using article title
	 */
	public void deleteAuthorByTitle(Connection con, int articleId) {
		try {
			PreparedStatement statement = con.prepareStatement(SqlCommands.getDeleteauthorbyid());
			statement.setInt(1, articleId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *Write Author list into Json Array
	 */
	public JSONArray writeJsonAuthor(List<Author> authorList) {
		JSONArray jsonList = new JSONArray();
		// Creating a JSONObject object
		for (int i = 0; i < authorList.size(); i++) {
			JSONObject jsonObject = new JSONObject();
			// Inserting key-value pairs into the json object
			jsonObject.put("FirstName", authorList.get(i).getfName());
			jsonObject.put("LastName", authorList.get(i).getlName());
			jsonObject.put("Address", authorList.get(i).getAddress());
			jsonObject.put("Email", authorList.get(i).getEmail());
			jsonObject.put("Institution", authorList.get(i).getInstitution());
			jsonList.add(jsonObject);
		}
		return jsonList;
	}

	/**
	 *Generate Author List from Author table
	 */
	public List<Author> generateAuthorList(Connection con, int article_id) {
		List<Author> authorList = new ArrayList<Author>();
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(SqlCommands.getRetrieveauthorbyid());
			statement.setInt(1, article_id);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Author author = new Author();
				int id = result.getInt("id");
				String fName = result.getString("first_name");
				author.setfName(fName);
				String lName = result.getString("last_name");
				author.setlName(lName);
				String address = result.getString("address");
				author.setAddress(address);
				String email = result.getString("email");
				author.setEmail(email);
				String institution = result.getString("institution");
				author.setInstitution(institution);
				authorList.add(author);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return authorList;
	}
}

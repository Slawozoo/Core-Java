package com.finaltask.CoreJavaFinalTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ArticleDaoImpl implements IArticleDao {

	/* Create article table */
	public void createArticleTableSql(Connection conn) {
		// System.out.println(createTableSQL);
		// Step 1: Establishing a Connection
		try {
			// Connection connection = DriverManager.getConnection(url, user, password);

			// Step 2:Create a statement using connection object
			Statement statement = conn.createStatement();

			// Step 3: Execute the query or update query
			statement.execute(SqlCommands.getCreatearticletablesql());

			System.out.println("table created sucessfully");
		} catch (SQLException e) {
			e.printStackTrace();
			// print SQL exception information
			// printSQLException(e);
		}
	}

	/* Insert into table by reading a file */
	public void insertIntoTable(Connection con, List<Article> articleList) {

		try {

			PreparedStatement prepStmt = con.prepareStatement(SqlCommands.getInsertintoarticletablesql());
			for (int i = 0; i < articleList.size(); i++) {
				prepStmt.setString(1, articleList.get(i).getTitle());
				prepStmt.setString(2, articleList.get(i).getPublishedDate());

//				List<Author> authorList = new ArrayList<Author>();
				int rows = prepStmt.executeUpdate();
				if (rows > 0) {
					System.out.println("Inserted data sucessfully");
				}

				// Insert into author table
				AuthorDAOImpl authDAO = new AuthorDAOImpl();
				authDAO.insertAuthorTableSql(con, articleList.get(i).getAuthorList(), i, articleList);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// returns Id of article which will be used to insert or update into author
	// table
	public int selectIDConditionTitle(Connection con, int id, List<Article> articleList) {

		try {
			String titleSearch = articleList.get(id).getTitle();
			// Statement statement = con.createStatement();
			PreparedStatement statement = con.prepareStatement(SqlCommands.getSelectidsql());
			statement.setString(1, titleSearch);

			ResultSet result = statement.executeQuery();

//			System.out.println("ID\tFName\tLName\t\tEmail\t\tAddress\t\tInstitution");
			while (result.next()) {
				id = result.getInt("id");

			}
			// System.out.println(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return id;
	}

	// Searching ID for user input and insert in table
	public int selectIDConditionTitle(Connection con, Article article) {
		int id = 0;
		try {
			String titleSearch = article.getTitle();
			// Statement statement = con.createStatement();
			PreparedStatement statement = con.prepareStatement(SqlCommands.getSelectidsql());
			statement.setString(1, titleSearch);

			ResultSet result = statement.executeQuery();

			while (result.next()) {
				id = result.getInt("id");

			}
			// System.out.println(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	public void retrieveArticleTable(Connection con) {
		try {

			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(SqlCommands.getRetrieveallarticle());
			while (result.next()) {
				int id = result.getInt(1);
				String title = result.getString(2);
				String publishedDate = result.getString(3);

				System.out.println(id + " " + title + " " + publishedDate);
			}
			System.out.println("\n");
			AuthorDAOImpl authorDao = new AuthorDAOImpl();
			authorDao.retrieveAuthorTable(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// insert into table by userinput
	public void insertIntoTable(Connection con) {
		Article article = new Article();
		List<Author> authorList = new ArrayList<Author>();
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter title of article: ");
		article.setTitle(scn.next());
		System.out.print("Enter published date: ");
		article.setPublishedDate(scn.nextLine());
//		article.setPublishedDate("15/10/2019");

		System.out.print("No. of author in the article: ");
		int n = scn.nextInt();
		List<Author> authorLists = new ArrayList<Author>();
		for (int i = 0; i < n; i++) {
			Author author = new Author();
//			article.setAuthorList(authorList);
			System.out.print("Enter first name of author: ");
			author.setfName(scn.next());
			System.out.print("Enter last name of author: ");
			author.setlName(scn.next());
			System.out.print("Enter email of author: ");
			author.setEmail(scn.next());
			System.out.print("Enter address of author: ");
			author.setAddress(scn.next());
			System.out.print("Enter institution of author: ");
			author.setInstitution(scn.next());

			authorList.add(author);
		}
		article.setAuthorList(authorList);

		try {

			PreparedStatement prepStmt = con.prepareStatement(SqlCommands.getInsertintoarticletablesql());
			prepStmt.setString(1, article.getTitle());
			prepStmt.setString(2, article.getPublishedDate());

//				List<Author> authorList = new ArrayList<Author>();
			int rows = prepStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Inserted data sucessfully");
			}
			// Insert into author table
			AuthorDAOImpl authDAO = new AuthorDAOImpl();
			authDAO.insertAuthorTableSql(con, authorList, article);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void retrieveArticleByTitle(Connection con) {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the title of article to be searched: ");
			String titleSearch = scn.next();

			PreparedStatement statement = con.prepareStatement(SqlCommands.getRetrievearitclebytitle());
			statement.setString(1, titleSearch);
			ResultSet result = statement.executeQuery();

			AuthorDAOImpl authorDao = new AuthorDAOImpl();
			while (result.next()) {
				int id = result.getInt(1);
				String title = result.getString(2);
				String publishedDate = result.getString(3);
				System.out.println("ArticleId: " + id);

				System.out.println("Title: " + title);
				System.out.println("Published Date: " + publishedDate);

				authorDao.retrieveAuthorTableByTitle(con, id);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void retrieveArticleByAuthorEmail(Connection con) {
		try {
			AuthorDAOImpl authorDao = new AuthorDAOImpl();
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the email of author to be searched: ");
			String emailSearch = scn.next();

			PreparedStatement statement = con.prepareStatement(SqlCommands.getRetrieveauthorbyemail());
			statement.setString(1, emailSearch);
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				String email = result.getString("institution");
				if (emailSearch.equalsIgnoreCase(email)) {
					int article_id = result.getInt("article_id");
					PreparedStatement statements = con.prepareStatement(SqlCommands.getRetrievearticlebyemail());
					statements.setInt(1, article_id);
					ResultSet results = statements.executeQuery();
					while (results.next()) {
						int id = results.getInt("id");
						String title = results.getString("title");
						String publishedDate = results.getString("published_date");

						System.out.println("ArticleId: " + id);
						System.out.println("Title: " + title);
						System.out.println("Published Date: " + publishedDate);

						authorDao.retrieveAuthorTableByTitle(con, id);
					}
				} else {
					System.out.println("Not found");
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteArticleByTitle(Connection con) {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the title of article to be searched: ");
			String titleSearch = scn.next();

			PreparedStatement statement = con.prepareStatement(SqlCommands.getRetrievearitclebytitle());
			statement.setString(1, titleSearch);
			ResultSet result = statement.executeQuery();

			AuthorDAOImpl authorDao = new AuthorDAOImpl();
			while (result.next()) {
				int id = result.getInt("id");
				authorDao.deleteAuthorByTitle(con, id);

				PreparedStatement prepStatements = con.prepareStatement(SqlCommands.getDeletearticlebytitle());
				prepStatements.setString(1, result.getString("title"));
				prepStatements.executeUpdate();
				System.out.println("Article deleted sucessfully..");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteArticleByAuthorEmail(Connection con) {
		try {
			AuthorDAOImpl authorDao = new AuthorDAOImpl();
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the email of author to be searched: ");
			String emailSearch = scn.next();

			PreparedStatement statement = con.prepareStatement(SqlCommands.getRetrieveauthorbyemail());
			statement.setString(1, emailSearch);
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				String email = result.getString("institution");
				if (emailSearch.equalsIgnoreCase(email)) {
					int article_id = result.getInt("article_id");
					authorDao.deleteAuthorByTitle(con, article_id);

					PreparedStatement statements = con.prepareStatement(SqlCommands.getDeletearticlebyid());
					statements.setInt(1, article_id);
					statements.executeUpdate();
					System.out.println("Article deleted sucessfully..");
				} else {
					System.out.println("Not found");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void writeJsonFIle(List<Article> articleList) {
		//Writing no of articles in json file
				//List<Author> totalAuthorList = new ArrayList<Author>();
				JSONArray jsonArticle = new JSONArray();
				for (int i = 0; i < articleList.size(); i++) {
					JSONObject jsonArticleObject = new JSONObject();
					// Inserting key-value pairs into the json object
					jsonArticleObject.put("Title", articleList.get(i).getTitle());
					jsonArticleObject.put("Published Date", articleList.get(i).getPublishedDate().toString());
					
					List<Author> authorLists= articleList.get(i).getAuthorList();
					//totalAuthorList.addAll(authorLists);
					AuthorDAOImpl authorDao = new AuthorDAOImpl();
					JSONArray jsonAuthor = authorDao.writeJsonAuthor(authorLists);
					jsonArticleObject.put("Authors", jsonAuthor);
			
					jsonArticle.add(jsonArticleObject);	//adding articleObject to jsonArticle array list
					}
				
				JSONObject articleObject = new JSONObject();
				articleObject.put("Article", jsonArticle);

				try {
					FileWriter file1 = new FileWriter("AutherFile.json");
					file1.write(articleObject.toJSONString());
					file1.close();
					// System.out.println(jsonObject);
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println("JSON file created: \n" + jsonArticle);
				
		
	}

	public List<Article> generateArticle(Connection con) {
		List<Article> articleList = new ArrayList<Article>();
		
		
		try {
			Statement statement = con.createStatement();
			
			ResultSet result = statement.executeQuery(SqlCommands.getRetrieveallarticle());
			while (result.next()) {
				Article article = new Article();
				int id = result.getInt(1);
				
				String title = result.getString(2);
				article.setTitle(title);
				
				String publishedDate = result.getString(3);
				article.setPublishedDate(publishedDate);
				
				AuthorDAOImpl authorDao = new AuthorDAOImpl();
				List<Author> authorList = authorDao.generateAuthorList(con, id);
				
				article.setAuthorList(authorList);
				
				articleList.add(article);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleList;
	}

}

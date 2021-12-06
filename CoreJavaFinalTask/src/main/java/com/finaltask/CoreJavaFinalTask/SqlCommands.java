package com.finaltask.CoreJavaFinalTask;

public class SqlCommands {

	//Create table command
	private static final String createArticleTableSQL = "Create Table Article"+"(id INT  NOT NULL PRIMARY KEY ,"
			+ " title TEXT NOT NULL, " + " published_date TEXT NOT NULL )" ;
	
	private static final String createAuthorTableSQL = "CREATE TABLE Author " + "(id INT  NOT NULL PRIMARY KEY ,"
			+ " first_name TEXT NOT NULL, " + " last_name TEXT NOT NULL, " + " address TEXT NOT NULL, "
			+ " institution TEXT NOT NULL, " + " email TEXT NOT NULL,"+" article_id INT REFERENCES Article(id) )";
	
	
	//insert into article table command
		private static final String  insertIntoArticleTableSQL = "INSERT INTO article(title, published_date )"
				+ "VALUES(?,?)";
		
		//insert into author table command
		private static final  String insertIntoAuthorTableSQL = "INSERT INTO Author(first_name, last_name, address,  institution, email,article_id)"
						+ "VALUES(?,?,?,?,?,?)";

		//Select article title from article
		private static final String selectIDSQL = "SELECT id FROM article where title = ?";
		
		//Select all from article
		private static final String retrieveAllArticle = "SELECT * FROM ARTICLE";
		
		//Select all from author
		private static final String retrieveAllAuthor = "SELECT * FROM Author";
		
		//Select article and author using article title
		private static final String retrieveAritcleByTitle = "Select * from article where title = ?";
		
		//Select author using articleid
		private static final String retrieveAuthorByTitle = "Select * from author where article_id =?";
		
		//Select author using authoremail
		private static final String retrieveAuthorByEmail = "Select * from author where institution = ?";
		
		private static final String retrieveArticleByEmail = "Select * from article where id = ?";
		
		private static final String deleteAuthorByTitle = "DELETE From author where article_id =?";
		
		private static final String deleteArticleByTitle = "Delete from article where title = ?";
		
		private static final String deleteArticleById = "Delete from article where id = ?";
		
		public static String getDeletearticlebyid() {
			return deleteArticleById;
		}

		public static String getDeletearticlebytitle() {
			return deleteArticleByTitle;
		}

		public static String getDeleteauthorbytitle() {
			return deleteAuthorByTitle;
		}

		public static String getRetrievearticlebyemail() {
			return retrieveArticleByEmail;
		}

		public static String getRetrieveauthorbyemail() {
			return retrieveAuthorByEmail;
		}

		public static String getRetrieveauthorbytitle() {
			return retrieveAuthorByTitle;
		}

		public static String getRetrievearitclebytitle() {
			return retrieveAritcleByTitle;
		}

		public static String getRetrieveallauthor() {
			return retrieveAllAuthor;
		}

		public static String getCreatearticletablesql() {
			return createArticleTableSQL;
		}

		public static String getCreateauthortablesql() {
			return createAuthorTableSQL;
		}

		public static String getInsertintoarticletablesql() {
			return insertIntoArticleTableSQL;
		}

		public static String getInsertintoauthortablesql() {
			return insertIntoAuthorTableSQL;
		}

		public static String getSelectidsql() {
			return selectIDSQL;
		}

		public static String getRetrieveallarticle() {
			return retrieveAllArticle;
		}

		
		
		
		
}

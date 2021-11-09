package oopfiletask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException{
		Scanner scn = new Scanner(System.in);
		int n;
		int m;
		File file = new File("authors.json");	//Json file where all written output stored
		
		System.out.print("Enter the no. of article: ");
		n = scn.nextInt();
		List<Article> articleList = new ArrayList<Article>(n);
		
		ArticleUtils articleUtil = new ArticleUtils();
		articleUtil.addArticle(n, articleList);
		
//		for(int i = 0;i < n;i++) {
//		//for(Article articles: articleList) {
//			Article article = new Article();
//			System.out.print("\nEnter title of article: ");
//			article.setTitle(scn.next());
//			
//			System.out.print("\nEnter published date: ");
//			String date = scn.next();
//			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//			Date date2=null;
//			try {
//			    //Parsing the String
//			    date2 = dateFormat.parse(date);
//			} catch (ParseException e) {
//			    
//			    e.printStackTrace();
//			}
//			//System.out.println(date2);
//			article.setPublishedDate(date2);
//			
//			//FOr no. of authors in article
//			
//			System.out.print("Enter the no. of authors of the article: ");
//			//m = scn.nextInt();
//			
//			AuthorUtils addAuthors = new AuthorUtils();
//			addAuthors.addAuthor();
//			
//			article.setAuthorList(addAuthors.authors);
//			
//			articleList.add(article);
//			
//			//article.getAuthorList().indexOf("Abc");	returns object
//			//remove
//		
//			//article.getAuthorList().contains("abc");	//search
//		}
		
		
		JSONArray jsonArticle = articleUtil.generateArticleJson(articleList,file);
		
//		//Writing no of articles in json file
//		List<Author> totalAuthorList = new ArrayList<Author>();
//		JSONArray jsonArticle = new JSONArray();
//		for (int i = 0; i < articleList.size(); i++) {
//			JSONObject jsonArticleObject = new JSONObject();
//			// Inserting key-value pairs into the json object
//			jsonArticleObject.put("Title", articleList.get(i).getTitle());
//			jsonArticleObject.put("Published Date", articleList.get(i).getPublishedDate().toString());
//			
//			
//			List<Author> authorLists= articleList.get(i).getAuthorList();
//			totalAuthorList.addAll(authorLists);
//			JSONArray jsonAuthor = AuthorUtils.generateAuthorJson(authorLists);
//			jsonArticleObject.put("Authors", jsonAuthor);
//			
//
//			//
//			
//			jsonArticle.add(jsonArticleObject);	//adding articleObject to jsonArticle array list
//			
//		}
		
		
//		JSONObject articleObject = new JSONObject();
//		articleObject.put("Article", jsonArticle);
//		JSONArray jsonTotalAuthor = AuthorUtils.generateAuthorJson(totalAuthorList);
//		AuthorUtils.writeJsonFile(jsonTotalAuthor,new File( "AutherFile.json"));
//		try {
//			FileWriter file1 = new FileWriter(file);
//			file1.write(articleObject.toJSONString());
//			file1.close();
//			// System.out.println(jsonObject);
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//		System.out.println("JSON file created: \n" + jsonArticle);
//		
//		//Endof writing in the file
		
		
		
		//Start of reading JSON file
		articleUtil.readFile(file);
//		ReadJSONFile readFile = new ReadJSONFile();
//		readFile.readFile(file);
	
	}
	

}

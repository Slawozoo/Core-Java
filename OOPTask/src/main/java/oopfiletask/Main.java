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
		
		//User input in the article list
//		articleUtil.addArticle(n, articleList);
		
		
		//Write n no. of articles in json file
		JSONArray jsonArticle = articleUtil.generateArticleJson(articleList,file);
		

		//Start of reading JSON file
		articleUtil.readFile(file);
//		ReadJSONFile readFile = new ReadJSONFile();
//		readFile.readFile(file);
	
	}
	

}

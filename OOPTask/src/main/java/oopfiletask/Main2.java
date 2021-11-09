package oopfiletask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main2{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException{
		Scanner scn = new Scanner(System.in);
		int n;
		int m;
		File file = new File("auth.json");	//Json file where all written output stored
		
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
			
			System.out.print("Enter the no. of authors of the article: ");
			m = scn.nextInt();
			
			AuthorUtils addAuthors = new AuthorUtils();
			addAuthors.addAuthor();
			
			article.setAuthorList(addAuthors.authors);
			
			articleList.add(article);
			
			//article.getAuthorList().indexOf("Abc");	returns object
			//remove
		
			//article.getAuthorList().contains("abc");	//search
		}
		
		//Writing no of articles in json file
		List<Author> totalAuthorList = new ArrayList<Author>();
		JSONArray jsonArticle = new JSONArray();
		for (int i = 0; i < articleList.size(); i++) {
			JSONObject jsonArticleObject = new JSONObject();
			// Inserting key-value pairs into the json object
			jsonArticleObject.put("Title", articleList.get(i).getTitle());
			jsonArticleObject.put("Published Date", articleList.get(i).getPublishedDate().toString());
			
			
			List<Author> authorLists= articleList.get(i).getAuthorList();
			totalAuthorList.addAll(authorLists);
			JSONArray jsonAuthor = AuthorUtils.generateAuthorJson(authorLists);
			jsonArticleObject.put("Authors", jsonAuthor);
			

			//
			
			jsonArticle.add(jsonArticleObject);	//adding articleObject to jsonArticle array list
			
		}
		JSONObject articleObject = new JSONObject();
		articleObject.put("Article", jsonArticle);
		JSONArray jsonTotalAuthor = AuthorUtils.generateAuthorJson(totalAuthorList);
		AuthorUtils.writeJsonFile(jsonTotalAuthor,new File( "AutherFile.json"));
		try {
			FileWriter file1 = new FileWriter(file);
			file1.write(articleObject.toJSONString());
			file1.close();
			// System.out.println(jsonObject);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("JSON file created: \n" + jsonArticle);
		
		//Endof writing in the file
		
		
		
		//Start of reading JSON file
		
//		//JSON parser object to parse read file
		//InputStreamReader isr = new InputStreamReader();
		//BufferedReader buffReader = new BufferedReader(new InputStreamReader(null) );
        JSONParser jsonParser = new JSONParser();
        Object obj;
        try 
        {	
        	FileReader reader = new FileReader(file);
            //Read JSON file
             obj= jsonParser.parse(reader);

            //Object obj = jsonParser.parse(reader);
            JSONObject articlesObject = (JSONObject) obj;
            JSONArray articleJSONList = (JSONArray) articlesObject.get("Article");
            //articleJSONList.add(obj);
           
             
            //Iterate over employee array
            //employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
            //for(int i =0; i< n;i++) {	
            Iterator itr = articleJSONList.iterator();
            while(itr.hasNext()) {
            	Object ob = itr.next();
            	JSONObject articleObjects = (JSONObject) ob;
            	//Get title of article
                String title = (String) articleObjects.get("Title");    
                System.out.println(title);
                
              //Get published date
                String date = (String) articleObjects.get("Published Date");    
                System.out.println(date);
                
                //Get authorlist from article
                //JSONArray authArray = (JSONArray) articleObject.get("Author");  
                
               
                JSONArray authArray = (JSONArray) articleObjects.get("Authors");
                
                Iterator iter = authArray.iterator();
                while(iter.hasNext()) {
                	
                	Object object = iter.next();
                	JSONObject authorObject = (JSONObject) object;
                	
                	//Get name of author
                    String name = (String) authorObject.get("Name");    
                    System.out.println(name);
                  //Get address of author
                    String address = (String) authorObject.get("Address");    
                    System.out.println(address);
                  //Get institution of author
                    String institution = (String) authorObject.get("institution");    
                    System.out.println(institution);
                  //Get email of author
                    String email = (String) authorObject.get("Email");    
                    System.out.println(email);
                  
                }
                //System.out.println(articleJSONList);
            	
            }
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	

}

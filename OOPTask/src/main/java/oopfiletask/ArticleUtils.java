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

@SuppressWarnings("unchecked")
public class ArticleUtils implements IArticleOperations{
	
	
	public void addArticle(int n, List<Article> articleList) {
	for(int i = 0;i < n;i++) {
		Scanner scn = new Scanner(System.in);
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
			//m = scn.nextInt();
			
			AuthorUtils addAuthors = new AuthorUtils();
			addAuthors.addAuthor();
			
			article.setAuthorList(addAuthors.authors);
			
			articleList.add(article);
			
			//article.getAuthorList().indexOf("Abc");	returns object
			//remove
		
			//article.getAuthorList().contains("abc");	//search
	}
	
	}
	
	@Override
	public JSONArray generateArticleJson(List<Article> articleList, File file) {
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
			

			jsonArticle.add(jsonArticleObject);	//adding articleObject to jsonArticle array list
			
		}
		
		JSONObject articleObject = new JSONObject();
		articleObject.put("Article", jsonArticle);
		JSONArray jsonTotalAuthor = AuthorUtils.generateAuthorJson(totalAuthorList);
		
		AuthorUtils.writeJsonFile(jsonTotalAuthor,new File( "AutherFile.json"));
		//public static void writeJsonFile(JSONArray jsonArticle, File file) {
		try {
			FileWriter file1 = new FileWriter(file);
			file1.write(articleObject.toJSONString());
			file1.close();
			// System.out.println(jsonObject);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("JSON file created: \n" + jsonArticle);
		
			
		return jsonArticle;
	}
	/*end of writing in the file*/
	
	/*Starting of reading json file*/
	@Override
	public void readFile(File file) throws ParseException, org.json.simple.parser.ParseException {
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
            	System.out.println("Article: ");
                String title = (String) articleObjects.get("Title");    
                System.out.println("Title: "+title);
                
              //Get published date
                String date = (String) articleObjects.get("Published Date");    
                System.out.println("Published Date: "+date);
                
                //Get authorlist from article
                //JSONArray authArray = (JSONArray) articleObject.get("Author");  
                
               System.out.println("Author: ");
                JSONArray authArray = (JSONArray) articleObjects.get("Authors");
                
                Iterator iter = authArray.iterator();
                while(iter.hasNext()) {
                	
                	Object object = iter.next();
                	JSONObject authorObject = (JSONObject) object;
                	
                	//Get name of author
                    String name = (String) authorObject.get("Name");    
                    System.out.println("\t\tName: "+name);
                  //Get address of author
                    String address = (String) authorObject.get("Address");    
                    System.out.println("\t\tAddress: "+address);
                  //Get institution of author
                    String institution = (String) authorObject.get("institution");    
                    System.out.println("\t\tInstitution: "+institution);
                  //Get email of author
                    String email = (String) authorObject.get("Email");    
                    System.out.println("\t\tEmail: "+email);
                    System.out.println("\n");
                  
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

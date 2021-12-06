package com.finaltask.corejavafinaltask.dao.impl;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.finaltask.corejavafinaltask.dao.*;
import com.finaltask.corejavafinaltask.domain.*;
public class ArticleOperationsImpl implements IArticleOperations{

	//Read Json File
	public List<Article> readFile(File file) throws ParseException, org.json.simple.parser.ParseException {
		
		JSONParser jsonParser = new JSONParser();
        Object obj;
        List<Article> articleList = new ArrayList<Article>();
        try 
        {	
        	FileReader reader = new FileReader(file);
            //Read JSON file
             obj= jsonParser.parse(reader);

            //Object obj = jsonParser.parse(reader);
            JSONObject articlesObject = (JSONObject) obj;
            JSONArray articleJSONList = (JSONArray) articlesObject.get("Article");
            //articleJSONList.add(obj);
           
            Iterator itr = articleJSONList.iterator();
            while(itr.hasNext()) {
            	Article article = new Article();
            	Object ob = itr.next();
            	JSONObject articleObjects = (JSONObject) ob;
            	//Get title of article
            	//System.out.println("Article: ");
                String title = (String) articleObjects.get("Title");
                article.setTitle(title);
                //System.out.println("Title: "+title);
                
              //Get published date
                String date = (String) articleObjects.get("Published Date");   
                article.setPublishedDate(date);
                //System.out.println("Published Date: "+date);
                
               //System.out.println("Author: ");
                JSONArray authArray = (JSONArray) articleObjects.get("Authors");
                
                List<Author> authorList = new ArrayList<Author>();
                Iterator iter = authArray.iterator();
                while(iter.hasNext()) {
                	Author author = new Author();
                	Object object = iter.next();
                	JSONObject authorObject = (JSONObject) object;
                	
                	//Get name of author
                    String name = (String) authorObject.get("Name");
                    //author.setName(fname, lname);
                    //System.out.println("\t\tName: "+name);
                  //Get first name of author
                    String firstName = (String) authorObject.get("FirstName"); 
                    author.setfName(firstName);
                    //System.out.println("\t\tFirst Name: "+firstName);
                  //Get last name of author
                    String lastName = (String) authorObject.get("LastName");   
                    author.setlName(lastName);
                    //System.out.println("\t\tLast Name: "+ lastName);
                  //Get address of author
                    String address = (String) authorObject.get("Address");
                    author.setAddress(address);
                    //System.out.println("\t\tAddress: "+address);
                  //Get institution of author
                    String institution = (String) authorObject.get("Institution");
                    author.setInstitution(institution);
                    //System.out.println("\t\tInstitution: "+institution);
                  //Get email of author
                    String email = (String) authorObject.get("Email");
                    author.setEmail(email);
                    //System.out.println("\t\tEmail: "+email);
                    //System.out.println("\n");
                    
                    authorList.add(author);
                  
                }
                //System.out.println(articleJSONList);
                article.setAuthorList(authorList);
                articleList.add(article);
            }
          
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return articleList;
	}

}

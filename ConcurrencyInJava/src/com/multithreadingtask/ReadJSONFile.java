package com.multithreadingtask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile {

	public void readFile(File file) throws ParseException {
		//System.out.println();
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
                    String institution = (String) authorObject.get("Institution");    
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

package oopfiletask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MainReadJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException {
		
		File file = new File("author.json");
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try 
        {
        	FileReader reader = new FileReader(file);
            //Read JSON file
            //Object obj = jsonParser.parse(reader);
        	JSONObject jsonObject = new JSONObject();

            Object obj = jsonParser.parse(reader);
            JSONArray authorList = new JSONArray();
            authorList.add(obj);
            
            //JSONArray employeeList = (JSONArray) obj;
            //System.out.println(authorList);
             
            //Iterate over employee array
           // authorList.forEach( auth -> parseAuthorObject( (JSONObject) auth ) );
            
            //JSONArray remarks = (JSONArray) jsonObject.get("remarks");
            //converting the JSONObject into JSONArray as remark was an array.
            Iterator<Author> iterator = authorList.iterator();
            //Iterator is used to access the each element in the list 
            //loop will continue as long as there are elements in the array.
            while (iterator.hasNext()) {
                //parseAuthorObject((JSONObject)auth);
            	System.out.println(iterator.next());
                //accessing each elemnt by using next function.
            }
            
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
//	private static void parseAuthorObject(JSONObject auth) 
//    {
//        //Get author object within list
//        JSONObject authorObject = (JSONObject) auth.get("Author");
//         
//      //Get name of author
//        String name = (String) authorObject.get("Name");    
//        
//        System.out.println(name);
//        
//        //Get author first name
//        String firstName = (String) authorObject.get("FirstName");    
//        System.out.println(firstName);
//         
//        //Get author last name
//        String lastName = (String) authorObject.get("LastName");  
//        System.out.println(lastName);
//         
//        //Get author email
//        String email = (String) authorObject.get("Email");    
//        System.out.println(email);
//        
//      //Get author address
//        String address = (String) authorObject.get("Address");    
//        System.out.println(address);
//        
//      //Get author institution
//        String institution = (String) authorObject.get("Institution");    
//        System.out.println(institution);
//    }

}

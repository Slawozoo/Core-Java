package lambdafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class MainReadJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {
		
		File file = new File("authors.json");
		 //JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
        Object obj;
         
        try 
        {
        	List<Author> authorList = new ArrayList<>();
        	
        	
        	FileReader reader = new FileReader(file);
            //Read JSON file
             obj= jsonParser.parse(reader);

            JSONObject authorsObject = (JSONObject) obj;
            JSONArray authorJSONList = (JSONArray) authorsObject.get("Author");
            
            //employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
            //for(int i =0; i< n;i++) {	
            Iterator itr = authorJSONList.iterator();
            System.out.println("Author: ");
            //loop will continue as long as there are elements in the array.
            while (itr.hasNext()) {
            	Author auth = new Author();
            	Object object = itr.next();
            	JSONObject authorObject = (JSONObject) object;
            	
            	//Get first name of author
                String fName = (String) authorObject.get("FirstName"); 
                auth.setfName(fName);
                System.out.println("\t\tFirst Name: "+fName);
            	
            	//Get last name of author
                String lName = (String) authorObject.get("LastName"); 
                auth.setlName(lName);
                System.out.println("\t\tLast Name: "+lName);
                
              //Get name of author
                String name = (String) authorObject.get("Name"); 
                auth.setName(fName, lName);
                System.out.println("\t\tName: "+name);
             
                //Get address of author
                String address = (String) authorObject.get("Address");    
                auth.setAddress(address);
                System.out.println("\t\tAddress: "+address);
              
                //Get institution of author
                String institution = (String) authorObject.get("institution");    
                auth.setInstitution(institution);
                System.out.println("\t\tInstitution: "+institution);
              
                //Get email of author
                String email = (String) authorObject.get("Email");    
                auth.setEmail(email);
                System.out.println("\t\tEmail: "+email);
                System.out.println("\n");
            	
            	//System.out.println(itr.next());
                authorList.add(auth);
                
            }
            
            //Author name to search
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the name of author to be searched: ");
            String searchAuthor = scn.next();
            
          //using lambda to filter data  
          Stream<Author> filtered_data = authorList.stream().filter(author -> author.getName().equalsIgnoreCase(searchAuthor));  
            
          // using lambda to iterate through collection  
          filtered_data.forEach(  
                  author -> System.out.println("Sucessfully found Author..\nAuthor Name: "+author.getName())  
          );  
          
//            
//            for(int i =0; i< authorList.size(); i++) {
//            	if(str.equalsIgnoreCase(authorList.get(i).getName())){
//            		System.out.println("Found: "+authorList.get(i).getName());
//            	}
//            	else {
//            		
//            	}
//            }
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFile {

	@SuppressWarnings("unchecked")
    public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("employees.json"))
        {
            //Read JSON file
            //Object obj = jsonParser.parse(reader);

            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = new JSONArray();
            employeeList.add(obj);
            
            //JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject emp) 
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) emp.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");    
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName");  
        System.out.println(lastName);
         
        //Get employee website name
        String website = (String) employeeObject.get("website");    
        System.out.println(website);
    }

}

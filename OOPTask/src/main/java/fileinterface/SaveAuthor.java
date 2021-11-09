package fileinterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


@SuppressWarnings("unchecked")
public class SaveAuthor implements FileWriteInterface {

	@Override
	public void doSaveAuthor(int n, File file, JSONArray jsonList, List<Author> authList) {
		
		// Json started from here
				//JSONArray jsonList = jsonList;
				// Creating a JSONObject object
				for (int i = 0; i < n; i++) {
					JSONObject jsonObject = new JSONObject();
					// Inserting key-value pairs into the json object
					jsonObject.put("Name", authList.get(i).getName());
					jsonObject.put("FirstName", authList.get(i).getfName());
					jsonObject.put("LastName", authList.get(i).getlName());
					jsonObject.put("Address", authList.get(i).getAddress());
					jsonObject.put("Email", authList.get(i).getEmail());
					jsonObject.put("Institution", authList.get(i).getInstitution());

					JSONObject authorObject = new JSONObject();
					authorObject.put("Author", jsonObject);

					jsonList.add(authorObject);

				}

				try {
					FileWriter file1 = new FileWriter(file);
					file1.write(jsonList.toJSONString());
					file1.close();
					// System.out.println(jsonObject);
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println("JSON file created: " + jsonList);
	}

}
